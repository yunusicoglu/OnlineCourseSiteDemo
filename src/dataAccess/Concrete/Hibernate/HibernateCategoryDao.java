package dataAccess.Concrete.Hibernate;

import dataAccess.Abstract.CategoryDao;
import enities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getName() + " kategorisi Hibernate ile eklendi.");
		
	}

}
