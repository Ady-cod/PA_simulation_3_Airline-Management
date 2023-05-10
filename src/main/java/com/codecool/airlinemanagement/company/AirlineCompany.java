package com.codecool.airlinemanagement.company;

import com.codecool.airlinemanagement.airlineEmployee.AirlineEmployee;
import com.codecool.airlinemanagement.airlineEmployee.flightAttendant.FlightAttendant;
import com.codecool.airlinemanagement.airlineEmployee.pilot.Pilot;
import com.codecool.airlinemanagement.airlineEmployee.pilot.PilotFunction;

import java.util.List;

public class AirlineCompany {
    private List<Flight> flights;
    private List<AirlineEmployee> airlineEmployees;

    public AirlineCompany(List<Flight> flights, List<AirlineEmployee> airlineEmployees) {
        this.flights = flights;
        this.airlineEmployees = airlineEmployees;
    }


    public void displayFlightsStatus() {
        for (Flight flight : flights) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Here are the updated information for the Flight with id: ")
                    .append(flight.getId())
                    .append(" :")
                    .append("\n");

            boolean hasCaptain = false;
            boolean hasCopilot = false;
            boolean hasCompas = true;
            boolean attendantSpeakFlightLanguage = true;
            List<Pilot> flightPilots = flight.getPilots();
            List<FlightAttendant> flightAttendants = flight.getFlightAttendants();
            for (Pilot pilot : flightPilots) {
                if (pilot.getPilotFunction() == PilotFunction.CAPTAIN) {
                    hasCaptain = true;
                }
                if (pilot.getPilotFunction() == PilotFunction.COPILOT) {
                    hasCopilot = true;
                }
                if (! pilot.hasAnalogCompass()){
                    hasCompas = false;
                }
            }
            if (hasCaptain) {
                stringBuilder.append("1. The captain is on board")
                        .append("\n");
            } else {
                stringBuilder.append("1. Unfortunately the captain is not on board")
                        .append("\n");
            }
            if (hasCopilot) {
                stringBuilder.append("2. Copilot is on board")
                        .append("\n");
            } else {
                stringBuilder.append("2. Unfortunately the copilot is not on board")
                        .append("\n");
            }
            if(flightPilots.size()==2){
                stringBuilder.append("3. We have a number of 2 pilots on board")
                        .append("\n");
            } else {
                stringBuilder.append("3. We don't have the right number of pilots on board. The number of pilots is: ")
                        .append(flightPilots.size())
                        .append("\n");
            }
            if(hasCompas){
                stringBuilder.append("4. All pilots on board have an Analog Compass. This is a vetted team.")
                        .append("\n");
            } else {
                stringBuilder.append("4. It seems that not all pilots on board have an Analog Compass. " +
                                "This is NOT a vetted team.")
                        .append("\n");
            }
            for (FlightAttendant flightAttendant : flightAttendants) {
                if (! flightAttendant.getLanguagesSpoken().contains(flight.getFlightLanguage())) {
                    attendantSpeakFlightLanguage = false;
                }
            }
            if (! attendantSpeakFlightLanguage){
                stringBuilder.append("5. It seems that by error the flight attendants are not " +
                        "correctly matched with the flight language required.")
                        .append("\n");
            }else {
                stringBuilder.append("5. The flight attendants are ready to communicate with you " +
                                "in your preferred language")
                        .append("\n");
            }
            if (flightAttendants.size()==3){
                stringBuilder.append("6. We have a number of 3 flight attendants on board")
                        .append("\n");
            } else {
                stringBuilder.append("6. We don't have the right number of flight attendants on board. The number of " +
                                "attendants is: ")
                        .append(flightAttendants.size())
                        .append("\n");
            }
            if (hasCaptain && hasCopilot && hasCompas && flightPilots.size()==2 && attendantSpeakFlightLanguage
                    && flightAttendants.size()==3) {
                stringBuilder.append("\n")
                        .append("The conclusion of checking the flight is: flight is ready to fly.")
                        .append("\n");
            } else {
                stringBuilder.append("\n")
                        .append("The conclusion of checking the flight is: for the reasons exposed above, " +
                                "the flight is NOT ready to fly. It will remain on the ground.")
                        .append("\n");
            }
            System.out.println(stringBuilder);

        }

    }

}
