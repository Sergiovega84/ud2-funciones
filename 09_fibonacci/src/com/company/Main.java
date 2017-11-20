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

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce valor: ");
        int x = Integer.parseInt(br.readLine());

        System.out.println(fibonacciRecursivo(x));






    }
}
