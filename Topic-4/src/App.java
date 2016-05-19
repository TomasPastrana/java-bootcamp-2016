import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class App {
	
	public static void main(String[] args) {
		
		try{			
			//Get connection to data base
			Connection con;
			con = dbConnection.getConnection();
			
			//prepare statement
			Statement stmt;
			ResultSet rs;
			stmt = con.createStatement();
			
			String query = "select t.last_name, t.first_name, s.schedule_day, s.schedule_hour, c.course_name "
					+ "from teachers t, course c, schedule s, course_has_schedule cs, teachers_has_course tc "
					+ "where c.id_course = cs.course_id_course = tc.course_id_course "
					+ "and s.id_schedule = cs.schedule_id_schedule "
					+ "and t.id_teacher = tc.teachers_id_teacher "
					+ "and t.first_name = 'Ana' "
					+ "order by s.id_schedule";
			
			//execute query
			rs = stmt.executeQuery(query);

			// retrieve result from sql
			while(rs.next()){
				
				String lstName = rs.getString("t.last_name");
				String fstName = rs.getString("t.first_name");
				String courseName = rs.getString("c.course_name");
				String scheduleDay = rs.getString("s.schedule_day");
				String scheduleHour = rs.getString("s.schedule_hour");
				
				//display result
				System.out.println("Teacher: " + lstName + ", " + fstName);
				System.out.println("Day: " + scheduleDay + ", hour: " + scheduleHour);
				System.out.println("Course: " + courseName);
				System.out.println("------------------");
			}
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		System.out.println("Done");
	}
}
