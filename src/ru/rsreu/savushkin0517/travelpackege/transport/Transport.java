package ru.rsreu.savushkin0517.travelpackege.transport;

import ru.rsreu.savushkin0517.ClientRunner;

public class Transport {
	private String type;
	private String company;
	private float averageSpeed;

	public Transport(String type, String company, float averageSpeed) {
		this.type = type;
		this.company = company;
		this.averageSpeed = averageSpeed;
	}

	public String getType() {
		return type;
	}

	public double getAverageSpeed() {
		return averageSpeed;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(String.format(ClientRunner.RESOURCER.getString("company.info"), this.type, this.company));
		return result.toString();
	}
}
