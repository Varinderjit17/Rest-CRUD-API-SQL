package com.rupicodes.restapi.dao;

import com.rupicodes.restapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAllEmployee();

    public Employee findEmployeeById(int employeeId);

    Employee saveEmployee(Employee employee);

    void deleteEmployeeById(int employeeId);
 }
