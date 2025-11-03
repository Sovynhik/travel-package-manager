package ru.rsreu.savushkin0517.travelpackage;

import ru.rsreu.savushkin0517.travelpackege.transport.Transport;

public class HealthTour extends TourPackage {
	private static final int COST_PER_DAY = 2500;
	private static final int COST_FOOD_PER_DAY = 1500;

	public HealthTour(String typeTour, String destination, int numberOfDays, boolean isFoodServiceEnabled, float distance,
			Transport transport) {
		super(typeTour, destination, numberOfDays, isFoodServiceEnabled, distance, transport);
	}

	@Override
	public int getCostTourInRubles() {
		int countDays = super.getNumberOfDays();
		if (super.isFoodServiceEnabled()) {
			return COST_PER_DAY * countDays;
		} else {
			return (COST_PER_DAY + COST_FOOD_PER_DAY) * countDays;
		}
	}

	@Override
	public float getTravelTimeToDestinationInHours(Transport transport) {
		return (float) (super.getDistance() / transport.getAverageSpeed());
	}
}
