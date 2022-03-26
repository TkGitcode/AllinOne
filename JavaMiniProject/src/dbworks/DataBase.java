package dbworks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** 
* @Author -- TkGitcode
*/
public class DataBase {
 public static final Connection getConnection()
 {
	 Connection connection = null;
	 try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/promo", "root", "1234");
	} catch (SQLException e) {
		System.out.println(e);
	}
	 return connection;
 }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection=getConnection();

	    PreparedStatement FirstPreparedStatement = connection.prepareStatement("insert into promo1 values(?,?)");
		int a = 34;
		int b= 850;
		FirstPreparedStatement.setInt(1, a);
		FirstPreparedStatement.setInt(2, b);
		FirstPreparedStatement.execute();
		
		Statement stmt = connection.createStatement();
        String s="select * from promo1";
         ResultSet rs = stmt.executeQuery(s);
         while(rs.next()) {
        	 System.out.println(rs.getString(1)+" "+rs.getString(2));
         }
	}
	
	

}
