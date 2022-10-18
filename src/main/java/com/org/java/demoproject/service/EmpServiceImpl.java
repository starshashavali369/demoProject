package com.org.java.demoproject.service;

import com.org.java.demoproject.model.Employee;
import com.org.java.demoproject.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    EmpRepo empRepo;

    @Override
    public void createEmp(Employee employee) {
empRepo.save(employee);
    }

    @Override
    public void updateEmp(Employee employee) {
        empRepo.save(employee);
    }
}
