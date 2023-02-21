package com.spring.mvc_hibernate.DAO;

import com.spring.mvc_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDaoInter {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
