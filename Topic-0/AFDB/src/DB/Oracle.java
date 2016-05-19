package DB;

// Oracle class
public class Oracle extends SQLType {
	
	@Override
	public String db_url(){
		return "jdbc:oracle:thin@myserver:1521:demodb";
	}
	
}
