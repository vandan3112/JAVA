package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {

	public static void main(String[] args) throws Exception{

		String url = "jdbc:mysql://localhost:3306/Emp_details";
		String username = "root";
		String password = "Yash@5625";
		
		int id = 5;
		String name = "Ronak";
		String desig = "HR";
		int sal = 45000;
		
		String query = "insert into employee values (?,?,?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, desig);
		ps.setInt(4, sal);
		
		int rs = ps.executeUpdate();
		
		System.out.println(rs + " row affected");
		
		ps.close();
		con.close();
	}

}
