package com.spring_MongoDB.Spring_Mongo.service;

import com.spring_MongoDB.Spring_Mongo.document.Employee;
import com.spring_MongoDB.Spring_Mongo.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;

    public String saveEmp(Employee emp){

        empRepo.save(emp);
        return "Save Success";
    }

    public List<Employee> getEmp() {
    return empRepo.findAll();
    }
}
