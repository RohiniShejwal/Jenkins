package com.BikkadIT.RestApiCrudOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.RestApiCrudOperation.model.Student;
import com.BikkadIT.RestApiCrudOperation.service.StudentServiceI;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;
	
	
	//save data
	
	@PostMapping(value="/SaveStudent", consumes="application/json")
	public ResponseEntity<String> saveStudent(@RequestBody Student stu){
		boolean saveStudent = studentServiceI.saveStudent(stu);
		
		if(saveStudent) {
		 return new ResponseEntity<String>("Student Data Saved Successfully",HttpStatus.CREATED);	
		}else {
			return new ResponseEntity<String>("Student Data not Saved Successfully",HttpStatus.BAD_REQUEST);
		}
		
	}
	
	//Retrieve all data
	
	@GetMapping(value ="/GetStudent", produces="application/json")
	public ResponseEntity<List<Student>> GetAllStudent(){
		List<Student> getAllStudent = studentServiceI.GetAllStudent();
		return new ResponseEntity<List<Student>>(getAllStudent, HttpStatus.OK);
		
	}
	
	//update data
	
	@PutMapping(value="/UpdateStudent", consumes="application/json")
	public ResponseEntity<String> updateStudent(@RequestBody Student stu){
		boolean saveStudent = studentServiceI.saveStudent(stu);
		
		if(saveStudent) {
		 return new ResponseEntity<String>("Student Data Updated Successfully",HttpStatus.CREATED);	
		}else {
			return new ResponseEntity<String>("Student Data not Updated Successfully",HttpStatus.BAD_REQUEST);
		}
		
	}
	
	//delete All
	
	@DeleteMapping("/DeleteAll")
	public ResponseEntity<String> deleteAll(){
		boolean deleteAll = studentServiceI.deleteAll();
		if(deleteAll) {
			 return new ResponseEntity<String>("All record deleted Successfully",HttpStatus.CREATED);	
			}else {
				return new ResponseEntity<String>("All record not deleted Successfully",HttpStatus.BAD_REQUEST);
			}
	}
	
	//save All
	
	@PostMapping(value="/SaveAllStudent", consumes="application/json")
	public ResponseEntity<String> saveAll(@RequestBody List<Student> stu){
		boolean saveAll = studentServiceI.saveAll(stu);
		
		if(saveAll) {
		 return new ResponseEntity<String>("All Students Data Saved Successfully",HttpStatus.CREATED);	
		}else {
			return new ResponseEntity<String>("All Students Data not Saved Successfully",HttpStatus.BAD_REQUEST);
		}
		
	}
	
	//update All
	
	@PutMapping(value="/UpdateAllStudent", consumes="application/json")
	public ResponseEntity<String> updateAll(@RequestBody List<Student> stu){
		boolean saveAll = studentServiceI.saveAll(stu);
		
		if(saveAll) {
		 return new ResponseEntity<String>("Students Data updated Successfully",HttpStatus.CREATED);	
		}else {
			return new ResponseEntity<String>("Students Data not updated Successfully",HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	//get single record by path parameter
	
	@GetMapping(path="/GetSingleRecordByPath/{sid}", produces="application/json")
	public ResponseEntity<Student> GetStudent(@PathVariable int sid){
	   Student studentByPath = studentServiceI.getStudentByPath(sid);
		return new ResponseEntity<Student>(studentByPath, HttpStatus.OK);
    }
	
	
	// get single record by Query parameter
	
	@GetMapping(value="/GetSingleRecordByQuery", produces="application/json")
	public ResponseEntity<Student> getStudent(@RequestParam int sid){
		Student byQuery = studentServiceI.getStudentByQuery(sid);
		return new ResponseEntity<Student>(byQuery, HttpStatus.OK);
		
	}
	
	
	// delete single record by path parameter
	
		@DeleteMapping(path="/DeleteSingleRecordByPath/{sid}")
		public ResponseEntity<String> DeleteStudent(@PathVariable int sid){
		   boolean deleteStudentByPath = studentServiceI.deleteStudentByPath(sid);
		   if(deleteStudentByPath) {
			   return new ResponseEntity<String>("Record deleted Successfully", HttpStatus.CREATED);   
		   }else {
			   return new ResponseEntity<String>("Record not deleted Successfully", HttpStatus.BAD_REQUEST);
		   }
	    }
		
		
		// delete single record by query parameter
		
			@DeleteMapping(value="/DeleteSingleRecordByPath")
			public ResponseEntity<String> DeleteStudentbyquery(@RequestParam int sid){
			   boolean deleteStudentByQuery = studentServiceI.deleteStudentByQuery(sid);
			   if(deleteStudentByQuery) {
				   return new ResponseEntity<String>("Record deleted Successfully", HttpStatus.CREATED);   
			   }else {
				   return new ResponseEntity<String>("Record not deleted Successfully", HttpStatus.BAD_REQUEST);
			   }
		    }
}