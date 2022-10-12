package business;

import java.util.List;

import dataAccess.Abstract.CategoryDao;
import enities.Category;

public class CategoryManager {
	CategoryDao categoryDao;
	
	public CategoryManager(CategoryDao categoryDao) {
		this.categoryDao=categoryDao;
	}
	
	List<String> categoryNames;
	
	public void Add(Category category) throws Exception {
		
		for (String categoryName : categoryNames) {
			if (categoryName==category.getName()) {
				throw new Exception("Bu isimde bir kategori zaten mevcut!");
			}
		}
		
		
		categoryNames.add(category.getName());
		categoryDao.add(category);
	};
	
}
