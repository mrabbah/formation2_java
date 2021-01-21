package com.example.java;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        System.out.println("Ordered data");
        ArrayList<String> list = new ArrayList<String>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println("toString() output");
        System.out.println(list);
        System.out.println("");

        System.out.println("ArrayList iterator");
        System.out.println("");
        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()) {
            String val1 = it1.next();
            System.out.println(val1);
        }
//
        System.out.println("ArrayList ForEach");
        System.out.println("");
        for(String val2: list) {
            System.out.println(val2);
        }

        System.out.println("Java 8 method reference");
        System.out.println("");
        list.forEach(System.out::println);

        System.out.println("Unordered data");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);
        System.out.println("");


        System.out.println("HashMap Iterator");
        System.out.println("");
        Set<String> keys = map.keySet();
        Iterator<String> it2 = keys.iterator();
        while (it2.hasNext()) {
            String key = it2.next();
            System.out.println("key = " + key + ", value = " + map.get(key));
        }

        System.out.println("HashMap ForEach");
        System.out.println("");

        for(Map.Entry<String, String> entry  : map.entrySet()) {
            System.out.println("key = " + entry.getKey() +
                    ", value = " + entry.getValue());
        }

    }

}
