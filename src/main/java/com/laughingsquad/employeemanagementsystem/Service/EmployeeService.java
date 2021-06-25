package com.laughingsquad.employeemanagementsystem.Service;

import com.laughingsquad.employeemanagementsystem.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.laughingsquad.employeemanagementsystem.Model.Employee;

/**
 * @author Aasish 2021-05-07
 */
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }


    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployee(Long id) {
       return employeeRepository.findById(id);
    }
}
