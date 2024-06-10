
public class Student {
	
	private String name;
	
	public Student() {
		this.name = "Unknown";
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public void PrintName() {
		System.out.println("Student Name: " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student("Yash");
		
		s1.PrintName();
		s2.PrintName();
	}

}
