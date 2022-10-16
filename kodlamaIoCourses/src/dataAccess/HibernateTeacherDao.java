package dataAccess;

import entities.Teacher;

public class HibernateTeacherDao implements TeacherDao {
	public void add(Teacher teacher) {
		System.out.println("Öğretmen Hibernate ile veri tabanına eklendi");
	}

}
