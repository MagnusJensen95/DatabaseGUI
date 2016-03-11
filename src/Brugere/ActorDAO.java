package Brugere;
import java.util.ArrayList;
import Database.*;
import java.sql.*;



public class ActorDAO {


public static void addActor(String firstname, String lastname, String password){
	Actor newbro = new Actor(firstname, lastname, password, false);
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
		AccessController.getDatacenter().doUpdate("Insert into users values (" + id + ", '" + firstname + "' , '" + lastname + "' , '" + password + "' )");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}


}