package assignment8;

public class Bike extends Vehicle{

	int engineCapacity;
	String type;
	
	public Bike(String brand,String model, int year,int engineCapacity, String type) {
		super(brand,model,year);
		this.engineCapacity = engineCapacity;
		this.type = type;
	}
	
	public void kickStart() {
		System.out.println("Bike Start Using Kicker");
	}
	
	public void applyBrakes() {
		System.out.println("Bike Stop Using Brake");
	}

	public void displayDetails() {
		System.out.println("Bike Brand : "+ brand + " Model : "+ model + " Year : "+ year + " EngineCapacity : "+ engineCapacity
				+ " Type : "+ type);
	}
}