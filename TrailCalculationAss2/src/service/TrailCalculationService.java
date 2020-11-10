package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import dao.impl.TrailCalculationDAOIMPL;
import domain.TrailCalculationDOM;
import domain.UserDOM;

public class TrailCalculationService {
	/*
	 * TrailCalculationDAOIMPL calculationDAOIMPL = new TrailCalculationDAOIMPL();
	
	public TrailCalculationDOM getLoandetails() {
		Scanner in = new Scanner(System.in);
		TrailCalculationDOM trailCalculationDOM = new TrailCalculationDOM();
		boolean value=false;
		String inputVal;
		
		System.out.println("Enter Lease/Loan Amount (Rs):");				
		inputVal= in.nextLine();
		while(value == false) {					
			try {
				trailCalculationDOM.setLoan_amount(Double.parseDouble(inputVal));
					value=true;							
				}
				catch(Exception e) {
					System.out.println("Error - Enter valid Loan amount:");
				}
			}
		
		value =false;
		System.out.println("Enter Interest Rate (Per year) :");
		inputVal=in.nextLine();
		while(value == false) {			
			try {
				trailCalculationDOM.setInterest_rate(Integer.parseInt(inputVal));			
				value=true;				
			}			
			catch(Exception e) {
				System.out.println("Error - Enter valid Interest Rate :");
			}
		}
		
		value=false;
		System.out.println("Enter Repayment Period (months) :");
		inputVal=in.nextLine();
		while(value == false) {
			try {
				trailCalculationDOM.setRepayment_period(Integer.parseInt(inputVal));
				value=true;
				}
			catch(Exception e) {
				System.out.println("Error - Enter Repayment Period correctly :");
			}
		}
	     

	    return trailCalculationDOM;
	}
	   
   //calculate rental value and save all detail to data base trial table
	public void saveDetails(TrailCalculationDOM trailCalculationDOM,UserDOM userDOM) {
    	double rental_value=(trailCalculationDOM.getLoan_amount()*(trailCalculationDOM.getInterest_rate()/12)/(1-((1/(Math.pow((1+(trailCalculationDOM.getInterest_rate()/12)),trailCalculationDOM.getRepayment_period()))))));
	    double output=(Math.round(rental_value*100))/100.0;
	    trailCalculationDOM.setRental_value(output); 
	    System.out.println("Loan Amount : Rs."+trailCalculationDOM.getLoan_amount());
	    System.out.println("Interest Rate : "+trailCalculationDOM.getInterest_rate()*100);
	    System.out.println("No of  Period : "+trailCalculationDOM.getRepayment_period());
	    System.out.println("Rental value : Rs."+trailCalculationDOM.getRental_value());
	    LocalDate date = LocalDate.now();
	    //trailCalculationDOM.setDate(date.toString());
	    trailCalculationDOM.setDate(date.toString());
	    /*using getNICNO mether in UserDOM object and put it as a value to setNICNO number 
	    methord in TrailCalculationDOM object*/
	 /*   trailCalculationDOM.setNICNO(userDOM.getNICNO()); 
	    boolean datasave=calculationDAOIMPL.insert(trailCalculationDOM);
	    if(datasave) {
	    	System.out.println("your data is saved");
	    	
	    }
	    else {
	    	System.out.println("your data is not saved");
	    }	    
    }
	
	public void getsumary(UserDOM userDOM) {
		ResultSet resultSet=calculationDAOIMPL.select(userDOM);
		try {
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1)+" \t "+resultSet.getString(2)+" \t "+resultSet.getString(3)+" \t "+resultSet.getString(4)+" \t "+resultSet.getString(5)+" \t "+resultSet.getString(6));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	 */

}
