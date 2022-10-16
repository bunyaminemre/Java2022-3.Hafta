package kodlamaIoCourses;

import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcTeacherDao;
import entities.Category;
import entities.Course;
import entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {

		Category category1 = new Category(1, "Prgramlama");
		// Category category2 = new Category(2, "SQL");
		// Category category3 = new Category(3, "React");
		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new FileLogger());

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		System.out.println(category1.getName());
		// categoryManager.add(category2);
		// categoryManager.add(category3);


		Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı", 10);
		Course course2 = new Course(2, "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", 50);
		// Course course3 = new Course(3,"ASD",10);

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		System.out.println(course1.getName() + "-" + course1.getUnitPrice());
		courseManager.add(course2);
		System.out.println(course2.getName() + "-" + course2.getUnitPrice());

		Teacher teacher1 = new Teacher(1, "Engin", "Demiroğ");
		Teacher teacher2 = new Teacher(2, "Ahmet", "Demiroğ");
		TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(), loggers);
		teacherManager.add(teacher1);
		System.out.println(teacher1.getName() + " " + teacher1.getLastName());
		teacherManager.add(teacher2);
		System.out.println(teacher2.getName() + " " + teacher2.getLastName());

	}
}
