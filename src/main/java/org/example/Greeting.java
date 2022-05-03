package org.example;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner greetings = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = greetings.nextLine();
        System.out.println("Hi " + name);
    }
}