package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("//1.задача");
        System.out.println(exercise1(Main.arrayexercise1()));


        System.out.println("//2.задача");
        exercise2(69, 3);
        System.out.println();
        exercise2(68, 3);


        System.out.println(" //3.задача");
        exercise3();

        System.out.println(" //4.задача");
        exercise4();
    }

    public static void exercise4() {
        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {2, 4, 7, 8, 9};
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, r = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[r] = arr1[i];
                i++;
            } else {
                result[r] = arr2[j];
                j++;
            }
            r++;
        }
        if (i < arr1.length) {
            System.arraycopy(arr1, i, result, r, (arr1.length - i));
        }
        if (j < arr2.length) {
            System.arraycopy(arr2, j, result, r, (arr2.length - j));
        }
        System.out.println(Arrays.toString(result));
    }

    public static void exercise3() {
        int a = 0;
        int a1 = 1;
        int b = 2 - a;
        int b1 = 2 - a1;
        System.out.println("Если а = 0,то b = " + b);
        System.out.println("Если a = 1,то b = " + b1);
    }

    public static void exercise2(int x, int y) {
        int div = 0;
        while (x >= y) {
            x -= y;
            div++;
        }
        if (x == 0) {
            System.out.print(div);

        } else {
            System.out.println("Есть остаток");
        }
    }


    public static int exercise1(int[][] a) {
        int sumMD = 0;
        for (int i = 0; i < (Math.min(a[0].length, a.length)); i++) {
            sumMD += a[i][a[0].length - i - 1];
        }
        System.out.print("Сумма диагонали = ");

        return sumMD;
    }

    public static int[][] arrayexercise1() {
        int[][] a = new int[5][5];
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt(10) + 1;
            }
        }
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }

        }
        return a;
    }

}


