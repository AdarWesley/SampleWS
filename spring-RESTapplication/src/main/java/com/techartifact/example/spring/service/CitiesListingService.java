package com.techartifact.example.spring.service;


import com.techartifact.example.spring.model.City;
import com.techartifact.example.spring.model.RestFulCities;
import com.techartifact.example.spring.model.RestFulCity;
import org.springframework.stereotype.Service;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.LinkedList;
import java.util.List;

@Service("timeService")
@Path("cities")
public class CitiesListingService {

    @GET
    @Produces({"application/json", "application/xml"})
    public RestFulCities getCities() {
        List<City> cities = new LinkedList<City>();
        cities.add(new City("New Delhi", "011", "19M"));
        cities.add(new City("Mumbai", "022", "21M"));
        cities.add(new City("Chennai", "044", "10M"));
        RestFulCities restFulCities = new RestFulCities();
        restFulCities.setRestFulCityList(getCities(cities));
        return restFulCities;
    }

    private List<RestFulCity> getCities(List<City> cities) {
        List<RestFulCity> restFulCities = new LinkedList<RestFulCity>();
        for (City city : cities) {
            restFulCities.add(new RestFulCity(city));
        }
        return restFulCities;
    }
}
