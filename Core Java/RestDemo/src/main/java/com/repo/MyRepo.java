package com.repo;

import org.springframework.data.repository.CrudRepository;

import com.moddle.Student;

public interface MyRepo extends CrudRepository<Student, Integer> {
	
	

}
