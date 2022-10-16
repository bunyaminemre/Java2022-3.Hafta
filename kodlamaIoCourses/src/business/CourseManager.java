package business;

import java.util.ArrayList;

import java.util.List;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;
import core.logging.Logger;

public class CourseManager {
	private CourseDao courseDao;
	private List<Course> courses = new ArrayList<>();
	private List<Logger> loggers;

	public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.loggers=loggers;
	}

	public void add(Course course) throws Exception {

		for (Course courses : courses) {
			if (course.getUnitPrice() < 0) {
				throw new Exception("Ürün fiyatı 0'dan küçük olamaz!");
			}
			if (course.getName().equals(courses.getName())) {
				throw new Exception("Bu kurs adı daha önce eklenmiş!");
			}
		}

		courses.add(course);
		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getName());
		}

	}

}
