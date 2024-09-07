package com.rupicodes.restapi.rest;

import com.rupicodes.restapi.dao.EmployeeDAO;
import com.rupicodes.restapi.entity.Employee;
import com.rupicodes.restapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{employeeId}")
    public Employee findEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.findEmployeeById(employeeId);
        return employee;
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        Employee dbEmployee= employeeService.saveEmployee(employee);
        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        Employee dbEmployee = employeeService.saveEmployee(employee);
        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return "Employee deleted";
    }
}
