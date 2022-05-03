package org.example;

import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner varInput = new Scanner(System.in);
        System.out.println("Enter a string of text: ");
        String string = varInput.nextLine();
        System.out.println("Enter an integer: ");
        int integer = varInput.nextInt();
        System.out.println("Enter a double: ");
        double dub = varInput.nextDouble();
        System.out.println("Enter a boolean value: ");
        boolean bool = varInput.nextBoolean();

        System.out.println("Your string is " + string);
        System.out.println("Your integer is " + integer);
        System.out.println("Your double is " + dub);
        System.out.println("Your boolean is " + bool);
    }
}
