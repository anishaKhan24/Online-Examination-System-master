package oes.db;
import java.sql.Connection;
import java.sql.DriverManager;

public class Provider {
	
	public static Connection getOracleConnection()
	{
		Connection con = null;
		try
		{ 
                    //register driver
                    Class.forName("oracle.jdbc.OracleDriver");
			//establish connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","12345");
					
		}
		catch (Exception e) {
			
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return con;
	}
}
	