package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("California");
        list.add("Oregon");
        list.add("Washigngton");

        System.out.println(list);
        list.add("Alaska");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        String state = list.get(1);
        System.out.println("State = " + state);

        System.out.println("position d'alaska = " + list.indexOf("Alaska"));


    }

}
