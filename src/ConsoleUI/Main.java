package ConsoleUI;

import business.CourseManager;
import dataAccess.Concrete.Jdbc.JdbcCourseDao;
import enities.Course;

public class Main {

	public static void main(String[] args) throws Exception {

		Course courseJava = new Course();
		courseJava.setId(1);
		courseJava.setCategory("Programlama");
		courseJava.setName("Java Fullstack Egitimi");
		courseJava.setInstructor("Engin Demirog");
		courseJava.setPrice(85);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao());
		courseManager.Add(courseJava);

	}

}
