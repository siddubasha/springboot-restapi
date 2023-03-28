package com.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.springboot.model.Employee;
/* simple jpa repository alreday having annotation respository so no need of other repository annotation before emp repository class*/
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	

}
