package dataAccess;

import java.util.List;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	public void add(Category category) {
		System.out.println("Kategory JDBC ile veri tabanına eklendi");
	}

	
}
