package Brugere;

import java.sql.ResultSet;
import java.sql.SQLException;

import Database.AccessController;

public class AdminDAO {

	public static void addAdmin(int id, String table){
		ResultSet rs = null;
		try {
			rs = AccessController.getDatacenter().doQuery("Select * from " + table + " where ID = "+ id);
			//AccessController.getDatacenter().doUpdate("Insert into admins values (" + rs+")");
		
		} catch (SQLException e1) {
			System.err.println("Not at valid User");
			e1.printStackTrace();
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


	

