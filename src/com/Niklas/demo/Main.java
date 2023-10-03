package com.Niklas.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean skaSluta = true;

        do {
            System.out.println("Ange ett av följande alternativ: 1 eller stop ");
            String input = scan.nextLine();

            switch (input.toLowerCase()) {
                case "1":
                    System.out.println("Throwing!");
                    break;
                case "stop":
                    skaSluta = false;
                    break;
                default:
                    System.out.println("Fel input");

            }

        }while (skaSluta);
    }
}