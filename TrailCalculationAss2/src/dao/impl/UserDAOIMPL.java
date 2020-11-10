package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DBConnectionSQL;
import dao.UserDAO;
import domain.UserDOM;

public class UserDAOIMPL implements UserDAO  {
	
	private final String INSERT_USER_SQL = "INSERT INTO `user` (`NICNO`, `Full_Name`) VALUES (?, ?);";	
	private final String GET_USER_SQL = "SELECT * FROM `user` WHERE `NICNO`=?;" ;
	
	protected Connection getConnection() throws ClassNotFoundException{
		Connection c = null;
		try {
			c=DriverManager.getConnection("jdbc:sqlite:dbcalculation.db");
		}catch(SQLException e) {
			e.printStackTrace();			
		}		
		return c;
	}

	@Override
	public boolean insert(UserDOM user) {
		boolean value = true;
		Connection c = null;
		try {
			c = this.getConnection();
			PreparedStatement ps = c.prepareStatement(INSERT_USER_SQL);
			ps.setString(1, user.getFull_name());
			ps.setString(2, user.getNICNO());			
			ps.execute();
			System.out.println("insert Details"+ ps.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.toString());
		}
		
		return value;
	}

	@Override
	public ResultSet select(UserDOM user) {
		ResultSet result=null;	
		Connection c = null;
		try {
			PreparedStatement ps = c.prepareStatement(GET_USER_SQL);
			ps.setString(1,user.getNICNO());
			result= ps.executeQuery();
			System.out.println("Get result "+ ps.toString());
			if(!result.isBeforeFirst()&&result.getRow()==0) {
				while(result.next());{					
					 ((UserDOM) ps).setNICNO(result.getString(""));										
				}
			}
			else {
			System.out.println("not found");
		    }			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}	
	/*
	 * public class UserDAOIMPL implements UserDAO {
	
	private final String INSERT_USER_SQL = "INSERT INTO `user` (`NICNO`, `Full_Name`) VALUES (?, ?);";	
	private final String GET_USER_SQL = "SELECT * FROM `user` WHERE `NICNO`=?;" ;

	@Override
	public boolean insert(UserDOM user) {
		boolean working=true;
		DBConnectionSQL newj=new DBConnectionSQL();
		Connection conn= newj.get_connection();		
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(INSERT_USER_SQL);
			ps.setString(2, user.getFull_name());
			ps.setString(1, user.getNICNO());			
			int count=ps.executeUpdate();
			if(count<0) {
				working=false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			} 
	
		return working;
	}

	@Override
	public ResultSet select(UserDOM user) {
		ResultSet result=null;	
		DBConnectionSQL newconn=new DBConnectionSQL();
		Connection conn= newconn.get_connection();
		PreparedStatement statement;
		try {
			statement = conn.prepareStatement(this.GET_USER_SQL);
			statement.setString(1, user.getNICNO());
			result = statement.executeQuery();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
		
	}
	 */
}
