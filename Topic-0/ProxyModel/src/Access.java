import java.util.Date;

public abstract class Access {
	//abstract class with message including date and time displayed.
	public void accessConfirmation(){
		System.out.println(this.getClass().getSimpleName() + " Accessing at: " + new Date());
	}
}
