package com.techtest.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techtest.main.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
	

}
