package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.hsbc.beans.Employee;

public class ArrayListImpl implements EmployeeDao {
	List<Employee> employees = new ArrayList<Employee>();
	int esize=employees.size();

	@Override
	public void save(Employee employee) {
		employees.add(employee);
		
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		Employee emp=new Employee();
		for(Employee e:employees)
		{
			if(e.getId()==id){
				emp=e;
			}
		}
		return emp;
}
	

	@Override
	public Employee[] findAllEmployees() {
		Employee[] empList=employees.toArray(new Employee[esize]);
		return empList;
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		for(Employee e:employees) {
			if(e.getId()==id) {
				e=employee;
			}
		}
	}		
}


