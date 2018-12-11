package parking;

import java.io.Console;

public class MainParking {

	public static void main(String[] args) {
		Parking park = Parking.instance(); //new singleton object
		Vehicle v = null; //Polymorph object

		String ch = "v";

		Console con = System.console();
		while (!(ch.equals("3"))) {
			if (park.checkVehilesSize() == 50) {
				System.out.println("The parking lot is full. No available spaces. Come again later");
				return;
			} 
			int availablePositions = 50 - park.checkVehilesSize();
			System.out.println("There are " + availablePositions + " available parking spots");
			System.out.println("Tell us what you want to do by pressing the right keys...");
			System.out.println("PRESS 1 - FOR ENTERING NEW CAR\t\t\t"+"PRESS 2 - TO PAY AND EXIT");
			System.out.println("\t\t\tPRESS 3 - TO EXIT PROGRAM");
			ch  = con.readLine();
			switch (ch) {
			case "1":
				System.out.println("Bring your vehicle in the parking lot");
			
				System.out.println("Press 1 for car & 2 for motorbike");
				String h = con.readLine();
				while (!h.equals("1") && !h.equals("2")) {
					System.out.println("please provide VALID  argument. 1 for car or 2 for moto");
					h = con.readLine();
				}
				if (h.equals("2")) {
					v = new Motorcycle();
					System.out.println("Give license plate number for motorbike...");
					String a = con.readLine();
					v.setAk(a);
					System.out.println("Give motorbike brand...");
					String a3 = con.readLine();
					v.setBrand(a3);
					System.out.println("Give motorbike model...");
					String a4 = con.readLine();
					v.setModel(a4);
					System.out.println("Give motorbike color...");
					String a5 = con.readLine();
					v.setColor(a5);
					park.enterVehile(v);
					System.out.println("Thank you!!!!!");
					break;
				}
				else if (h.equals("1")) {
					System.out.println("Give license plate number...");
					String a = con.readLine();
					v = new Car();
					v.setAk(a);
					System.out.println("Give car brand...");
					String a3 = con.readLine();
					v.setBrand(a3);
					System.out.println("Give car model...");
					String a4 = con.readLine();
					v.setModel(a4);
					System.out.println("Give car color...");
					String a5 = con.readLine();
					v.setColor(a5);
					park.enterVehile(v);
					System.out.println("Thank you!!!!!");
					break;
				} else {
					
				}
			case "2":
				System.out.println("Pay & exit");
				System.out.println("Please give license plate");
				String e = con.readLine(); 
				park.exitVehile(e);
				park.getPrice(e);
				park.deleteVehile(e);
				break;
			case "3":
				System.out.println("EXIT PROGRAM");
				break;
			default:
				System.out.println("You provided wrong input. Hit 3 to exit");
				break;
			}
		}
	}
}

