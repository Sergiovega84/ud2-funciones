package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static double calcularCambio (double a, double b) {
        double r = a * b;
        return r;
    }

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce cantidad en euros: ");
        double a = Double.parseDouble(br.readLine());
        System.out.println("Introduce moneda a la que convertir: ");
        String m = br.readLine();
        double b = 0.00;
        double r = 0.00;

        switch (m) {
            case "USD":
                b = 1.16;
                r = calcularCambio(a,b);
                System.out.println("El valor de " +a+ " euros es " +r+ " dolares. ");
                break;
            case "GBP":
                b = 0.88;
                r = calcularCambio(a,b);
                System.out.println("El valor de " +a+ " euros es " +r+ " libras.");
                break;
            case "CNY":
                b = 7.70;
                r = calcularCambio(a,b);
                System.out.println("El valor de " +a+ " euros es " +r+ " yuanes. ");
                break;
            case "JPY":
                b = 132.03;
                r = calcularCambio(a,b);
                System.out.print("El valor de " +a+ " euros es " +r+ " yenes. ");
                break;
            default:
                System.out.println("Moneda introducida no es válida");
                break;
        }

    }
}
