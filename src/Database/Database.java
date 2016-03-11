package Database;

import java.sql.*;

public class Database {
	
    private final String HOST     = "Localhost";
    private final int    PORT     = 3306;
    private final String DATABASE = "Datacenter";
    private final String USERNAME = "root"; 
    private final String PASSWORD = "";
    private Connection connection;
    
    public Database() {
        try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
			connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.exit(1);
		}
    }
    
    public Connection getConnection(){
    	return connection;
    }
    
    public ResultSet doQuery(String query) throws SQLException{
        Statement stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery(query);
        return res;
    }
    
    public void doUpdate(String query) throws SQLException{
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
    }
}
