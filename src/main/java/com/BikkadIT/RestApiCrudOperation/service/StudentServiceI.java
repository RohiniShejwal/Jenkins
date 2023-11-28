package com.BikkadIT.RestApiCrudOperation.service;

import java.util.List;

import com.BikkadIT.RestApiCrudOperation.model.Student;

public interface StudentServiceI {

	public boolean saveStudent(Student stu);
	
	public List<Student> GetAllStudent();
	
	public boolean updateStudent(Student stu);
	
	public boolean deleteAll();
	
	public boolean saveAll(List<Student> stu);
	
	public boolean updateAll(List<Student> stu);
	
	public Student getStudentByPath(int sid);
	
	public Student getStudentByQuery(int sid);
	
    public boolean deleteStudentByPath(int sid);
	
	public boolean deleteStudentByQuery(int sid);
	
	
}
