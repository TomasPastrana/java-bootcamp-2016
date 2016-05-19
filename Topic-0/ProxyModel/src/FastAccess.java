
public class FastAccess extends Access {
	//subclass Access with db url
	public FastAccess(){
		System.out.println("jdbc:oracle:thin@myserver:1521:demodb");
	}
}
