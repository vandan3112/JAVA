package Jdbc;

/*JDBC - steps to follow
 
 * 1. import the package           ---->Phone                       ---->SQL Package
 * 2. load or register the driver  ---->SIM card					---->"com.mysql.cj.jdbc.Driver"
 * 3. Establish the connection     ---->Call the particular person	---->forName(parameters);
 * 4. create the statement         ---->Prepare the question		---->createStatement();//Three types - statement, prepared statement and callable statement
 * 5. Execute the query            ---->Ask the question			---->executeQuery();
 * 6. process the result           ---->Speak back					---->
 * 7. close the connection         ---->Hang up the call			---->Close()
 */

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/Emp_details";
		String username = "root";
		String password = "Yash@5625";
		String query = "select ename from employee where eid = 3;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		
		String name = rs.getString("ename");
		System.out.println(name);
		
		st.close();
		con.close();
	}
}
