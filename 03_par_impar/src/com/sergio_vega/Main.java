package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int espar(int a) {
        if (a % 2 == 0) {
            System.out.println("el número es par ");
        }
        return a;
    }

    public static int esimpar(int a) {
        if (a % 2 != 0) {
            System.out.println("el número es impar ");
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("introduce número: ");
        int a = Integer.parseInt(br.readLine());
        a = espar(a);
        a = esimpar(a);
    }
}
