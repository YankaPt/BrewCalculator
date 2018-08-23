package com.YankaPt.BrewCalculator.BeerRecipe;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class BeerRecipe {
    private String name;
    private double volume;
    private double hydromodule; //ratio water to malt
    private Water water;
    private Set<Malt> malts;
    private Set<Hop> hops;
    private Set<MaltExtract> maltExtracts;
    private Set<Addition> additions;
    private Yeast yeast;
    private String notice;

    public BeerRecipe() {
        water = new Water();
        malts = new HashSet<>();
        maltExtracts = new HashSet<>();
        hops = new HashSet<>();
        additions = new HashSet<>();
    }


    /*public boolean isComplete() {
        return volume != 0 && hydromodule != 0 && ((malts != null && maltExtracts != null) && hops != null )
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getHydromodule() {
        return hydromodule;
    }

    public void setHydromodule(double hydromodule) {
        this.hydromodule = hydromodule;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Set<Malt> getMalts() {
        return malts;
    }

    public void addMalt(Malt malt) {
        malts.add(malt);
    }
    public void addMalt(Collection<Malt> malts) {
        this.malts.addAll(malts);
    }
    public void removeMalt(Malt malt) {
        malts.remove(malt);
    }

    public void clearMalts() {
        malts.clear();
    }

    public Set<Hop> getHops() {
        return hops;
    }

    public void addHop(Hop hop) {
        hops.add(hop);
    }
    public void addHop(Collection<Hop> hops) {
        this.hops.addAll(hops);
    }

    public void removeHop(Hop hop) {
        hops.remove(hop);
    }

    public Set<MaltExtract> getMaltExtracts() {
        return maltExtracts;
    }

    public void addMaltExtract(MaltExtract maltExtract) {
        maltExtracts.add(maltExtract);
    }
    public void addMaltExtract(Collection<MaltExtract> maltExtracts) {
        this.maltExtracts.addAll(maltExtracts);
    }
    public void removeMaltExtract(MaltExtract maltExtract) {
        maltExtracts.remove(maltExtract);
    }

    public Set<Addition> getAdditions() {
        return additions;
    }

    public void addAddition(Addition addition) {
        additions.add(addition);
    }
    public void addAddition(Collection<Addition> additions) {
        this.additions.addAll(additions);
    }
    public void removeAddition(Addition addition) {
        additions.remove(addition);
    }

    public Yeast getYeast() {
        return yeast;
    }

    public void setYeast(Yeast yeast) {
        this.yeast = yeast;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}
