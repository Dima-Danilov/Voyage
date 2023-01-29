package org.projectvoyage.voyage.app.model.search.criteria;

import org.projectvoyage.voyage.app.model.entity.transport.TransportType;

/**
 * Filtering criteria for search station operation
 */
public class StationCriteria {
    /**
     * City's name
     */
    private String name;

    /**
     * Station's address^ street, zipCode, building number
     */
    private String address;

    private TransportType transportType;

    /**
     * Returns filtering crieria to search stations that
     * contains specified name parameter
     * @param name
     * @return
     */
    public static StationCriteria byName (String name){
        return new StationCriteria(name);
    }

    public StationCriteria(final String name) {
        this.name = name;
    }

    public StationCriteria(final TransportType transportType) {
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
