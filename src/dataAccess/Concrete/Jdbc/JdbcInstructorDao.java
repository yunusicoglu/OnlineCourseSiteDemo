package dataAccess.Concrete.Jdbc;

import dataAccess.Abstract.InstructorDao;
import enities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Egitmen " + instructor.getName() + " Jdbc ile eklendi.");
		
	}

}
