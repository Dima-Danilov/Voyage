package org.projectvoyage.voyage.app.model.entity.geography;

import org.junit.Before;
import org.junit.Test;
import org.projectvoyage.voyage.app.model.entity.transport.TransportType;

import static org.junit.Assert.*;

/**
 * Contains unit-test to check functionality of{@link  City}
 *
 * @author Dmitriy
 */

public class CityTest {
    private City city;

    @Before
    public void setup() {
        city = new City("St-Petersburg");
    }

    @Test
    public void testAddValidStationSuccess() {
        Station station = city.addStation(TransportType.AUTO);

        city.addStation(TransportType.AUTO);

        assertTrue(containsStation(city, station));
        assertEquals(city, station.getCity());
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullStationFailure() {
        city.addStation(null);

        assertTrue(false);
    }

    @Test
    public void testAddDuplicateStationFailure() {
        Station station = new Station(city, TransportType.AUTO);
        city.addStation(TransportType.AUTO);
        city.addStation(TransportType.AUTO);

        assertEquals(city.getStations().size(), 1);
    }

    @Test
    public void testRemoveStationSuccess(){
        Station station = city.addStation(TransportType.AUTO);

        city.removeStation(station);

        assertTrue(city.getStations().isEmpty());
    }

    @Test (expected = NullPointerException.class)
    public void testRemoveNullStationFailure(){
        city.removeStation(null);
        assertTrue(city.getStations().isEmpty());
    }

    private boolean containsStation(City city, Station station) {
        return city.getStations().contains(station);
    }

}
