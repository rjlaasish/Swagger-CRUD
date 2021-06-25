package com.laughingsquad.employeemanagementsystem.Repository;

import com.laughingsquad.employeemanagementsystem.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Aasish 2021-05-08
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
