import java.util.Scanner;

public class EmployeeData {
	
	private String name, designation;
	private int basicSalary;
	
	public EmployeeData() {
		name = "DEFAULT";
		designation = "DEFAULT";
		basicSalary = 00;
	}
	
	public EmployeeData(String nm, String desg, int sal) {
		name = nm;
		designation = desg;
		basicSalary = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "employeeD [name=" + name + ", designation=" + designation + ", basicSalary=" + basicSalary + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData e1 = new EmployeeData();
		EmployeeData e2 = new EmployeeData("Yash","CEO",350000);
		System.out.println(e1);
		System.out.println(e2);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.next();
		
		System.out.println("Enter designation: ");
		String designation = sc.next();
		
		System.out.println("Enter Salary: ");
		int salary = sc.nextInt();
		
		e1.setName(name);
		e1.setDesignation(designation);
		e1.setBasicSalary(salary);
		
		System.out.println(e1);
	}

}
