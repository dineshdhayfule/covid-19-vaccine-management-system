package VaccineManagemntSystem.databse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class data2
{
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "system";
	private static String pass = "root";
	private static String driver = "oracle.jdbc.OracleDriver";
	 String sql;
     PreparedStatement stm=null;
     Statement st = null;
     Connection con = null;
     public int insertdash(ArrayList e) 
 	{   
 int a = 0;
try {

      Class.forName(driver);
      con = DriverManager.getConnection(url, user, pass);
      st = con.createStatement();
      sql = "INSERT into BookAppointment VALUES(?,?,?,)";
      
      stm = con.prepareStatement(sql);
      stm.setString(1, (String) e.get(0));
      stm.setString(2, (String) e.get(1));
      stm.setString(3, (String) e.get(2));
//      stm.setString(4, (String) e.get(3));
      a = stm.executeUpdate();

 	} catch (ClassNotFoundException e1) {
 		e1.printStackTrace();
 	} catch (SQLException i) {
 		i.printStackTrace();
 	} catch (Exception u) {
 		u.printStackTrace();
 	}	
 return a;
 	}
}
