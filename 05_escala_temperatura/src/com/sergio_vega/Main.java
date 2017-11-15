package com.sergio_vega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static double convertirTemperatura (double t, char escala) {
        if (escala == 1) {
            return t * 1.8 + 32;
        } else {
            return t + 273.15;
        }
        }

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int opcion;
        do {
            System.out.println("     ");
            System.out.println("=== Temperaturas ===\n" +
                    "1. Convertir a Fahrenheit\n" +
                    "2. Convertir a Kelvin\n" +
                    "3. Salir\n" +
                    "Opción: ");
            opcion = Integer.parseInt(br.readLine());
            double temperatura = 0;
            if (opcion != 3 && opcion <4) {
                System.out.print("Introduce temperatura en ºC: ");
                temperatura = Double.parseDouble(br.readLine());
        }
        switch (opcion) {
            case 1:
                System.out.print(" el resustado es: " +convertirTemperatura(temperatura, 'F'));
                System.out.println("     ");
                break;
            case 2:
                System.out.print("El resultado es: " +convertirTemperatura(temperatura, 'K'));
                System.out.println("      ");
                break;
         }
        } while (opcion != 3);

    }
}

