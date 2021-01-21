package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBoolean = Boolean.toString(boolValue);
        System.out.println(fromBoolean);

        long longValue = 10_000_000;
        NumberFormat f = NumberFormat.getNumberInstance(new Locale("fr", "FR"));
        String maValeurFormtee = f.format(longValue);
        System.out.println(maValeurFormtee);

    }

}
