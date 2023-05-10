package com.codecool.airlinemanagement;

import com.codecool.airlinemanagement.airlineEmployee.AirlineEmployee;
import com.codecool.airlinemanagement.airlineEmployee.flightAttendant.FlightAttendant;
import com.codecool.airlinemanagement.airlineEmployee.flightAttendant.Language;
import com.codecool.airlinemanagement.airlineEmployee.pilot.Pilot;
import com.codecool.airlinemanagement.airlineEmployee.pilot.PilotFunction;
import com.codecool.airlinemanagement.company.AirlineCompany;
import com.codecool.airlinemanagement.company.Flight;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class AirlineManagementApplication {

	public static void main(String[] args) {
		Pilot pilot1 = new Pilot("John", LocalDate.of(1990,11,15),
				PilotFunction.COPILOT,true);
		Pilot pilot2 = new Pilot("Walker", LocalDate.of(1995,10,1),
				PilotFunction.CAPTAIN,true);

		Pilot pilot3 = new Pilot("Diaz", LocalDate.of(1998,1,28),
				PilotFunction.COPILOT,false);
		Pilot pilot4 = new Pilot("Jean", LocalDate.of(1992,8,8),
				PilotFunction.CAPTAIN,true);

		Pilot pilot5 = new Pilot("Jeremy", LocalDate.of(2000,9,12),
				PilotFunction.COPILOT,true);
		Pilot pilot6 = new Pilot("Juan", LocalDate.of(2002,5,18),
				PilotFunction.COPILOT,true);

		Pilot pilot7 = new Pilot("Jeremy", LocalDate.of(2000,9,12),
				PilotFunction.COPILOT,true);
		Pilot pilot8 = new Pilot("Juan", LocalDate.of(2002,5,18),
				PilotFunction.CAPTAIN,true);

		FlightAttendant flightAttendant1 = new FlightAttendant("Jane",LocalDate.of(2000,9,12),
				List.of(Language.ENGLISH,Language.GERMAN));
		FlightAttendant flightAttendant2 = new FlightAttendant("Vivian",LocalDate.of(2008,10,5),
				List.of(Language.ENGLISH,Language.GERMAN));
		FlightAttendant flightAttendant3 = new FlightAttendant("Doris",LocalDate.of(2002,4,7),
				List.of(Language.ENGLISH,Language.GERMAN));

		FlightAttendant flightAttendant4 = new FlightAttendant("Jane",LocalDate.of(2000,9,12),
				List.of(Language.ENGLISH,Language.GERMAN));
		FlightAttendant flightAttendant5 = new FlightAttendant("Vivian",LocalDate.of(2008,10,5),
				List.of(Language.ENGLISH,Language.GERMAN));
		FlightAttendant flightAttendant6 = new FlightAttendant("Doris",LocalDate.of(2002,4,7),
				List.of(Language.ENGLISH,Language.GERMAN));

		FlightAttendant flightAttendant7 = new FlightAttendant("Jane",LocalDate.of(2000,9,12),
				List.of(Language.ENGLISH,Language.GERMAN,Language.SPANISH));
		FlightAttendant flightAttendant8 = new FlightAttendant("Vivian",LocalDate.of(2008,10,5),
				List.of(Language.ENGLISH,Language.GERMAN,Language.SPANISH));
		FlightAttendant flightAttendant9 = new FlightAttendant("Doris",LocalDate.of(2002,4,7),
				List.of(Language.ENGLISH,Language.GERMAN,Language.SPANISH));

		FlightAttendant flightAttendant10 = new FlightAttendant("Jane",LocalDate.of(2000,9,12),
				List.of(Language.ENGLISH,Language.GERMAN,Language.SPANISH));
		FlightAttendant flightAttendant11 = new FlightAttendant("Vivian",LocalDate.of(2008,10,5),
				List.of(Language.ENGLISH,Language.GERMAN,Language.SPANISH));
		FlightAttendant flightAttendant12 = new FlightAttendant("Doris",LocalDate.of(2002,4,7),
				List.of(Language.ENGLISH,Language.GERMAN,Language.SPANISH));

		Flight flight1 = new Flight(Language.ENGLISH,List.of(pilot1,pilot2),
				List.of(flightAttendant1,flightAttendant2,flightAttendant3));
		Flight flight2 = new Flight(Language.GERMAN,List.of(pilot3,pilot4),
				List.of(flightAttendant4,flightAttendant5,flightAttendant6));
		Flight flight3 = new Flight(Language.SPANISH,List.of(pilot5,pilot6),
				List.of(flightAttendant7,flightAttendant8,flightAttendant9));
		Flight flight4 = new Flight(Language.POLISH,List.of(pilot7,pilot8),
				List.of(flightAttendant10,flightAttendant11,flightAttendant12));

		List<AirlineEmployee>airlineEmployees = List.of(pilot1,pilot2,pilot3,pilot4,pilot5,pilot6,pilot7,pilot8,
				flightAttendant1,flightAttendant2,flightAttendant3,flightAttendant4,flightAttendant5,
				flightAttendant6,flightAttendant7,flightAttendant8,flightAttendant9,flightAttendant10,
				flightAttendant11,flightAttendant12);

		List<Flight>flights = List.of(flight1,flight2,flight3,flight4);

		AirlineCompany airlineCompany = new AirlineCompany(flights,airlineEmployees);
		airlineCompany.displayFlightsStatus();

	}

}
