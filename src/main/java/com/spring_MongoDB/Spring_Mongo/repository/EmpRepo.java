package com.spring_MongoDB.Spring_Mongo.repository;

import com.spring_MongoDB.Spring_Mongo.document.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends MongoRepository<Employee,Integer> {
}
