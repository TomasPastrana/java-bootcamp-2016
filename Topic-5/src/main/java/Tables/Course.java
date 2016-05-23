package Tables;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;

import BaseEntity.BaseEntity;

@Entity
public class Course extends BaseEntity{

	private String courseName;
	private int WeeklyHours;
	private int year;
	@Embedded
	private List<Schedule> schedule;
	@Reference
	private List<Student> students;
	@Reference
	private List<Teacher> teachers;
	
	public Course(){
		schedule = new ArrayList<Schedule>();
		students = new ArrayList<Student>();
		teachers = new ArrayList<Teacher>();
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getWeeklyHours() {
		return WeeklyHours;
	}
	public void setWeeklyHours(int weeklyHours) {
		WeeklyHours = weeklyHours;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<Schedule> getSchedule() {
		return schedule;
	}
	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
}
