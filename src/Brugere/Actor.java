package Brugere;

public class Actor {
	
	private String firstname, lastname;
	private static int ID;
	private String password = "";
	public boolean admin = false;
	
	public Actor(String firstname, String lastname, String password, boolean admin){
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.admin = admin;
		this.ID = ++ID;
		
	}
	
	public void setAdmin(boolean bool){
		this.admin = bool;
		
	}
	
	
	public String getPassword() {
		
		return this.password;
	}
	public String getName() {
		
		return "" + this.firstname + " " + this.lastname;
	}
	public void setPassword(String newPass) {
		this.password = newPass;
		
	}
	
	

}
