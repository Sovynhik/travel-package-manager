package ru.rsreu.savushkin0517.travelpackage;

import ru.rsreu.savushkin0517.travelpackege.transport.Transport;

public class LeisureTour extends TourPackage {
	private static final int PRICE_PER_DAY = 4000;
	private static final int PRICE_DEPOSIT = 5000;

	public LeisureTour(String typeTour, String destination, int numberOfDays, boolean isFoodServiceEnabled,
			float distance, Transport transport) {
		super(typeTour, destination, numberOfDays, isFoodServiceEnabled, distance, transport);
	}

	@Override
	public int getCostTourInRubles() {
		int countDays = super.getNumberOfDays();
		return PRICE_PER_DAY * countDays + PRICE_DEPOSIT;
	}

	@Override
	public float getTravelTimeToDestinationInHours(Transport transport) {
		return (float) (super.getDistance() / transport.getAverageSpeed());
	}
}
