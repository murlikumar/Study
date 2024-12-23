package com.springboot.security.pdfgenerator.repository;

import com.springboot.security.pdfgenerator.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeTestData {

    public List<Employee> getAllEmpData(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100," Murli", 2000.0, "IT"));
        list.add(new Employee(101," tanu", 2002.0, "HR"));
        list.add(new Employee(1102," krish", 2003.0, "admin"));
        return  list;
    }
}
