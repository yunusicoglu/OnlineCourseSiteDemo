package business;

import java.util.ArrayList;
import java.util.List;

import dataAccess.Abstract.InstructorDao;
import enities.Instructor;

public class InstructorManager {
	InstructorDao instructorDao;
	
	InstructorManager(InstructorDao instructorDao){
		this.instructorDao=instructorDao;
	}
	
	List<String> instructorNames = new ArrayList<String>();
	
	public void Add(Instructor instructor) throws Exception {
		for (String instructorName : instructorNames) {
			if (instructorName==instructor.getName()) {
				throw new Exception("Bu isimde egitmen zaten mevcut!");
			}
		}
		
		instructorDao.add(instructor);
		instructorNames.add(instructor.getName());
	};
}
