package business;

import java.util.List;

import dataAccess.Abstract.CourseDao;
import enities.Course;

public class CourseManager {
	
	CourseDao courseDao;
	
	CourseManager(CourseDao courseDao){
		this.courseDao=courseDao;
	}
	
	List<String> courseNames; 
	
	public void Add(Course course) throws Exception {
		
		for (String courseName : courseNames) {
			if (courseName==course.getName()) {
				throw new Exception("Bu isimde bir kurs zaten mevcut!");
			}
		}
		
		if (course.getPrice()<0) {
			throw new Exception("Kurs ucreti 0 veya daha fazla olmali");
		}
		
		courseNames.add(course.getName());
		courseDao.add(course);
	};				
}
