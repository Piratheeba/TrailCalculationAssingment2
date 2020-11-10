package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionSql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c=DriverManager.getConnection("jdbc:sqlite:dbcalculation.db");
			System.out.println("Connected");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	/*
	 * public class DBConnectionSQL {

	public  Connection get_connection() {
		Connection c = null;
		try {			
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tcalculation","root","");
		} 
		catch (Exception e) {
			System.out.print(e);
		}
		return c;
	}
	 */
}
