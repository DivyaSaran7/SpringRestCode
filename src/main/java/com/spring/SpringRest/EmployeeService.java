package com.spring.SpringRest;

import java.util.List;

public interface EmployeeService {
	
    public List<Employee> getEmp();
	
	public Employee addEmp(Employee emp);
	
	public Employee getSingleEmp(int empID);
	
	public void deleteEmp(int id);

}
