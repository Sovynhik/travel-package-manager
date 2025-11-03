package ru.rsreu.savushkin0517.travelpackage;

import ru.rsreu.savushkin0517.travelpackege.transport.Transport;

public class ExcursionTour extends TourPackage {
	private static final int PRICE_PER_DAY = 3500;
	private static final int SALE = 2000;
	private static final int NUMBER_DAYS_FOR_SALE = 10;
	private static final float TRANSFER_TIME = 5;

	public ExcursionTour(String typeTour, String destination, int numberOfDays, boolean isFoodServiceEnabled,
			float distance, Transport transport) {
		super(typeTour, destination, numberOfDays, isFoodServiceEnabled, distance, transport);
	}

	@Override
	public int getCostTourInRubles() {
		int countDays = super.getNumberOfDays();

		if (countDays <= NUMBER_DAYS_FOR_SALE) {
			return PRICE_PER_DAY * countDays;
		} else {
			return PRICE_PER_DAY * countDays - SALE;
		}
	}

	@Override
	public float getTravelTimeToDestinationInHours(Transport transport) {
		return (float) (TRANSFER_TIME + (super.getDistance() / transport.getAverageSpeed()));
	}
}
