package parking;

import java.util.Date;


public  class Parking {

	private static Parking parking = new Parking();
	private Vehicle [] vehicles;
	private Date [] dateEntry;
	private Date [] dateExit;
	private int temp = 0;


	private Parking() {
		vehicles= new Vehicle[50];
		dateEntry= new Date[50];
		dateExit = new Date[50];
		Car c1 = new Car("xt1234","BMW","520","PINK");
		Motorcycle m1 = new Motorcycle("it4321","VOLVO","V40","RED");
		vehicles[0] = c1;
		vehicles[1] = m1;
		Date date1 = new Date();
		Date date2 = new Date();
		dateEntry[0] = date1;
		dateEntry[1] = date2;
	}

	public static Parking instance() {
		return parking;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public static Parking getParking() {
		return parking;
	}

	public static void setParking(Parking parking) {
		Parking.parking = parking;
	}

	public Vehicle[] getVehiles() {
		return vehicles;
	}

	public void setVehiles(Vehicle[] vehiles) {
		this.vehicles = vehiles;
	}

	public Date[] getDateEntry() {
		return dateEntry;
	}

	public void setDateEntry(Date[] dateEntry) {
		this.dateEntry = dateEntry;
	}

	public Date[] getDateExit() {
		return dateExit;
	}

	public void setDateExit(Date[] dateExit) {
		this.dateExit = dateExit;
	}


	public Vehicle[] getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle[] vehicles) {
		this.vehicles = vehicles;
	}

	public void enterVehile(Vehicle vehicle) {
		for (int i =0; i<vehicles.length; i++) {
			if (vehicles[i] == null) {
				vehicles[i]= vehicle;
				Date date = new Date();
				dateEntry[i] = date;
				System.out.println(date);
				System.out.println(vehicle);	
				break;
			}
		}
	}

	public void exitVehile(String ak) {
		
			//System.out.println("Eksw apo tin for exitVehile method 1");
			for (int i=0; i <vehicles.length; i++) {
				if (vehicles[i] != null && vehicles[i].getAk().equals(ak)) {
					Date date = new Date();
					dateExit[i] = date;
					temp = i;
					System.out.println("mesa sti for");
					break;
				}
				//System.out.println("mesa sti for eksw apo to if");

				//System.out.println(vehicles[i]);
				// to i kanei mono dio girous osa kai ta amaksia mesa
				if(i == checkVehilesSize()-1) {
					//System.out.println(vehicles.length);
					System.out.println("Sto klepsane");}
			}
		
	}


	public void getPrice(String ak) {
		
			for (int i=0; i<vehicles.length; i++) {
				if (vehicles[i] != null && vehicles[i].getAk().equals(ak)) {
					System.out.println(dateExit[i]);
					Vehicle vehicle = getVehiles()[i];
					System.out.println("The price for " + vehicle.getAk() + " is: "+vehicle.pay());
					System.out.println(vehicles[i]);
					break;
				} 
				//				else{
				//					System.out.println("getPriceMethod");
				//				}System.out.println("getPrice eksw apo if else");
			}
		

	}



	public void deleteVehile(String ak) {
		
			for (int i=0; i<vehicles.length; i++) {
				if (vehicles[i] != null && vehicles[i].getAk().equals(ak)) {
					vehicles[i] = null;
					dateEntry[i] = null;
					dateExit[i] = null;
					System.out.println(vehicles[i]+ " EFIGE");
					break;
				}
				//				else {
				//					System.out.println("Delete method");
				//				}
			}
	}

	public long remainingTime () {
		long remaining = 0;
		remaining = ( getDateExit()[temp].getTime()-getDateEntry()[temp].getTime());
		return remaining;
	}

	public int checkVehilesSize() {
		int count = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if(vehicles[i] != null)
				count ++;
		}
		return count;
	}
}
