package com.techartifact.example.spring.model;


public class City {
    private String name;
    private String telephonecode;
    private String population;

    public City(String name, String telephonecode, String population) {
        this.name = name;
        this.telephonecode = telephonecode;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getTelephonecode() {
        return telephonecode;
    }

    public String getPopulation() {
        return population;
    }
}
