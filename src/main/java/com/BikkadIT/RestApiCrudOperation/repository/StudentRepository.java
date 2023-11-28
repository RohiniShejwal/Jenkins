package com.BikkadIT.RestApiCrudOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.RestApiCrudOperation.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
