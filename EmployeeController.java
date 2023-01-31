package com.wipro.assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
@Autowired
EmployeeService service;
//we are using http methods
@PostMapping("/addEmployee")//->this is url
public Employeedetails createEmployeedetails(@RequestBody Employeedetails emp)
{
	return service.createEmployeedetails(emp);
}
@GetMapping("/Employeedetails/{id}")
public  Employeedetails searchEmployeedetails(@PathVariable int id)
{
	return service.findEmployeedetails(id);
}
@GetMapping("/Employeedetails")
public List<Employeedetails>GetEmployeedetails()
{
	return service.getEmployeedetails();
}
@PutMapping("/Employeedetails")
public Employeedetails updateEmployeedetails(@RequestBody Employeedetails emp) {
	return service.updateEmployeedetails(emp);
	
}
@DeleteMapping("/Employeedetails/{id}")
public void deleteEmployeedetails(@PathVariable int id) {
	service.deleteEmployeedetails(id);
}
	}


