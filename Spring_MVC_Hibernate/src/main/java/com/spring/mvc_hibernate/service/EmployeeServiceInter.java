package com.spring.mvc_hibernate.service;

import com.spring.mvc_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeServiceInter {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

}
