package com.YankaPt.BrewCalculator.BeerRecipe;

public class Hop extends Ingredient {
    private double alphaAcids; //in %

    public Hop(String name, double alphaAcids) {
        this.name = name;
        this.alphaAcids = alphaAcids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAlphaAcids() {
        return alphaAcids;
    }

    public void setAlphaAcids(double alphaAcids) {
        this.alphaAcids = alphaAcids;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}
