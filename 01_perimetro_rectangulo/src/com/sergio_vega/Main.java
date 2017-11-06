package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int perimetroRectangulo(int b, int a) {
        int r = (2 * b) + (2 * a);
        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("introduce base: ");
        int b = Integer.parseInt(br.readLine());
        System.out.print("introduce altura: ");
        int a = Integer.parseInt(br.readLine());
        int r = perimetroRectangulo(b, a);
        System.out.println("el perímetro del rectangulo es " + r);

    }

}
