package dataAccess.Concrete.Hibernate;

import dataAccess.Abstract.InstructorDao;
import enities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Egitmen " + instructor.getName() + " Hibernate ile eklendi.");
		
	}



}
