package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** 
* @Author -- TkGitcode
*/
public class demo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver"); 
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/promo", "root", "1234");
	        Statement stmt = conn.createStatement();
	        String s="select * from promo1;";
	         ResultSet rs = stmt.executeQuery(s);
	         while(rs.next()) {
	        	 System.out.println(rs.getInt(1)+" "+rs.getInt(2));
	         }
	         int a=45;
	         System.out.println(a>18 ? "Age abouve 18" : "Below 18");
}

}
