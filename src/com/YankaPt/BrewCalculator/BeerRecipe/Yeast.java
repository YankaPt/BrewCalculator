package com.YankaPt.BrewCalculator.BeerRecipe;

public class Yeast extends Ingredient {
    private TemperatureRange acceptableTemperatureRange;
    private TemperatureRange bestTemperatureRange;
    private BeerType beerType;

    private Yeast() {}

    public Yeast(String name, BeerType beerType) {
        this.name = name;
        this.beerType = beerType;
    }


    public TemperatureRange getAcceptableTemperatureRange() {
        return acceptableTemperatureRange;
    }

    public void setAcceptableTemperatureRange(TemperatureRange acceptableTemperatureRange) {
        this.acceptableTemperatureRange = acceptableTemperatureRange;
    }

    public TemperatureRange getBestTemperatureRange() {
        return bestTemperatureRange;
    }

    public void setBestTemperatureRange(TemperatureRange bestTemperatureRange) {
        this.bestTemperatureRange = bestTemperatureRange;
    }

    public BeerType getBeerType() {
        return beerType;
    }

    public void setBeerType(BeerType beerType) {
        this.beerType = beerType;
    }
}
class TemperatureRange {
    private double lowerBound;
    private double upperBound;

    public TemperatureRange(double lowerBound, double upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(double lowerBound) {
        this.lowerBound = lowerBound;
    }

    public double getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(double upperBound) {
        this.upperBound = upperBound;
    }
}
