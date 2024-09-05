package com.rupicodes.restapi.service;

import com.rupicodes.restapi.dao.EmployeeDAO;
import com.rupicodes.restapi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> employees = employeeDAO.findAllEmployee();
        return employees;
    }
}
