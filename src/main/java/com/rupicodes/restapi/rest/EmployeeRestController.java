package com.rupicodes.restapi.rest;

import com.rupicodes.restapi.dao.EmployeeDAO;
import com.rupicodes.restapi.entity.Employee;
import com.rupicodes.restapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        List<Employee> employees= employeeService.findAllEmployee();
        return employees;
    }
}
