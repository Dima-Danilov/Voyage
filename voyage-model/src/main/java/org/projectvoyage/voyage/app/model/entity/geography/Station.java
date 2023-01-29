package org.projectvoyage.voyage.app.model.entity.geography;

import org.projectvoyage.voyage.app.model.entity.base.AbstractEntity;
import org.projectvoyage.voyage.app.model.entity.transport.TransportType;

import java.util.Objects;

public class Station extends AbstractEntity {
    private City city;

    private Address address;

    /**
     * (Optional) Phone of the inquiry office
     */
    private String phone;

    private Coordinate coordinate;

    private TransportType transportType;

    /**
     * You shouldn't create station object directly.
     * Use {@link  City} functionality instead
     * @param city
     * @param transportType
     */
    public Station(final  City city, final  TransportType transportType) {
        this.city = Objects.requireNonNull(city);
        this.transportType = Objects.requireNonNull(transportType);
    }

    public City getCity() {
        return city;
    }

//    public void setCity(City city) {
//        this.city = city;
//    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public TransportType getTransportType() {
        return transportType;
    }

//    public void setTransportType(TransportType transportType) {
//        this.transportType = transportType;
//    }
}
