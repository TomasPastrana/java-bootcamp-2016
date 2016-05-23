package Mongo;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import com.mongodb.MongoClient;

import Tables.ActualCourse;
import Tables.Course;
import Tables.Schedule;
import Tables.Student;
import Tables.Teacher;

public class App {

	public static void main(String[] args) {		
		
		String DBName = "highSchool2";
		MongoClient mongoClient = new MongoClient();
		Morphia morphia = new Morphia();
		Datastore dataStore = morphia.createDatastore(mongoClient, DBName);
		
		//mapping classes with morphia
		morphia.map(Student.class);
		morphia.map(Teacher.class);
		morphia.map(Course.class);
		morphia.map(ActualCourse.class);
		morphia.map(Schedule.class);
		//-------------------------
		//creating schedules for courses
		List<Schedule> scElectronic = new ArrayList<Schedule>();
		List<Schedule> scMechanic = new ArrayList<Schedule>();
		List<Schedule> scElectricity = new ArrayList<Schedule>();
		
		Schedule sc1 = new Schedule();
		Schedule sc2 = new Schedule();
		Schedule sc3 = new Schedule();
		//setting day
		sc1.setDay("Monday");
		sc2.setDay("Tuesday");
		sc3.setDay("Wednesday");
		//setting time
		sc1.setStartingTime("08:00:00");
		sc1.setFinishingTime("09:00:00");
		sc2.setStartingTime("09:00:00");
		sc2.setFinishingTime("10:00:00");
		sc3.setStartingTime("10:00:00");
		sc3.setFinishingTime("11:00:00");
		//adding schedules
		scElectronic.add(sc1);
		scMechanic.add(sc2);
		scElectricity.add(sc3);
		//-------------------------
		//creating courses
		Course c1 = new Course();
		Course c2 = new Course();
		Course c3 = new Course();
		
		c1.setCourseName("Electronic");
		c2.setCourseName("Mechanic");
		c3.setCourseName("Electricity");
		//setting weekly hours
		c1.setWeeklyHours(6);
		c2.setWeeklyHours(4);
		c1.setWeeklyHours(2);
		//setting year
		c1.setYear(2016);
		c2.setYear(2016);
		c2.setYear(2016);
		//adding schedule to course
		c1.setSchedule(scElectronic);
		c2.setSchedule(scMechanic);
		c3.setSchedule(scElectricity);
		//adding course to database
		dataStore.save(c1);
		dataStore.save(c2);
		dataStore.save(c3);
		//-------------------------
		//creating teacher
		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher();
		Teacher t3 = new Teacher();
		//set names and birth dates
		t1.setFirstName("Ana");
		t1.setLastName("Trenzo");
		t2.setFirstName("Rosa");
		t2.setLastName("Perez");
		t3.setFirstName("Federico");
		t3.setLastName("Daza");
		t1.setDateOfBirth("1969-08-02");
		t2.setDateOfBirth("1980-09-05");
		t3.setDateOfBirth("1975-04-23");
		//giving courses to teachers
		t1.getCourses().add(c1);
		t2.getCourses().add(c3);
		t3.getCourses().add(c2);
		//adding teachers to data base
		dataStore.save(t1);
		dataStore.save(t2);
		dataStore.save(t3);
		//-------------------------
		//creating students
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		Student s6 = new Student();
		//set names, registration numbers and birth dates
		s1.setRegistrationNumber(1);
		s2.setRegistrationNumber(2);
		s3.setRegistrationNumber(3);
		s4.setRegistrationNumber(4);
		s5.setRegistrationNumber(5);
		s6.setRegistrationNumber(6);
		s1.setFirstName("Jhon");
		s1.setLastName("Smith");
		s2.setFirstName("Tomás");
		s2.setLastName("Pastrana");
		s3.setFirstName("Agustín");
		s3.setLastName("Cabral");
		s4.setFirstName("Nico");
		s4.setLastName("Reynoso");
		s5.setFirstName("Lautaro");
		s5.setLastName("Olmos");
		s6.setFirstName("Gino");
		s6.setLastName("Long");
		s1.setDateOfBirth("1975-01-01");
		s2.setDateOfBirth("1994-06-22");
		s3.setDateOfBirth("1995-08-15");
		s4.setDateOfBirth("1995-01-15");
		s5.setDateOfBirth("1993-01-01");
		s6.setDateOfBirth("1995-03-30");
		//adding student to data base
		dataStore.save(s1);
		dataStore.save(s2);
		dataStore.save(s3);
		dataStore.save(s4);
		dataStore.save(s5);
		dataStore.save(s6);
		//-------------------------
		//creating student actual course
		ActualCourse ac1 = new ActualCourse();
		ActualCourse ac2 = new ActualCourse();
		ActualCourse ac3 = new ActualCourse();
		//setting notes for student1 actual course 1
		ac1.setFirstNote(4);
		ac1.setSecondNote(7);
		ac1.setFinalNote(6);
		ac1.setCourse(c1);
		s1.getCourses().add(ac1);		
		//setting notes for student1 actual course 2
		ac2.setFirstNote(5);
		ac2.setSecondNote(9);
		ac2.setFinalNote(7);
		ac2.setCourse(c2);
		s1.getCourses().add(ac2);
		//setting notes for student1 actual course 3
		ac3.setFirstNote(1);
		ac3.setSecondNote(3);
		ac3.setFinalNote(2);
		ac3.setCourse(c3);
		s1.getCourses().add(ac3);
		//adding notes to data base
		dataStore.save(s1);
		//setting notes for student2 actual course 1
		ac1.setFirstNote(5);
		ac1.setSecondNote(9);
		ac1.setFinalNote(7);
		ac1.setCourse(c1);
		s2.getCourses().add(ac1);
		//setting notes for student2 actual course 2
		ac2.setFirstNote(3);
		ac2.setSecondNote(5);
		ac2.setFinalNote(4);
		ac2.setCourse(c2);
		s2.getCourses().add(ac2);
		//adding notes to data base
		dataStore.save(s2);
		//setting notes for student3 actual course 1
		ac1.setFirstNote(8);
		ac1.setSecondNote(10);
		ac1.setFinalNote(9);
		ac1.setCourse(c1);
		s3.getCourses().add(ac1);
		//adding notes to data base
		dataStore.save(s3);
		//setting notes for student4 actual course 1
		ac1.setFirstNote(4);
		ac1.setSecondNote(7);
		ac1.setFinalNote(6);
		ac1.setCourse(c1);
		s4.getCourses().add(ac1);	
		//setting notes for student4 actual course 2
		ac2.setFirstNote(5);
		ac2.setSecondNote(9);
		ac2.setFinalNote(7);
		ac2.setCourse(c2);
		s4.getCourses().add(ac2);
		//setting notes for student4 actual course 3
		ac3.setFirstNote(1);
		ac3.setSecondNote(3);
		ac3.setFinalNote(2);
		ac3.setCourse(c3);
		s4.getCourses().add(ac3);
		//adding notes to data base
		dataStore.save(s4);
		//setting notes for student5 actual course 1
		ac1.setFirstNote(5);
		ac1.setSecondNote(9);
		ac1.setFinalNote(7);
		ac1.setCourse(c1);
		s5.getCourses().add(ac1);
		//setting notes for student5 actual course 2
		ac2.setFirstNote(3);
		ac2.setSecondNote(5);
		ac2.setFinalNote(4);
		ac2.setCourse(c2);
		s5.getCourses().add(ac2);
		//adding notes to data base
		dataStore.save(s5);
		//setting notes for student6 actual course 1
		ac1.setFirstNote(8);
		ac1.setSecondNote(10);
		ac1.setFinalNote(9);
		ac1.setCourse(c1);
		s6.getCourses().add(ac1);
		//adding notes to data base
		dataStore.save(s6);
		//-------------------------
		//adding course references
		c1.getTeachers().add(t1);
		c2.getTeachers().add(t3);
		c3.getTeachers().add(t2);
		//Electronic course
		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		c1.getStudents().add(s3);
		c1.getStudents().add(s4);
		c1.getStudents().add(s5);
		c1.getStudents().add(s6);
		//Mechanic course
		c2.getStudents().add(s1);
		c2.getStudents().add(s2);
		c2.getStudents().add(s4);
		c2.getStudents().add(s5);
		//Electricity course
		c3.getStudents().add(s1);
		c3.getStudents().add(s4);
		
		dataStore.save(c1);
		dataStore.save(c2);
		dataStore.save(c3);
		//-------------------------
		//students with notes >=4
		Course query1 = dataStore.createQuery(Course.class).filter("name =", "Electronic").get();
		System.out.println(query1);
		ObjectId courseId = query1.getId();
		System.out.println(courseId);
		List<Student> stQuery = dataStore.createQuery(Student.class).filter("courses.finalNote >", 4).filter("Courses.course =", query1).asList();
		for(Student student : stQuery){
			System.out.println(student.getFirstName() + ", " + student.getLastName() + "\n" + query1.getCourseName());
		}
	}
}
