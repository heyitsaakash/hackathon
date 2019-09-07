package com.hcl.hackathon.repository;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.hackathon.model.Employee;
import com.hcl.hackathon.model.Slot;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,String> {

	 //will give only product with a specific id
    //public List<Employee> 
    public Employee findEmployeeByID(String employeeId);
    public List<Employee> findAll();
    

}
