package ru.rsreu.savushkin0517;

import java.util.Arrays;

import com.prutzkow.resourcer.ProjectResourcer;
import com.prutzkow.resourcer.Resourcer;

import ru.rsreu.savushkin0517.travelpackage.TourPackage;
import ru.rsreu.savushkin0517.travelpackage.data.DataInitializer;
import ru.rsreu.savushkin0517.travelpackage.manager.TourPackageManager;

public class ClientRunner {

	public static final Resourcer RESOURCER = ProjectResourcer.getInstance();
	private static final String SEARCH_DESTINATION = "Paris";

	private ClientRunner() {
	}

	public static void main(String[] args) {
		DataInitializer dataInitializer = new DataInitializer();
		TourPackage[] tourPackages = dataInitializer.initializeTourPackages();
		Arrays.sort(tourPackages);

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(ClientRunner.RESOURCER.getString("list.all.tours"));

		for (TourPackage tourPackage : tourPackages) {
			stringBuilder.append(tourPackage.getInfoAboutTour());
		}

		stringBuilder.append(String.format(ClientRunner.RESOURCER.getString("search.destination"), SEARCH_DESTINATION));

		try {
			TourPackage foundPackage = TourPackageManager.findTourPackageByDestination(tourPackages, SEARCH_DESTINATION);
			stringBuilder.append(
					(String.format(ClientRunner.RESOURCER.getString("found.tour.packege"), foundPackage.getInfoAboutTour())));
		} catch (IllegalArgumentException e) {
			stringBuilder.append(e.getMessage());
		}
		System.out.println(stringBuilder.toString().trim());
	}
}