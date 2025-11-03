package ru.rsreu.savushkin0517.travelpackage.manager;

import ru.rsreu.savushkin0517.ClientRunner;
import ru.rsreu.savushkin0517.travelpackage.TourPackage;

public class TourPackageManager {

	private TourPackageManager() {
	};

	public static TourPackage findTourPackageByDestination(TourPackage[] tourPackages, String searchDestination) {
		for (TourPackage tourPackage : tourPackages) {
			if (tourPackage.getDestination().equalsIgnoreCase(searchDestination)) {
				return tourPackage;
			}
		}
		throw new IllegalArgumentException(
				String.format(ClientRunner.RESOURCER.getString("illegal.argument.exception"), searchDestination));
	}
}