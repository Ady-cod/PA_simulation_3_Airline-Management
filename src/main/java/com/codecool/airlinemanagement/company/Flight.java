package com.codecool.airlinemanagement.company;

import com.codecool.airlinemanagement.airlineEmployee.flightAttendant.FlightAttendant;
import com.codecool.airlinemanagement.airlineEmployee.flightAttendant.Language;
import com.codecool.airlinemanagement.airlineEmployee.pilot.Pilot;
import com.codecool.airlinemanagement.airlineEmployee.pilot.PilotFunction;

import java.util.List;
import java.util.UUID;

public class Flight {
    private UUID id;
    private Language flightLanguage;
    private List<Pilot>pilots;
    private List<FlightAttendant> flightAttendants;

    public Flight(Language flightLanguage, List<Pilot> pilots, List<FlightAttendant> flightAttendants) {
        this.id = UUID.randomUUID();
        this.flightLanguage = flightLanguage;
        this.pilots = pilots;
        this.flightAttendants = flightAttendants;
    }

    public UUID getId() {
        return id;
    }

    public Language getFlightLanguage() {
        return flightLanguage;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public List<FlightAttendant> getFlightAttendants() {
        return flightAttendants;
    }

}
