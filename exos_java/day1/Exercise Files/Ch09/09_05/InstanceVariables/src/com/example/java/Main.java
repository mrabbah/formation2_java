package com.example.java;

import com.example.java.model.Kalamata;
import com.example.java.model.Ligurian;
import com.example.java.model.Olive;
import com.example.java.model.OliveName;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Kalamata());
        olives.add(new Ligurian());

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);

        System.out.println("Total olive oil = " + totalOil);
    }

}

