package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DBConnectionSQL;
import dao.TrailCalculationDAO;
import dao.TrailcalculationDAO;
import domain.TrailCalculationDOM;
import domain.UserDOM;

public class TrailCalculationDAOIMPL implements TrailCalculationDAO {
	private final String INSERT_TRAILCALCULATION_SQL="INSERT INTO `trialcalculation` (`Loan_id`, `NICNO`, `Date`, `Loan_amount`, `Interest_rate`, `Repayment_period`, `Rental_value`) VALUES (NULL, ?, ?, ?, ?, ?, ?);";
	private final String GET_TRAILCALCULATION_SQL = "SELECT user.* , trialcalculation.Date,trialcalculation.Loan_amount,trialcalculation.Interest_rate,trialcalculation.Repayment_period,trialcalculation.Rental_value FROM `trialcalculation`,user WHERE `user`.`NICNO`=trialcalculation.NICNO, and `user`.`NICNO`=? ;" ;

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
	public boolean insert(TrailCalculationDOM trailcalculation) {
		
		return false;
	}

	@Override
	public ResultSet select(UserDOM userDOM) {
		// TODO Auto-generated method stub
		return null;
	}
	
/*
 * public class TrailCalculationDAOIMPL implements TrailcalculationDAO {
	
	private final String INSERT_TRAILCALCULATION_SQL="INSERT INTO `trialcalculation` (`Loan_id`, `NICNO`, `Date`, `Loan_amount`, `Interest_rate`, `Repayment_period`, `Rental_value`) VALUES (NULL, ?, ?, ?, ?, ?, ?);";
	private final String GET_TRAILCALCULATION_SQL = "SELECT user.Full_Name, trialcalculation.Date, trialcalculation.Loan_amount, trialcalculation.Interest_rate, trialcalculation.Repayment_period, trialcalculation.Rental_value FROM user, trialcalculation WHERE user.NICNO=trialcalculation.NICNO and user.NICNO=?;" ;
	
	@Override
	public boolean insert(TrailCalculationDOM trailcalculation) {
		boolean value=true;
		DBConnectionSQL newj=new DBConnectionSQL();
		Connection conn= newj.get_connection();		
		PreparedStatement ps;
			try {
				ps =conn.prepareStatement(INSERT_TRAILCALCULATION_SQL);
				ps.setString(1, trailcalculation.getNICNO());
				ps.setString(2, trailcalculation.getDate());
				ps.setDouble(3, trailcalculation.getLoan_amount());
				ps.setDouble(4, trailcalculation.getInterest_rate()*100);
				ps.setInt(5, trailcalculation.getRepayment_period());
				ps.setDouble(6, trailcalculation.getRental_value());
				int num=ps.executeUpdate();
					if(num<0) {
						value=false;
					}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return value;
	}

	@Override
	public ResultSet select(UserDOM userDOM) {
		ResultSet result=null;	
		DBConnectionSQL newconn=new DBConnectionSQL();
		Connection conn= newconn.get_connection();
		PreparedStatement statement;
		try {
			statement = conn.prepareStatement(this.GET_TRAILCALCULATION_SQL);
			statement.setString(1, userDOM.getNICNO());
			result = statement.executeQuery();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
		
	}
 */
}
