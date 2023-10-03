package com.Niklas.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Write a number: ");
        int x = scan.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println(i);
        }

    }
}