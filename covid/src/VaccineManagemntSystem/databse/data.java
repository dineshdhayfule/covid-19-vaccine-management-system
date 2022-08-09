package VaccineManagemntSystem.databse;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class data {
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "system";
	private static String pass = "root";
	private static String driver = "oracle.jdbc.OracleDriver";
	 String sql;
     PreparedStatement stm=null;
     Statement st = null;
     Connection con = null;
     int a = 0; 
	public int insertIntoDB(ArrayList<String> e) 
	{
		   
try {

     Class.forName(driver);
     con = DriverManager.getConnection(url, user, pass);
     st = con.createStatement();
     sql = "INSERT into registration VALUES(insert1.nextval,?,?,?,?,?,?,?)";
     
     stm = con.prepareStatement(sql);
     stm.setString(1, (String) e.get(0));
     stm.setString(2, (String) e.get(1));
     stm.setString(3, (String) e.get(2));
     stm.setString(4, (String) e.get(3));
     stm.setString(5, (String) e.get(4));
     stm.setString(6, (String) e.get(5));
     stm.setString(7, (String) e.get(6));
     a = stm.executeUpdate();
	}catch(Exception e1)
{
		System.out.println(e);

}
return a;
	}
	
	public int login ( String id , String pass )
	{	
		ResultSet rs = null;
		String pass11 = null;
		String name = null ;
		int b = 0;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url , user , "root");
			st = con.createStatement();
			sql = "select * from registration where PHONENO = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(1, id);
			rs = stm.executeQuery();
			
			if(	rs.next()==false)
			{	
				b = 1;
			}
			else
			{
				do
				{
					pass11 = rs.getString(1);
					name = rs.getString(2);
				}while(rs.next());
			}
			if(pass11.equals(pass11))
			{
				JOptionPane.showMessageDialog(null, "Welcome "+name);
			}
			else {
				b = 2;
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException i) {
			i.printStackTrace();
		} catch (Exception u) {
			u.printStackTrace();
		}	
		return b;
	}
	
	
}