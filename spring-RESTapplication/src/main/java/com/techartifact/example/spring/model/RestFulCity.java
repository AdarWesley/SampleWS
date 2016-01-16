package com.techartifact.example.spring.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "city")
public class RestFulCity {
    private String name;
    private String telephonecode;
    private String population;

    public RestFulCity() {
    }

    public RestFulCity(String name, String telephonecode, String population) {
        this.name = name;
        this.telephonecode = telephonecode;
        this.population = population;
    }

    public RestFulCity(City city) {
        this.name = city.getName();
        this.telephonecode = city.getTelephonecode();
        this.population = city.getPopulation();
    }
    @XmlElement
    public String getName() {
        return name;
    }
    @XmlElement
    public String getTelephonecode() {
        return telephonecode;
    }

    @XmlElement
    public String getPopulation() {
        return population;
    }
}
