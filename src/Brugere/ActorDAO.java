package Brugere;
import java.util.ArrayList;



public class ActorDAO {
	
	public static ArrayList<Actor> actors = new ArrayList<Actor>();


public void addActor(String firstname, String lastname, String password, boolean bool){

	Actor newbro = new Actor(firstname, lastname, password, bool); 
	actors.add(newbro);
	
}


}