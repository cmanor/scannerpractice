package org.example;

import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        hello.nextLine();
        System.out.println("Wow - Interesting! Tell me more!");
        hello.nextLine();
        System.out.println("Well um...okay then. I'm just gonna go over here.");
    }
}
