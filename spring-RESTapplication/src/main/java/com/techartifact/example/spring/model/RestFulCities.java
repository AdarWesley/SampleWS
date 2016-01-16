package com.techartifact.example.spring.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "cities")
public class RestFulCities {

    private List<RestFulCity> restFulCityList;

    @XmlElement(name = "city")
    public List<RestFulCity> getRestFulCityList() {
        return restFulCityList;
    }

    public void setRestFulCityList(List<RestFulCity> restFulCityList) {
        this.restFulCityList = restFulCityList;
    }
}
