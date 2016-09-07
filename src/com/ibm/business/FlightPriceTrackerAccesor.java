/**
 * 
 */
package com.ibm.business;

/**
 * @author jose.castiblanco
 * 
 */
public class FlightPriceTrackerAccesor {

	/**
	 * 
	 */
	public FlightPriceTrackerAccesor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method to get the flight price tracker
	 * 
	 * @return
	 */
	public FlightPriceTracker getFlightPriceTracker() {
		FlightPriceTracker flightPriceTracker = new FlightPriceTracker();
		flightPriceTracker.setName("Vuelo 777");
		return flightPriceTracker;
	}

}
