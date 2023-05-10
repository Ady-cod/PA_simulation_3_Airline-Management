package com.codecool.airlinemanagement.airlineEmployee.flightAttendant;

import com.codecool.airlinemanagement.airlineEmployee.AirlineEmployee;
import com.codecool.airlinemanagement.company.AirlineCompany;

import java.time.LocalDate;
import java.util.List;

public class FlightAttendant extends AirlineEmployee {
    private List<Language> languagesSpoken;


    public FlightAttendant(String name, LocalDate birthDate, List<Language> languagesSpoken) {
        super(name, birthDate);
        this.languagesSpoken = languagesSpoken;
    }

    public List<Language> getLanguagesSpoken() {
        return languagesSpoken;
    }
}
