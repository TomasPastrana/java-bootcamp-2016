//same as MysqlDB Class.
public class OracleDB implements DataBuilder{

	private Data data;
	
	public OracleDB(){
		data = new Data();
	}
	
	@Override
	public void buildUrl(){
		data.setUrl("jdbc:oracle:thin@myserver:1521:demodb");
	}
	@Override
	public void buildUserName(){
		data.setUserName("Admin1");
	}
	@Override
	public void buildPass(){
		data.setPass("bootcamp1");
	}
	
	@Override
	public Data getData(){
		return data;
	}
}
