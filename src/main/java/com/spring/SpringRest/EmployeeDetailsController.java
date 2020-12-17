package com.spring.SpringRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeDetailsController {
	
	@Autowired
	private com.spring.SpringRest.EmployeeService empServ;

	@GetMapping("/employee")
	public List<Employee> getEmp(){
		System.out.println(" Find  ****** me  ********* here");
		return this.empServ.getEmp();
	}
	
	@GetMapping("/employee/{empId}")
	public Employee getSingleEmp(@PathVariable int empId){	
		System.out.println(" I  ****** an ********* get Single Empployee data");
		return this.empServ.getSingleEmp(empId);
	}

	@PostMapping("/employee")
	public Employee addEmp(@RequestBody Employee emp) {
		return this.empServ.addEmp(emp);
	}
	
	@DeleteMapping("/employee/{empId}")
	public void deleteEmp(@PathVariable int empId) {
		System.out.println(" I  ****** an ********* Delete");	
	this.empServ.deleteEmp(empId);
	}
	}



