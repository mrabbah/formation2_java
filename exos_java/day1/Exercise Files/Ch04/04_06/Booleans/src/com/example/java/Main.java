package com.example.java;

public class Main {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b 1 = " + b1);
        System.out.println("b2 = " + b2);

        boolean b3 = !b1;
        System.out.println("b3 = " + b3);

        int i1 = 10;

        boolean b4 = (i1 != 0);
        System.out.println("b4 = " + b4);

        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println("Parsed : " + parsed) ;
    }

}
