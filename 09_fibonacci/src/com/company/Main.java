package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class Main {

    public static int fibonacciRecursivo (int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
        }
    }

    public static int fibonacciRepetitivo (int n) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            c = b + a;
            a = b;
            b = c;
        }

        return a;
    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce valor: ");
        int x = Integer.parseInt(br.readLine());

        System.out.println(fibonacciRecursivo(x));
        System.out.println(fibonacciRepetitivo(x));






    }
}
