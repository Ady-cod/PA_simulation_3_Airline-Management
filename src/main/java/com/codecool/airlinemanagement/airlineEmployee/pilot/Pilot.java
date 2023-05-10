package com.codecool.airlinemanagement.airlineEmployee.pilot;

import com.codecool.airlinemanagement.airlineEmployee.AirlineEmployee;
import com.codecool.airlinemanagement.company.AirlineCompany;

import java.time.LocalDate;

public class Pilot extends AirlineEmployee {
    private PilotFunction pilotFunction;
    private boolean analogCompass;


    public Pilot(String name, LocalDate birthDate, PilotFunction pilotFunction, boolean analogCompass) {
        super(name, birthDate);
        this.pilotFunction = pilotFunction;
        this.analogCompass = analogCompass;
    }

    public PilotFunction getPilotFunction() {
        return pilotFunction;
    }

    public boolean hasAnalogCompass() {
        return analogCompass;
    }
}
