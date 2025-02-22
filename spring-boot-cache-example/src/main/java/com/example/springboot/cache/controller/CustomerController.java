package com.example.springboot.cache.controller;

import com.example.springboot.cache.model.Customer;
import com.example.springboot.cache.model.Student;
import com.example.springboot.cache.services.StudentManager;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class CustomerController {
    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    StudentManager studentManager;

    @GetMapping("/customer-info")
    @Cacheable(value = "customer_data_cache")
    public List<Customer> getCustomerInfo(){
        List<Customer> customerinfo = Arrays.asList(
                new Customer(1, "murli", "saving", 20.12),
                new Customer(2, "gita", "current", 10.10),
                new Customer(3, "sita", "ppf", 30.30)
        );
        return customerinfo;
    }

    @GetMapping(path = "/student-info/{id}")
    public Student getStudentInfo(@PathVariable Integer id){
        logger.info("call studentManager to get Student indfo for id {}", id);
        Student studentInfo = studentManager.getStudentById(id);
        return studentInfo;
    }


}
