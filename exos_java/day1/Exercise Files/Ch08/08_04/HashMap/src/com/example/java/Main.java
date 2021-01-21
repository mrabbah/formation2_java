package com.example.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Californa", "Sacramento");
        map.put("Oregon", "Salem");
        System.out.println(map);

        map.put("Newyork", null);
        System.out.println(map);

        map.put(null, "Test");
        System.out.println(map);

        String cap = map.get("Oregon");
        System.out.println(cap);

        map.remove(null);
        System.out.println(map);

        Map<String, List<String>> map2 = new HashMap<>();
        map2.put("cle1", new ArrayList<>());
        map2.get("cle1").add("val1");
        map2.get("cle1").add("val2");
        map2.get("cle1").add("val3");
        System.out.println(map2);
        map2.put("cle2", new ArrayList<>());
        map2.get("cle2").add("val1");
        map2.get("cle2").add("val2");
        map2.get("cle2").add("val3");
        System.out.println(map2);
    }

}
