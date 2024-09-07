package com.rupicodes.restapi.service;

import com.rupicodes.restapi.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAllEmployee();

    public Employee findEmployeeById(int employeeId);

    Employee saveEmployee(Employee employee);

    void deleteEmployeeById(int employeeId);
}
