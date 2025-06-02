package com;

public class Travel {
	
	public boolean isCarDriver(Driver driver) {
		
		if (driver.getCategory().equals("Car")) {
			return true;
		}
		
		else {
			return false;
		}
		
	}
	
	public String retriveByDriverId(Driver[] arr, int driverId) {
		
		String printStatement = "";
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i].getDriverId() == driverId) {
				printStatement = "Driver name is " + arr[i].getDriverName() + " Belonging to the Category " + arr[i].getCategory() + " traveled " + arr[i].getTotalDistance() + " KM so far.";
			}
		}
		return printStatement;
		
		
	}
	
	public int retriveCountOfDriver(Driver[] arr, String category) {
		
		int count = 0;
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i].getCategory() == category) {
				count += 1;
			}
		}
		return count;
		
	}
	
	public String[] retriveDriver(Driver[] arr, String category) {
		
		String[] driverNamesArray = new String[2];
		int index = 0;
		
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i].getCategory() == category) {
				driverNamesArray[index] = arr[i].getDriverName();
				index++;
			}
		}
		return driverNamesArray;
		
	}
	
	public String retriveMaximumDistanceTravelledDriver(Driver[] arr) {
		
		String driverWithMaxDistance = "";
		double maxDistance = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
		    if (arr[i].getTotalDistance() > maxDistance) {
		        maxDistance = arr[i].getTotalDistance();
		        driverWithMaxDistance = arr[i].getDriverName();
		    }
		}

		return driverWithMaxDistance;
		
	}
	
}
