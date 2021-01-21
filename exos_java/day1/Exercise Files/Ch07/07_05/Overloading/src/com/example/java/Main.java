package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 3: ");
        String s4 = getInput("Enter value 4: ");

        double result = addValues(s1, s2, s3, s4);
        System.out.println("The answer is " + result);
    }

    static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    static double addValues(String... values) {
        double result = 0;
        for(String value: values) {
            double d = Double.parseDouble(value);
            result += d;
        }
        return result;
    }
}
