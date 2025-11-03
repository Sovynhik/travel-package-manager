package ru.rsreu.savushkin0517.travelpackage.data;

import ru.rsreu.savushkin0517.travelpackage.ExcursionTour;
import ru.rsreu.savushkin0517.travelpackage.HealthTour;
import ru.rsreu.savushkin0517.travelpackage.LeisureTour;
import ru.rsreu.savushkin0517.travelpackage.TourPackage;
import ru.rsreu.savushkin0517.travelpackege.transport.Transport;

public class DataInitializer {
	public TourPackage[] initializeTourPackages() {
		TourPackage[] tourPackages = new TourPackage[15];

		Transport busTransport = new Transport("Bus", "TravelCo", 60);
		Transport planeTransport = new Transport("Plane", "Airways Inc.", 800);
		Transport trainTransport = new Transport("Train", "Railways Ltd.", 100);

		tourPackages[0] = new LeisureTour("Leisure Tour", "Hawaii", 7, true, 768, busTransport);
		tourPackages[1] = new ExcursionTour("Excursion Tour", "Paris", 5, false, 900, planeTransport);
		tourPackages[2] = new HealthTour("Health Tour", "Bali", 10, true, 1200, busTransport);
		tourPackages[3] = new LeisureTour("Leisure Tour", "Maldives", 14, false, 540, planeTransport);
		tourPackages[4] = new ExcursionTour("Excursion Tour", "Rome", 4, true, 2300, trainTransport);
		tourPackages[5] = new HealthTour("Health Tour", "Thailand", 12, false, 500, planeTransport);
		tourPackages[6] = new LeisureTour("Leisure Tour", "Cancun", 7, true, 234, busTransport);
		tourPackages[7] = new ExcursionTour("Excursion Tour", "New York", 6, false, 1234, planeTransport);
		tourPackages[8] = new HealthTour("Health Tour", "Switzerland", 8, true, 1212, trainTransport);
		tourPackages[9] = new LeisureTour("Leisure Tour", "Sydney", 9, false, 987, busTransport);
		tourPackages[10] = new ExcursionTour("Excursion Tour", "London", 5, true, 1100, planeTransport);
		tourPackages[11] = new HealthTour("Health Tour", "Iceland", 11, false, 1200, planeTransport);
		tourPackages[12] = new LeisureTour("Leisure Tour", "Tokyo", 10, true, 980, trainTransport);
		tourPackages[13] = new ExcursionTour("Excursion Tour", "Barcelona", 3, false, 456, trainTransport);
		tourPackages[14] = new HealthTour("Health Tour", "Vietnam", 15, true, 1123, busTransport);

		return tourPackages;
	}
}
