package org.projectvoyage.voyage.app.model.entity.geography;

import org.projectvoyage.voyage.app.infra.util.CommonUtil;
import org.projectvoyage.voyage.app.model.entity.base.AbstractEntity;
import org.projectvoyage.voyage.app.model.entity.transport.TransportType;

import java.util.*;

/**
 * Any locality that contains transport stations
 *
 * @author Dmitriy
 */

public class City extends AbstractEntity {
    private String name;

    /**
     * The name of the district where the city is located
     */
    private String district;

    /**
     * The name of the region where the district is located
     * Region is top level area in the country
     */
    private String region;

    /**
     * Set of transport stations that is linked to this loyalty (region?)
     */
    private Set<Station> stations;


    public City(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Set<Station> getStations() {
//        return stations == null ? Collections.emptySet() : stations;
        return CommonUtil.getSafeSet(stations);
    }

//    public void setStations(Set<Station> stations) {
//        this.stations = stations;
//    }

    /**
     * Adds specified station to the city station list
     *
     * @param station
     */
    public Station addStation(final TransportType transportType) {
//        Objects.requireNonNull(station, "station parameter is not initialized");
        if (stations == null) {
            stations = new HashSet<>();
        }
        Station station = new Station(this, transportType);
        stations.add(station);
        return station;
//        station.setCity(this);
    }

    /**
     * Removing the specified station from the list
     */

    public void removeStation(Station station){
        Objects.requireNonNull(station, "station parameter is not initialized");
        if (station == null){
            return;
        }
        stations.remove(station);
    }
}
