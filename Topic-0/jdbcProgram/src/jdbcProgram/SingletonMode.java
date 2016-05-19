package jdbcProgram;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SingletonMode {
	
	private static String db_url = "jdbc:mysql://localhost";
    private static String db_port = "3306";
    private static String db_name = "tomas";
    private static String db_user = "admin";
    private static String db_password = "bootcamp";
    private static Statement connection;
    
    private SingletonMode() {    	
    	// Creation of an instance of the connection statement
    	connection = setConnection();
    }
    // Private method charge to set the connection statement
    private static Statement setConnection() {
    	
    	try {
    		String url = "" + db_url + ":" + db_port + "/" + db_name + "";
    	    java.sql.Connection conn = DriverManager.getConnection(url, db_user, db_password);
            //Creation of the Statement object
            java.sql.Statement state = conn.createStatement();
            return (Statement) state;
        }
    	catch (SQLException ex) {
    		Logger.getLogger(SingletonMode.class.getName()).log(Level.SEVERE, null, ex);
    	}
    	return null;
    }
    
    // Private inner class responsible for instantiating the single instance of the singleton
    private static class DbSingletonManagerHolder {
    	
    	private final static SingletonMode instance = new SingletonMode();
    }

    /**
    * @return
    Public method, which is the only method allowed to return an instance of 
    the singleton (the instance here is the database connection statement)
    */
    public static SingletonMode getInstance() {
    	try {
    		return DbSingletonManagerHolder.instance;
    	    }
    	catch (ExceptionInInitializerError ex) {
    		
    	    }
    	    return null;
    }
    public static Statement getStatement() {
    	return connection;
    }
}