package com.sergiovega.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String codigoMorse (String letra) {
    if (letra.equalsIgnoreCase("STOP")) {
        return "Fin de programa";
    } else return letra
            .replaceAll("A", ".-").replaceAll("a", ".-")
            .replaceAll("B", "-...").replaceAll("b", "-...")
            .replaceAll("C", "").replaceAll("c", "")
            .replaceAll("D", "d").replaceAll("d", "")
            .replaceAll("E", "").replaceAll("e", "")
            .replaceAll("F", "").replaceAll("f", "")
            .replaceAll("G", "").replaceAll("g", "")
            .replaceAll("H", "").replaceAll("h", "")
            .replaceAll("I", "").replaceAll("i", "")
            .replaceAll("L", "").replaceAll("j", "")
            .replaceAll("K", "").replaceAll("k", "")
            .replaceAll("L", "").replaceAll("l", "")
            .replaceAll("M", "").replaceAll("m", "")
            .replaceAll("N", "").replaceAll("n", "")
            .replaceAll("O", "").replaceAll("o", "")
            .replaceAll("P", "").replaceAll("p", "")
            .replaceAll("Q", "").replaceAll("q", "")
            .replaceAll("R", "").replaceAll("r", "")
            .replaceAll("S", "").replaceAll("s", "")
            .replaceAll("T", "").replaceAll("t", "")
            .replaceAll("U", "").replaceAll("u", "")
            .replaceAll("V", "").replaceAll("v", "")
            .replaceAll("W", "").replaceAll("w", "")
            .replaceAll("X", "").replaceAll("x", "")
            .replaceAll("Y", "").replaceAll("y", "")
            .replaceAll("Z", "--..").replaceAll("z", "")
            .replaceAll("0", "-----")
            .replaceAll("1", ".----")
            .replaceAll("2", "..---")
            .replaceAll("3", "...--")
            .replaceAll("4", ".----")
            .replaceAll("5", ".....")
            .replaceAll("6", "-....")
            .replaceAll("7", "--...")
            .replaceAll("8", "---..")
            .replaceAll("9", "----.")
            .replaceAll(".", ".-.-.-")
            .replaceAll(",", "-.-.--")
            .replaceAll("!", "--..--");



    }



    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String palabra;
        do {
            System.out.println("Escribe palaba o STOP para salir: ");
            palabra = br.readLine();
            System.out.println(codigoMorse(palabra));
        }while (!palabra.equalsIgnoreCase("STOP"));
    }
}
