

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.Concrete.Hibernate.HibernateCategoryDao;
import dataAccess.Concrete.Hibernate.HibernateInstructorDao;
import dataAccess.Concrete.Jdbc.JdbcCourseDao;
import enities.Category;
import enities.Course;
import enities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course = new Course();
		course.setId(1);
		course.setCategory("Programlama");
		course.setName("Java Fullstack Egitimi");
		course.setInstructor("Engin Demirog");
		course.setPrice(85);
		
		Category category = new Category();
		category.setId(1);
		category.setName("Programlama");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setName("Engin Demirog");
		
		
		
		
		
		
		Logger[] loggers = {new MailLogger()};
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.Add(course);
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.Add(category);
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.Add(instructor);

	}

}
