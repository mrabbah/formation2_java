package com.example.java;

public class Main {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        if(str1 == str2) {
            System.out.println("str1 == str2");
        } else {
            System.out.println("str1 différente de str2");
        }

        if(str1.equals(str2)) {
            System.out.println("str1 == str2");
        } else {
            System.out.println("str1 différente de str2");
        }
    }

}
