package assignment8;

public class Square extends Shape{

		public Square(double side) {
		this.side = side;
	}

		private double side;

		public double getSide() {
			return side;
		}

		public void setSide(double side) {
			this.side = side;
		}
		
		@Override
		public double area() {
			return side*side;
		}
		
		@Override
		public double perimeter() {
			return 4*side;
		}
}