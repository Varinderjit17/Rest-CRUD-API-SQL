package com.rupicodes.restapi.service;

import com.rupicodes.restapi.dao.EmployeeDAO;
import com.rupicodes.restapi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public Employee findEmployeeById(int employeeId) {
        return employeeDAO.findEmployeeById(employeeId);
    }

    @Transactional
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeDAO.saveEmployee(employee);
    }

    @Transactional
    @Override
    public void deleteEmployeeById(int employeeId) {
        employeeDAO.deleteEmployeeById(employeeId);
    }
}
