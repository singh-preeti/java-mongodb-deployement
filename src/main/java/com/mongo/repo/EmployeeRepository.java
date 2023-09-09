package com.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Long> {

}
