package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoArrayImpl;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao =null;
	public EmployeeServiceImpl(EmployeeDao dao) {
		this.dao = dao;
		}

	@Override
	public void store(Employee employee) throws EmployeeAlreadyExistsException{
			Employee[] empList=dao.findAllEmployees();
			for(Employee e:empList)
			{
				if(e.getId()==employee.getId())
				{
					throw new EmployeeAlreadyExistsException("Employee Already Exists"); 
				}
			}
			dao.save(employee);
		}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Employee emp = dao.fetchEmployeeById(id);
		if(emp == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " +id+" not found");
		}
		return emp;
	}

	@Override
	public Employee[] findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public void updateSalary(int id, double salary) throws EmployeeNotFoundException{
		Employee emp=dao.fetchEmployeeById(id);
		if(emp==null){
			throw new EmployeeNotFoundException("Employee not found with ID"+id);
		}
		else{	
			emp.setSalary(salary);
			dao.updateEmployee(id, emp);
		}
	}

	@Override
	public void updateName(int id, String name) throws EmployeeNotFoundException {
		Employee emp=dao.fetchEmployeeById(id);
		if(emp==null){
			throw new EmployeeNotFoundException("Employee not found with ID"+id);
		}
		else{
			
			emp.setName(name);
			dao.updateEmployee(id, emp);
		}	
	}

}
