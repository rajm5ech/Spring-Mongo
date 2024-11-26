package com.spring_MongoDB.Spring_Mongo.controller;

import com.spring_MongoDB.Spring_Mongo.document.Employee;
import com.spring_MongoDB.Spring_Mongo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spring")
public class EmpController {
    @Autowired
    private EmpService empService;

    @PostMapping
    public ResponseEntity<String> saveEmp(@RequestBody Employee employee){
        return ResponseEntity.ok().body(empService.saveEmp(employee));
    }
    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getEmp(){
        return ResponseEntity.ok().body(empService.getEmp());
    }
}
