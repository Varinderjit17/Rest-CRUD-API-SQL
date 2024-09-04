package com.rupicodes.restapi.dao;

import com.rupicodes.restapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAllEmployee();
 }
