package java_28_05;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
        e.name = "Yash";
        e.age = 22;
        e.phoneNumber = 999999999 ;
        e.address = "Ahmedabad";
        e.salary = 50000;
        e.specialization = "Software Engineering";
        
        System.out.println("Employee Details:");
        System.out.println("Name: " + e.name);
        System.out.println("Age: " + e.age);
        System.out.println("Phone Number: " + e.phoneNumber);
        System.out.println("Address: " + e.address);
        System.out.println("Specialization: " + e.specialization);
        e.printSalary();
	}

}
