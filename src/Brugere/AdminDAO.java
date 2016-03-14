package Brugere;

import java.sql.ResultSet;
import java.sql.SQLException;

import Database.AccessController;

public class AdminDAO {

	public static void addAdmin(int id, String table){
	
		try {
			ResultSet rs = AccessController.getDatacenter().doQuery("Select * from " + table + " where ID = "+ id);
			if (rs.next())
			ActorDAO.addActor(rs.getString("Firstname"), rs.getString("Lastname"), rs.getString("Password"), rs.getString("email"), "admins");
			ActorDAO.deleteUser(id, table);
		
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


	

