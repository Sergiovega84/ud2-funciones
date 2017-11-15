package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int interativo (int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r *= i;
        }
        return r;
    }
    public static int factorial (int n) {
       if (n > 0) {
           return factorial(n-1) * n;
        } else {
           return 1;
       }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introdduce valor: ");
        int n = Integer.parseInt(br.readLine());
        System.out.println(interativo(n));
        System.out.println(factorial(n));

    }
}
