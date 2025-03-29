package assignment8;

public class Car extends Vehicle{
	
	int numDoors;
	String fuelTypes;
	
	public Car(String brand, String model,String type,int engineCapacity,int year,int numDoors, String fuelTypes) {
		super(brand,model,year);
		this.numDoors = numDoors;
		this.fuelTypes = fuelTypes;
	}
	
	public void honk() {
		System.out.println("Beep..! Beep....!");
	}
	
	public void openTrunk() {
		System.out.println("The Trunk is Opened");
	}
	
	public void displayDetails() {
		System.out.println("Car Brand : "+ brand + " Model : "+ model + " Year : "+ year + " NumDoors : " + numDoors + 
				" FuelType : "+ fuelTypes);
	}
	
	public static void main(String[] args) {
		
		Vehicle bike = new Bike("BMW","S454",56,450, "Petrol");		
		bike.displayDetails();
		
		System.out.println("                      -------------------------------              ");
		
		Vehicle car = new Car("Audi","S43","Race",40,2002,6,"Diesel");
		car.displayDetails();
	}
}