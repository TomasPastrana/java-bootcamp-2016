package Tables;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;

import BaseEntity.BaseEntity;

@Entity
public class Teacher extends BaseEntity{

	private String firstName;
	private String lastName;
	private String dateOfBirth;
	@Reference
	private List<Course> courses;
	
	public Teacher(){
		courses = new ArrayList<Course>();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String string) {
		this.dateOfBirth = string;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
