package com.example.travelassistant;

import com.example.travelassistant.reguli.Trip;

import java.util.LinkedList;
import java.util.List;

public class Trips {

    private List<Trip> trips;

    public Trips() {
        trips = new LinkedList<>();
    }

    public Trips(List<Trip> trips) {
        this.trips = trips;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }
}
