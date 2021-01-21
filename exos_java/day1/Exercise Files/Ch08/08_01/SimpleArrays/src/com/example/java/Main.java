package com.example.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Array of primitives");
        int[] tab1 = {9, 6, 3};
        Arrays.sort(tab1);
        for (int ele:
             tab1) {
            System.out.println(ele);
        }


        System.out.println("Array of strings");
        String[] strings = {"Red", "Green", "Blue"};
        Arrays.sort(strings);
        for(String s: strings) {
            System.out.println(s);
        }


        System.out.println("Setting an initial size");
        int[] tab2 = new int[10];
        for (int i = 0; i < 10; i++) {
            tab2[i] = i * 100;
        }
        for(int ele2: tab2) {
            System.out.println(ele2);
        }


        System.out.println("Copying an array");
        int[] tabCopy = new int[15];
        System.arraycopy(tab2, 5, tabCopy, 10, 5);

        for(int ele3: tabCopy) {
            System.out.println(ele3);
        }

        int[][] tabs = {{1, 2}, {3, 4}};
        System.out.println(tabs[1][1]);
    }

}
