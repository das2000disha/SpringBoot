package com.wipro.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class Servicemethod implements Employeerepository{
	int increment=1;
	HashMap<Integer, Employeedetails>Employee=new HashMap();
	@Override
	public Employeedetails addEmployeedetails(Employeedetails employee) {
		int id=increment++;
		employee.setId(id);
		Employee.put(id, employee);
		return employee;
		
	}
	@Override
public Employeedetails searchEmployeedetails(int id) {
	return Employee.get(id);
	
}
@Override	
public Employeedetails updateEmployeedetails(Employeedetails employee) {
	if(searchEmployeedetails(employee.getId())==null)
		return null;
	Employeedetails updateemployeedetails=new Employeedetails();
	updateemployeedetails.setId(employee.getId());
	updateemployeedetails.setName(employee.getName());
	updateemployeedetails.setBand(employee.getBand());
	updateemployeedetails.setPh_number(employee.getPh_number());
	Employee.replace(employee.getId(), updateemployeedetails);
	return updateemployeedetails;
	
}
@Override
public List<Employeedetails> listEmployeedetails(){
	return new ArrayList<Employeedetails>(Employee.values());
}
@Override
public void deleteEmployeedetails(int id) {
	Employee.remove(id);
}


	}//this fully for ur own method


