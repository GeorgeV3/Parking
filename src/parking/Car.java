package parking;

public class Car extends Vehicle {

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String ak, String brand, String model, String color) {
		super(ak, brand, model, color);
		// TODO Auto-generated constructor stub
	}

	public double  pay() {
		Parking parking = Parking.instance();
		double remaining = parking.remainingTime();

		double price = (remaining*2)*0.24;
		return price;
	}

}
