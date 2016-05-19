package DB;

//MS_SQL Class
public class MS_SQL extends SQLType{

	@Override
	public String db_url(){
		return "jdbc:odbc:DemoDSN";
	}
	
}
