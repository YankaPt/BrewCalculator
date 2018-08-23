package com.YankaPt.BrewCalculator.BeerRecipe;

public abstract class Ingredient {
    String name;
    String notice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}
