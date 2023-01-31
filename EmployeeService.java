package com.wipro.assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
@Autowired
Employeerepository rep;
public Employeedetails createEmployeedetails(Employeedetails emp)//adding logic
{
	return rep.addEmployeedetails(emp);
}
public Employeedetails findEmployeedetails(int id) {//searching employee deatils
	return rep.searchEmployeedetails(id);
	
}
public List<Employeedetails>getEmployeedetails(){// getting employee details
	return rep.listEmployeedetails();
}
public Employeedetails updateEmployeedetails(Employeedetails emp) {//update employee deatils
	return rep.updateEmployeedetails(emp);
	
}
public void deleteEmployeedetails(int id) {//deleting employee deatils
	 rep.deleteEmployeedetails(id);
	
}
}
