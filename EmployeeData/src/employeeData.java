
public class employeeData {

	private String ename;
	
	public void setName(String name) {
		ename = name;
	}
	
	public void getName() {
		System.out.println(ename);
	}
	
	public static void main(String[] args) {
		employeeData e1 = new employeeData();
		
		e1.setName("Yash");
		e1.getName();
	}

}
