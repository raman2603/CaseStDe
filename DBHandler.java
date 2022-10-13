package CaseStudy;

import java.sql.*;
public class DBHandler {
	
	public static Connection establishConnection() {
		Connection connection=null;
		try
		{
		Class.forName("org.postgresql.Driver");
		 connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Package_Details","postgres","Password");
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
		return connection;
	}
}
