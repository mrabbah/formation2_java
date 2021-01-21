package com.example.java;

public class MaxValues {

    public static void main(String[] args) {
        byte b = 127;
        System.out.println("Valeur du byte = " + b);
        if(b < Byte.MAX_VALUE) {
            b++;
        }
        System.out.println("Nouvelle valeur = " + b);
    }

}
