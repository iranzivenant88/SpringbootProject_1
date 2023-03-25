package com.claivenant.springbootdemo.Service;

import com.claivenant.springbootdemo.Model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> getAllEmployees();


    Employee getEmployeeById(String id);

    String deleteEmployeeById(String id);
}
