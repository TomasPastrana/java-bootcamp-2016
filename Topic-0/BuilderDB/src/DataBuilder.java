//build data and a method to retrieve the data
public interface DataBuilder {

	public void buildUrl();
	
	public void buildUserName();
	
	public void buildPass();
	
	public Data getData();
}
