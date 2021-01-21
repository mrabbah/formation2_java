package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = intValue1;

        System.out.println("int value 2 = " + intValue2);

        long longValue1 = intValue1;
        System.out.println("long value 1 = " + longValue1);

        short shortValue1 = (short) intValue1;
        System.out.println("short value 1 = " + shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("Byte value = " + byteValue);

        double doubleValue = 3.99999d;
        int intValue4 = (int) doubleValue;
        System.out.println("int value 4 = " + intValue4);

    }

}
