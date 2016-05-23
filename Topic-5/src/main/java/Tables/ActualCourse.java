package Tables;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Reference;

@Embedded
public class ActualCourse {

	@Reference
	private Course course;
	
	private int firstNote;
	private int secondNote;
	private int finalNote;
	
	public ActualCourse(){}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getFirstNote() {
		return firstNote;
	}
	public void setFirstNote(int firstNote) {
		this.firstNote = firstNote;
	}
	public int getSecondNote() {
		return secondNote;
	}
	public void setSecondNote(int secondNote) {
		this.secondNote = secondNote;
	}
	public int getFinalNote() {
		return finalNote;
	}
	public void setFinalNote(int finalNote) {
		this.finalNote = finalNote;
	}
}
