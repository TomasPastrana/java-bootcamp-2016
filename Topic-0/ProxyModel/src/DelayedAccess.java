
public class DelayedAccess extends Access {
	//subclass Access
	public DelayedAccess(){
		try{
			//timer 5 sec
			Thread.sleep(5000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		//db url
		System.out.println("jdbc:mysql://localhost:3306/demodb");
	}
}
