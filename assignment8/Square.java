package assignment8;

public class Square extends Rectange{

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