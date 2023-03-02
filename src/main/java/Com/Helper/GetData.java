package Com.Helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class GetData {
	
	
	public static ResultSet getData(String sql)
	{
		try {
			Connection con = ConnectionProvider.getConnection();
		Statement stmt=con.createStatement();
		ResultSet set=stmt.executeQuery(sql);
		System.out.println(1);
		return set;
		}
		catch(Exception e)
		{
			
		}
	return null;	
	}
	
	

	public GetData() {
		// TODO Auto-generated constructor stub
	}

}
