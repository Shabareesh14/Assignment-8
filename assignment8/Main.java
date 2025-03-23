package assignment8;

public class Main {

	public static void main(String[] args) {
		
		Shape[] shapes = {new Circle(5),new Rectange(),new Square()};
		
		for(Shape shape : shapes) {
				System.out.println(shape.getClass().getSimpleName()+"Area : "+shape.area()+" "+
						"Perimeter : "+shape.perimeter());
		}
	}

}