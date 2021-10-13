package com.hsbc.factory;

import com.hsbc.dao.ArrayListImpl;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoArrayImpl;
import com.hsbc.dao.TreeSetImpl;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class FactoryClass {
	public static EmployeeDao getDaoInstance(int choice) {
		if(choice==1) {
		return new EmployeeDaoArrayImpl();
		}
		else if(choice==2) {
			return new ArrayListImpl();	
		}
		else if(choice==3) {
			return new TreeSetImpl();	
		} 
		else {
			return new EmployeeDaoArrayImpl();
		}
		
}
	public static EmployeeService getServiceInstance(EmployeeDao eDao) {
		return new EmployeeServiceImpl(eDao);
	}
}
