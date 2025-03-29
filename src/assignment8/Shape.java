package assignment8;

abstract class Shape {

		abstract double area();
		abstract double perimeter();
	
		public void display() {
			
			System.out.println(this.getClass().getSimpleName());
			System.out.println("Area : "+area());
			System.out.println("Perimeter : "+perimeter());
			System.out.println("        ---------------------");
		}		
}