package DB;

//MySQL Class
public class MySQL extends SQLType{
	
	@Override
	public String db_url(){
		return "jdbc:mysql://localhost:3306/demodb";
	}
	
}
