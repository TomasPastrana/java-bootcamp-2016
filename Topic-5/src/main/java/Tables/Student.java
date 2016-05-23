package Tables;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.annotations.*;

import BaseEntity.BaseEntity;

@Entity
public class Student extends BaseEntity{
	
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private int studentId;
	private int registrationNumber;
	@Embedded
	private List<ActualCourse> courses;
	
	public Student(){
		courses = new ArrayList<ActualCourse>();
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

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public List<ActualCourse> getCourses() {
		return courses;
	}

	public void setCourses(List<ActualCourse> courses) {
		this.courses = courses;
	}
}
