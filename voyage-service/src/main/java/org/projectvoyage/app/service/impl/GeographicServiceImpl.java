package org.projectvoyage.app.service.impl;

import org.projectvoyage.voyage.app.model.entity.geography.City;
import org.projectvoyage.app.service.GeographicService;

import java.util.ArrayList;
import java.util.List;

public class GeographicServiceImpl implements GeographicService {

    /**
     * Internal list of cities
     */
    private final List<City> cities;

    public GeographicServiceImpl(/*List<City> cities*/) {
        /*this.cities = cities;*/
        cities = new ArrayList<City>();
    }

    @Override
    public List<City> findCities() {
        return null;
    }

    @Override
    public void saveCity(City city) {

    }
}
