package com.rupicodes.restapi.service;

import com.rupicodes.restapi.dao.EmployeeRepository;
import com.rupicodes.restapi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    @Override
    public Employee findEmployeeById(int employeeId) {
        Optional<Employee> dbEmplyee = employeeRepository.findById(employeeId);
        return dbEmplyee.orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
