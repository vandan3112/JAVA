
import java.io.*;

public class DemoBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int sal;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("Enter name"); 
			name= br.readLine();
			 
			System.out.println("Enter Salary");
			sal = Integer.parseInt(br.readLine());
			
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
