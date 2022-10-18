package com.org.java.demoproject.controller;

import com.org.java.demoproject.model.Employee;
import com.org.java.demoproject.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmpController {
    @Autowired
     EmpService empService;
    @PostMapping("/create")
    public void  createEmp(@RequestBody Employee employee){
empService.createEmp(employee);
    }
    @PostMapping("/update")
public  void updateEmp(@RequestBody Employee employee){
        empService.updateEmp(employee);
    }

}
