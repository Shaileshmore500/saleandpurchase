package Com.Helper;



import java.sql.*;



public class ConnectionProvider {

	private static Connection con;
	
	public static Connection getConnection() {
		
		
		try {
//			
			System.out.println("hii1");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("hii2");
			con = DriverManager.getConnection("jdbc:mysql://localhost:8080/a", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
			
		} 
	
		
	
		return con;
	}
	
}
