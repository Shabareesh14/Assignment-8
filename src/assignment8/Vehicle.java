package assignment8;

public class Vehicle {
	String brand;
	String model;
	int year;
	
	public Vehicle(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public void start() {
		System.out.println("Start Engine");
	}
	
	public void stop() {
		System.out.println("Stop Engine");
	}
	
	public void displayDetails() {
		System.out.println("Brand : "+ brand + " Model : "+ model + " Year : "+ year);
	}
}