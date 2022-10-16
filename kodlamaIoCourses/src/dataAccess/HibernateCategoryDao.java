package dataAccess;

import java.util.List;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("Kategory Hibernate ile veri tabanına eklendi");
	}

	

}
