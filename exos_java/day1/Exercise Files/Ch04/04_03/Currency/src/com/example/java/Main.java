package com.example.java;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        double value = .012;

        double pSum = value + value + value;

        System.out.println("la somme des primitives = " + pSum);

        String strValue = Double.toString(value);
        System.out.println("strValue = " + strValue);

        BigDecimal bValue = new BigDecimal(strValue);
        BigDecimal bSum = bValue.add(bValue).add(bValue);
        
        System.out.println("Sum of big decimal = " + bSum.toString());

    }

}
