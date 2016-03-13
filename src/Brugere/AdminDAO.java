package Brugere;

import java.sql.ResultSet;
import java.sql.SQLException;

import Database.AccessController;

public class AdminDAO {

	public static void addAdmin(String firstname, String lastname, String password, String email){
		//Actor newUser = new Actor(firstname, lastname, password, false);
		int id = 1;
		try {
			ResultSet rs = AccessController.getDatacenter().doQuery("Select * from admins");
		while (rs.next()){
			id++;
		}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			AccessController.getDatacenter().doUpdate("Insert into admins values (" + id + ", '" + firstname + "' , '" + lastname + "' , '" + password + "', '"+ email + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
		public static boolean isAdmin(String password, String email){
			boolean admin = false;
			ResultSet rs = null;
			int id = 0;
			try {
				rs = AccessController.getDatacenter().doQuery("Select * from admins where email = '" + email + "' and password = '" +password + "'  ");
				while (rs.next()){
					id++;
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if (id >0){
				admin = true;
			}
			
			return admin;
		}
		
		
		
		
	}


	

