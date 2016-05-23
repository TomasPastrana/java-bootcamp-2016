package Tables;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class Schedule {
	//Atributes
	private String day;
	private String startingTime;
	private String finishingTime;
	
	//getters and setters
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getStartingTime() {
		return startingTime;
	}
	public void setStartingTime(String startingTime) {
		this.startingTime = startingTime;
	}
	public String getFinishingTime() {
		return finishingTime;
	}
	public void setFinishingTime(String finishingTime) {
		this.finishingTime = finishingTime;
	}
	
}
