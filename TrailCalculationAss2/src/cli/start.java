package cli;

import java.util.Scanner;

import domain.TrailCalculationDOM;
import domain.UserDOM;
import service.TrailcalculationSERVICE;
import service.UserSERVICE;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scanner= new Scanner(System.in);
		UserDOM userDOM= new UserDOM();
		TrailCalculationDOM trailCalculationDOM = new TrailCalculationDOM();
		
		TrailcalculationSERVICE trailcalculationSERVICE =new TrailcalculationSERVICE();
		UserSERVICE userSERVICE = new UserSERVICE();
		String word = "New";
		System.out.println(" enter "+word+" for new session");	
		System.out.println(" enter 'Exit' for end the programe");
		System.out.println();
		String userinput=scanner.next();
		while(!userinput.equals("Exit")) {
			if(userinput.equals("New")) {
				userDOM=userSERVICE.getUserData();
				
				userSERVICE.checkavalability(userDOM);
				
				System.out.println("Enter no 1 for Loan calculation");
				System.out.println("Enter no 2 for View Loan Calculation Summary");
				System.out.println("Enter no 0 for Exit the session");
				String x=scanner.next();
				while(!x.equals("0")) {
					if(x.equals("1")) {
						trailCalculationDOM=trailcalculationSERVICE.getLoandetails();
						trailcalculationSERVICE.saveDetails(trailCalculationDOM, userDOM);
						
					}
					else if(x.equals("2")) {
						trailcalculationSERVICE.getsumary(userDOM);
					}
					else {
						System.out.println("wrong input");
					}
					System.out.println("Enter no 1 for Loan calculation");
					System.out.println("Enter no 2 for View Loan Calculation Summary");
					System.out.println("Enter no 0 for Exit the session");
					System.out.println();
					x=scanner.next();
				}
				
			}
			else {
				System.out.println("wrong input");
			}
			System.out.println();
			System.out.println(" enter "+word+" for new session");	
			System.out.println(" enter 'Exit' for end the programe");
			userinput=scanner.next();

		}
		System.out.println("System is off");
		
	}
		 */

	}

}
