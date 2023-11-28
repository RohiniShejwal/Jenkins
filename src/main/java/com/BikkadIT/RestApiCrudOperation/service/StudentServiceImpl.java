package com.BikkadIT.RestApiCrudOperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.RestApiCrudOperation.model.Student;
import com.BikkadIT.RestApiCrudOperation.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean saveStudent(Student stu) {
		
		Student save = studentRepository.save(stu);
		
		if(save!=null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<Student> GetAllStudent() {
		List<Student> findAll = studentRepository.findAll();
		return findAll;
	}

	@Override
	public boolean updateStudent(Student stu) {
       Student save = studentRepository.save(stu);
		
		if(save!=null) {
			return true;
		}else {
			return false;
		}

	}

	@Override
	public boolean deleteAll() {
		
		List<Student> findAll = studentRepository.findAll();
		if(findAll.isEmpty()) {
			return false;
		}else {
			studentRepository.deleteAll();
			return true;
		}
	}

	@Override
	public boolean saveAll(List<Student> stu) {
			
		List<Student> saveAll = studentRepository.saveAll(stu);
		
		if( saveAll.isEmpty()) {
			return false;
		}else { 
			return true;
		}
	}

	@Override
	public boolean updateAll(List<Student> stu) {
     List<Student> saveAll = studentRepository.saveAll(stu);
		
		if( saveAll.isEmpty()) {
			return false;
		}else {
			return true;
		}
	}
	

	@Override
	public Student getStudentByPath(int sid) {
		Student student = studentRepository.findById(sid).get();
		return student;
		
	}

	@Override
	public Student getStudentByQuery(int sid) {
		Student student = studentRepository.findById(sid).get();
		return student;
	}

	@Override
	public boolean deleteStudentByPath(int sid) {
		Student student = studentRepository.findById(sid).get();
		if(student!=null) {
			studentRepository.deleteById(sid);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean deleteStudentByQuery(int sid) {
		Student student = studentRepository.findById(sid).get();
		if(student!=null) {
			studentRepository.deleteById(sid);
			return true;
		}else {
			return false;
		}
	}
}
