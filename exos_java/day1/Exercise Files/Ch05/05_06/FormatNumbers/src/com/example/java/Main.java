package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        double doubleValue = 1_234_567.89;
        Locale locale = new Locale("da", "DK");

        NumberFormat nf = NumberFormat.getNumberInstance(locale);
        System.out.println("Number = " + nf.format(doubleValue));

        NumberFormat currNf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Currency = " + currNf.format(doubleValue));

        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("Integer = " + intF.format(doubleValue));

    }

}
