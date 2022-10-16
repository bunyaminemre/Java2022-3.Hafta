package dataAccess;

import entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{
	public void add(Teacher teacher) {
		System.out.println("Öğretmen JDBC ile veri tabanına eklendi");
	}

}
