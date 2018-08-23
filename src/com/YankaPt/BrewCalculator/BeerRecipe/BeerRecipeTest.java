package com.YankaPt.BrewCalculator.BeerRecipe;

public class BeerRecipeTest {
    public static void main(String[] args) {
        BeerRecipe beerRecipe = new BeerRecipe();
        beerRecipe.setVolume(6);
        beerRecipe.setHydromodule(4);
        beerRecipe.addMalt(new Malt());
        beerRecipe.addHop(new Hop());

        System.out.println(beerRecipe);
    }
}
