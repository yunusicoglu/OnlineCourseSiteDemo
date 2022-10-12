package dataAccess.Concrete.Jdbc;

import dataAccess.Abstract.CourseDao;
import enities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course.getName() + " kursu Jdbc ile eklendi.");
		
	}

}
