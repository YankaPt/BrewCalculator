package com.YankaPt.BrewCalculator.BeerRecipe;

public class Malt extends Ingredient{
    private int color; //in EBC
    private int diastaticPower; //in WK

    private Malt() {}

    public Malt(String name, int color) {
        this.name = name;
        this.color = color;
    }

    public Malt(String name, int color, int diastaticPower) {
        this.name = name;
        this.color = color;
        this.diastaticPower = diastaticPower;
    }


    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getDiastaticPower() {
        return diastaticPower;
    }

    public void setDiastaticPower(int diastaticPower) {
        this.diastaticPower = diastaticPower;
    }

}
