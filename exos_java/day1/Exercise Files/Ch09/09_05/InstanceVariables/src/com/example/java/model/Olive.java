package com.example.java.model;

public class Olive {

    private OliveName name = OliveName.KALAMATA;
    private OliveColor color = OliveColor.PURPLE;
    private int oil = 3;

    public Olive(OliveName name, OliveColor color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public Olive(OliveName name, int oil) {
        this.name = name;
        this.color = OliveColor.GREEN;
        this.oil = oil;
    }

    public int crush() {
        System.out.println(" ouch!");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }
}
