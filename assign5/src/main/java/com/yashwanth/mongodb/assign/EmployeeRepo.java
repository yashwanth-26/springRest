package com.yashwanth.mongodb.assign;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee, Integer> {

}

