
public class Builder {

	public static void main(String[] args) {
		
		DataBuilder dataBuilder = new MysqlDB();
		//data constructed via dataDirector.constructData()
		DataDirector dataDirector = new DataDirector(dataBuilder);
		dataDirector.constructData();
		Data data = dataDirector.getData();
		System.out.println("Accessing as: " + data);
		
		//Same process with Oracle DB.
		dataBuilder = new OracleDB();
		dataDirector = new DataDirector(dataBuilder);
		dataDirector.constructData();
		data = dataDirector.getData();
		System.out.println("Accessing as: " + data);
	}

}
