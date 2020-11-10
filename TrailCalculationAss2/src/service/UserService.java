package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;

import dao.impl.UserDAOIMPL;
import domain.UserDOM;

public class UserService {
/*
 * public UserDOM getUserData() {
		Scanner in = new Scanner(System.in);
		UserDOM userDOM=new UserDOM();
		String Full_name;
		System.out.println("Enter Your Full Name:");				
		Full_name= in.nextLine();		
		if(isWord(Full_name)) {
			//System.out.println("valid");
			String NICNO;
			System.out.println("Enter Your NICNO:");				
		    NICNO= in.nextLine();
			if(isWord1(NICNO)) {
				userDOM.setFull_name(Full_name);
				userDOM.setNICNO(NICNO);
			}
			else {
				System.out.println("Invalid Nic No!,Enter valid Nic No:");
			}
		}
		else {
			System.out.println("Invalid Full Name,Enter valid Full name:");
		}
		return userDOM;
		
	}

	private static boolean isWord(String full_name) {
		return Pattern.matches("[a-zA-Z]+", full_name);
	}
	private static boolean isWord1(String nicno) {
		return Pattern.matches("[a-zA-Z0-9]+", nicno);
	}

	public void checkavalability(UserDOM userDOM) {
		//creat userDaoimpl object for call data selecting methord
		UserDAOIMPL userDAOIMPL = new UserDAOIMPL();
		//creat resultset to get the retun value of selecting query
		ResultSet resultSet =userDAOIMPL.select(userDOM);
		try {
			if(resultSet.next()) {
				
			}
			else {
				userDAOIMPL.insert(userDOM);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 */
}
