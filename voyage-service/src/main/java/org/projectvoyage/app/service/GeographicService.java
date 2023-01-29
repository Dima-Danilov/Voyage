package org.projectvoyage.app.service;

import org.projectvoyage.voyage.app.model.entity.geography.City;

import java.util.List;

public interface GeographicService {
    /**
     * Returns list of existing cities
     * @return
     */
    List<City> findCities();

    /**
     * Saves specified city instance
     * @param city
     */
    void saveCity(City city);
}
