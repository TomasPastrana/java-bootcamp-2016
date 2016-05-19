
public class DataDirector {
	//parameter in constructor
	private DataBuilder dataBuilder = null;
	
	public DataDirector(DataBuilder dataBuilder){
		this.dataBuilder = dataBuilder;
	}
	//different type of data will be assembled by the DataDirector
	//depending on the Concrete Builder passed in to the constructor
	public void constructData(){
		dataBuilder.buildUrl();
		dataBuilder.buildUserName();
		dataBuilder.buildPass();
	}
	
	public Data getData(){
		return dataBuilder.getData();
	}
}
