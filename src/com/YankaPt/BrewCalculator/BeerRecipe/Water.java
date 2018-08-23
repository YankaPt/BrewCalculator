package com.YankaPt.BrewCalculator.BeerRecipe;

public class Water extends Ingredient {
    private double pH;

    public Water() {
        name = "Water";
        pH = 7.0;
    }

    public Water(double pH) {
        this.pH = pH;
    }
}
