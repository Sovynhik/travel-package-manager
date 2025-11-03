package ru.rsreu.savushkin0517.travelpackage;

import ru.rsreu.savushkin0517.ClientRunner;
import ru.rsreu.savushkin0517.travelpackege.transport.Transport;

public abstract class TourPackage implements Comparable<TourPackage> {
	private String typeTour;
	private String destination;
	private int numberOfDays;
	private boolean isFoodServiceEnabled;
	private float distance;
	private Transport transport;

	public TourPackage(String typeTour, String destination, int numberOfDays, boolean isFoodServiceEnabled,
			float distance, Transport transport) {
		this.typeTour = typeTour;
		this.destination = destination;
		this.numberOfDays = numberOfDays;
		this.isFoodServiceEnabled = isFoodServiceEnabled;
		this.distance = distance;
		this.transport = transport;
	}

	public String getDestination() {
		return destination;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public boolean isFoodServiceEnabled() {
		return isFoodServiceEnabled;
	}

	public float getDistance() {
		return distance;
	}

	public StringBuilder getInfoAboutTour() {
		StringBuilder info = new StringBuilder();
		info.append(String.format(ClientRunner.RESOURCER.getString("tour.info"), typeTour, destination, numberOfDays,
				isFoodService(isFoodServiceEnabled), distance, transport, getCostTourInRubles(),
				getTravelTimeToDestinationInHours(transport)));
		return info;
	};

	public abstract int getCostTourInRubles();

	public abstract float getTravelTimeToDestinationInHours(Transport transport);

	private static String isFoodService(boolean isFoodServiceEnabled) {
		if (isFoodServiceEnabled) {
			return "YES";
		} else {
			return "NO";
		}
	}

	@Override
	public int compareTo(TourPackage other) {
		return Integer.compare(this.numberOfDays, other.numberOfDays);
	}
}
