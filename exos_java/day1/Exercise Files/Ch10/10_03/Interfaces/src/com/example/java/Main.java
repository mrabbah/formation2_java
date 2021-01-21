package com.example.java;

import com.example.java.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        Press press = new OlivePress();
        press.setOil(20);

        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");

        Press press2 = new Press() {
            @Override
            public int getOil(List<Olive> olives) {
                return 10;
            }

            @Override
            public void setOil(int oil) {

            }

            @Override
            public void passerEnModeMaintenance() {

            }
        };

        System.out.println("La quantité dans press 2 = " + press2.getOil(null));


    }

}
