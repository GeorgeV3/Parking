package parking;

public abstract  class Vehicle implements payable {
	
	private String ak;
	private String brand;
	private String model;
	private String color;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String ak, String brand, String model, String color ) {
		super();
		this.ak = ak;
		this.brand = brand;
		this.model = model;
		this.color = color;
		
	}

	public String getAk() {
		return ak;
	}

	public void setAk(String ak) {
		this.ak = ak;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehile [ak=" + ak + ", brand=" + brand + ", model=" + model + ", color=" + color +"]";
	}

	

	
}
