package com.sergio_vega;

public class Main {

    public static boolean esValido (String IBAN) {

        IBAN = IBAN.replaceAll("\\s+", "");

        String cuatroprimeros = IBAN.substring (0,4);

        String restoCadena = IBAN.substring(4);

        String nuevoIBAN = restoCadena + cuatroprimeros;

        int numero1 = "ABCDEFGHIJKLMNOPQRSTUVWXZ".indexOf(cuatroprimeros.charAt(0)) + 10;
        int numero2 = "ABCDEFGHIJKLMNOPQRSTUVWXZ".indexOf(cuatroprimeros.charAt(1)) + 10;

        nuevoIBAN = restoCadena + numero1 + numero2 + cuatroprimeros.substring(2);

        long numero = Long.parseLong(nuevoIBAN);

        return numero % 97 == 1;
    }


    public static void main(String[] args) {

        if (esValido( "ES98 2038 5778 9830 0076 0236")) {
            System.out.println("IBAN valido");
        }else {
            System.out.println("IBAN no vállido");
        }
    }
}
