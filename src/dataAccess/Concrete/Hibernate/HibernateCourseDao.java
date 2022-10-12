package dataAccess.Concrete.Hibernate;

import dataAccess.Abstract.CourseDao;
import enities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course.getName() + " kursu Hibernate ile eklendi.");
		
	}



}
