//constructor creates data and it's methods are implemented to build
//user data and url of the data base.
public class MysqlDB implements DataBuilder{
private Data data;
	
	public MysqlDB(){
		data = new Data();
	}
	
	@Override
	public void buildUrl(){
		data.setUrl("jdbc:mysql://localhost:3306/demodb");
	}
	@Override
	public void buildUserName(){
		data.setUserName("Admin2");
	}
	@Override
	public void buildPass(){
		data.setPass("bootcamp2");
	}
	
	@Override
	public Data getData(){
		return data;
	}
}
