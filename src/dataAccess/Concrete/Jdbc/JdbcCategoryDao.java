package dataAccess.Concrete.Jdbc;

import dataAccess.Abstract.CategoryDao;
import enities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getName() + " kategorisi Jdbc ile eklendi.");
		
	}

}
