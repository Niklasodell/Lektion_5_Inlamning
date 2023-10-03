package com.Niklas.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String userInput = scan.nextLine();

        System.out.println("Player #1: " + userInput);

    }
}