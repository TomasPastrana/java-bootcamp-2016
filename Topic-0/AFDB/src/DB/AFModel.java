package DB;
//main method
import DB.SQLType;

public class AFModel {
	//creates an AbstractFactory object from DBFactory
	//and we obtain three types of connections.
	public static void main(String[] args) {
		DBFactory dbfactory = new DBFactory();
		
		SQLType a1 = dbfactory.getSQLType("ms_sql");
		System.out.println("url: " + a1.db_url());
		
		SQLType a2 = dbfactory.getSQLType("mysql");
		System.out.println("url: " + a2.db_url());
		
		SQLType a3 = dbfactory.getSQLType("oracle");
		System.out.println("url: " + a3.db_url());
	}

}
