import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

	private static Connection con=null;
	
	public static Connection getConnection(){
		
		try{
			if(con == null){
				
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/highSchool";
				String user = "root";
				String pass = "Recargado123";
				Class.forName(driver);
				con = DriverManager.getConnection(url,user,pass);
				System.out.println("Connection Succesfull");
			}
		}
		catch (ClassNotFoundException | SQLException ex){
			ex.printStackTrace();
		}
		return con;
	}
}
