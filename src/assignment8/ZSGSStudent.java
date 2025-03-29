package assignment8;

public class ZSGSStudent extends Student{

	int batch;
	String course;
	
	public ZSGSStudent(String name, int age, int studentId, int batch, String course) {
		super(name, age, studentId);
		this.batch = batch;
		this.course = course;
		
	}
	
	public void display() {
		System.out.println("Name : "+ name + " Age : "+ age +" StudentID : "+ studentId +" Batch : "+ batch +" Course : "+
				course);
	}

	public static void main(String[] args) {
		
		ZSGSStudent student = new ZSGSStudent("Shabareesh", 22, 547,19, "JAVA");
		student.display();
	}

}