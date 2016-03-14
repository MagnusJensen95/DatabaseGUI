package Brugere;
import java.util.ArrayList;
import Database.*;
import java.sql.*;



public class ActorDAO {


public static void addActor(String firstname, String lastname, String password, String email){
	//Actor newUser = new Actor(firstname, lastname, password, false);
	int id = 1;
	try {
		ResultSet rs = AccessController.getDatacenter().doQuery("Select * from users");
	while (rs.next()){
		id++;
	}
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	try {
		AccessController.getDatacenter().doUpdate("Insert into users values (" + id + ", '" + firstname + "' , '" + lastname + "' , '" + password + "' , '" + email + "')") ;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}

public static boolean deleteUser(int id, String table){
	boolean deleted = false;
	try {
		ResultSet rs = AccessController.getDatacenter().doQuery("Select * from " + table);
	while (rs.next()){
		if (rs.getInt("ID") == id){
			 AccessController.getDatacenter().doUpdate("Delete from " +table+ " where ID = " + id);
			 id++;
			 deleted = true;
			 break;
		}
	}
	while (rs.next()){
		if (rs.getInt("ID") == id){
			AccessController.getDatacenter().doUpdate("Update " +table+ " set ID  = " + (id-1) + " where ID = " +id);
			id++;
		}
	}
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	return deleted;
}

private int getTuples(String table){
	int tuple = 0;
	try {
		ResultSet rs = AccessController.getDatacenter().doQuery("Select * from " + table);
	while (rs.next()){
		tuple++;
	}
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	return tuple;
}

public static boolean emailUsed(String email){
	boolean used = false;
	
	ResultSet rs = null;
	int id = 0;
	try {
		rs = AccessController.getDatacenter().doQuery("Select * from users where email = '" + email + "'");
		while (rs.next()){
			id++;
		}
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	if (id >0){
		used = true;
	}
	
	return used;
}

public static boolean isUser(String password, String email){
	boolean user = false;
	ResultSet rs = null;
	int id = 0;
	try {
		rs = AccessController.getDatacenter().doQuery("Select * from users where email = '" + email + "' and password = '" +password + "'  ");
		while (rs.next()){
			id++;
		}
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	if (id >0){
		user = true;
	}
	
	return user;
}

}