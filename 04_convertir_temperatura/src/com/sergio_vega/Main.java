package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class Main {
    public static double convertirTemperatura(double a) {
        double resultado = a * 1.8 + 32;
        return resultado;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        out.print("introduzca grados centígrados ");
        double a = Double.parseDouble(br.readLine());
        double resultado = convertirTemperatura(a);
        out.print(a + " grados centigradosgrados son " + resultado + " grados Fahrenheit");


    }
}
