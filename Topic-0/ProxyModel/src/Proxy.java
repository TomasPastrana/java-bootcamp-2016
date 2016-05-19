import java.util.Date;

public class Proxy {

	DelayedAccess delayedAccess;
	
	public Proxy(){
		System.out.println("Creating proxy at: " + new Date());
	}
	//DelayedAccess object created on demand
	public void accessConfirmation(){
		if(delayedAccess == null){
			delayedAccess = new DelayedAccess();
		}
		delayedAccess.accessConfirmation();
	}
}
