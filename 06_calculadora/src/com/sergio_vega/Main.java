package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double longitud(double r) {
        return 2 * Math.PI * r;
    }
    public static double area(double r) {
        return Math.PI * Math.pow(r, 2);
    }
    public static double volumen(double r) {
        return 4/3*Math.PI*Math.pow(r,3);
    }

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char opcion;

        System.out.println("introduce valor del radio: ");

        do {
            System.out.print("=== Calculadora ===\n" +
                    "a) Longitud de la circunferencia\n" +
                    "b) Área del círculo\n" +
                    "c) Volumen de la esfera\n" +
                    "d) Salir\n" +
                    "Opción: ");
            opcion = br.readLine().toLowerCase().charAt(0);

            double radio = 0;

            if (opcion == 'a' || opcion == 'b' || opcion == 'c') {
                System.out.println("introduce valor del radio: ");
                radio = Double.parseDouble(br.readLine());
            }

            switch (opcion) {
                case 'a':
                    System.out.format("La longitud de la circunferencia es: %.3f\n", longitud(radio));

                    break;
                case 'b':
                    System.out.format("El area del circulo es: %.3f\n", area(radio));
                    break;
                case 'c':
                    System.out.format("El volumen de la esfera es: %.3f\n", volumen(radio));
                    break;
                case 'd':
                    break;
                default:
                    System.out.println("Opción incorrecta \n");
            }
        } while (opcion != 'd');


    }
}
