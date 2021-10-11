package com.hsbc.exceptions;
@SuppressWarnings("serial")
public class EmployeeAlreadyExistsException extends Exception{
	public EmployeeAlreadyExistsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeAlreadyExistsException(String message) {
		super(message);
	}
}
