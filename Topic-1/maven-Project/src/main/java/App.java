
public class App {

	public static void main(String[] args) {
		
		System.out.println(getUrl());
	}
	
	public static String getUrl(){
		return "jdbc:mysql://localhost:3306/demodb";
	}
	
	public static String getUserName(){
		return "Admin";
	}
}
