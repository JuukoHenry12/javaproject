package com.employee.employee.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employee.payroll.Employee;
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    
} 