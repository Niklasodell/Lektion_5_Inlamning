package com.Niklas.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean skaSluta = true;

        do {
            System.out.println("Skriv vad som: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                skaSluta = false;

            }else {
                System.out.println("Du skrev: " + input);

            }

        }while (skaSluta);
    }
}