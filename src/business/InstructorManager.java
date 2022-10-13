package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.Abstract.InstructorDao;
import enities.Instructor;

public class InstructorManager {
	InstructorDao instructorDao;
	Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers){
		this.instructorDao=instructorDao;
		this.loggers = loggers;
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
		
		for (Logger logger : loggers) {
			logger.log("Egitmen " + instructor.getName());
		}
	};
}
