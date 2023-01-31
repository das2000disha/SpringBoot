package com.wipro.assignment;

import java.util.List;

public interface Employeerepository {
	Employeedetails addEmployeedetails(Employeedetails employee);
	Employeedetails searchEmployeedetails(int id);
	Employeedetails updateEmployeedetails(Employeedetails employee);
	List<Employeedetails> listEmployeedetails();
	void deleteEmployeedetails(int id);
	
}
