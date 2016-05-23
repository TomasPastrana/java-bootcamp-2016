package Mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;

//singleton for connection to database
public class DBConnection {

	private static MongoClient mongoClient = null;
	private static DBConnection connection = null;
	
	private DBConnection(String host, int port){
		mongoClient = new MongoClient(host, port);
	}
	
	//start connection if not already running
	public static DBConnection getInstance(){
		if(mongoClient == null){
			try{
				connection = new DBConnection("localhost", 27017);
				System.out.println("Connected!");
			} catch(MongoException ex){
				ex.printStackTrace();
			}
		} else{
			System.out.println("Connection already running");
		}
		return connection;
	}
	public void CloseDBConnection(){
		if(mongoClient != null){
			connection.CloseDBConnection();
			System.out.println("terminated");
		}
	}
}
