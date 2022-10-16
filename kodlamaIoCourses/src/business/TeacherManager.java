package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.Logger;
import dataAccess.TeacherDao;
import entities.Teacher;
import core.logging.Logger;

public class TeacherManager {
	private TeacherDao teacherDao;
	private List<Teacher> teachers = new ArrayList<>();
	private List<Logger> loggers;

	public TeacherManager(TeacherDao teacherDao, List<Logger> loggers) {
		this.teacherDao = teacherDao;
		this.loggers=loggers;
	}

	public void add(Teacher teacher) throws Exception {

		for (Teacher teachere : teachers) {

			if (teacher.getName().equals(teachere.getName()) && teacher.getLastName().equals(teachere.getLastName())) {
				throw new Exception("Bu öğretmen adı daha önce eklenmiş!");
			}

		}

		teachers.add(teacher);
		teacherDao.add(teacher);
		for (Logger logger : loggers) {
			logger.log(teacher.getName() + teacher.getLastName());
		}

	}

}
