package javetrial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class jdbcconnetor {
	static Connection conn=null;
	static String databaseName="hr";
	static String url=" jdbc:mysql://localhost:3306/" + databaseName;
	static String userName="root";
	static String password="Sylhetbd07";
	
	
	
	public static void main(String[]args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		conn= DriverManager.getConnection(url,userName,password);
	
		PreparedStatement ps=conn.prepareCall("INSERT INTO 'hr'.'employees' ('name') VALUES ('hashim pollob'); ");
		
		int status=ps.executeUpdate();
		if(status !=0) {
			System.out.println(" Database was connecrted");
			System.out.println(" record was inserted");
			
			
		}
		
		
		
	}

}
