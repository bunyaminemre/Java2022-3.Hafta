package business;

import java.util.ArrayList;

import java.util.List;
import dataAccess.CategoryDao;
import entities.Category;
import core.logging.Logger;

public class CategoryManager {

	private CategoryDao categoryDao;
	private List<Category> categories = new ArrayList<>();
	private List<Logger> loggers;

	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers=loggers;

	}

	public void add(Category category) throws Exception {

		for (Category categori : categories) {
			if (category.getName().equals(categori.getName())) {
				throw new Exception("Bu kategori adı daha önce eklenmiş!");

			}

		}

		categories.add(category);
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}

	}

}
