package com;

public class TestDriver {

	public static void main(String[] args) {
		
		Driver driver1 = new Driver(1, "Raju", "Car", 4500.0);
		Driver driver2 = new Driver(2, "Ramu", "Lorry", 2500.0);
		Driver driver3 = new Driver(3, "Suresh", "Auto", 3000.0);
		Driver driver4 = new Driver(4, "Ramesh", "Car", 2000.0);
		
		Driver[] driverArray = {driver1, driver2, driver3, driver4};
		
		Travel travel = new Travel();
		boolean drivertype = travel.isCarDriver(driver1);
		System.out.println(drivertype);
		String driverDetails = travel.retriveByDriverId(driverArray, 3);
		System.out.println(driverDetails);
		int numOfDrivers = travel.retriveCountOfDriver(driverArray, "Car");
		System.out.println(numOfDrivers);
		String[] returningArray = travel.retriveDriver(driverArray, "Car");
		
		for (String string : returningArray) {
			System.out.println(string + " ");
		}
		
		String maxTravelledDriverName = travel.retriveMaximumDistanceTravelledDriver(driverArray);
		System.out.println(maxTravelledDriverName);
	}

}
