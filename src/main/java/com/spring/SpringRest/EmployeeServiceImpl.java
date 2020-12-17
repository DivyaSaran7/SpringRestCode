package com.spring.SpringRest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDAO empDao;
	
     
	@Override
	public List<Employee> getEmp(){
		return empDao.findAll();
	}
	
	@Override
	public Employee getSingleEmp(int empId){
		Optional<Employee> emp = empDao.findById(empId);
		return emp.get();
	}
	
	@Override
	public Employee addEmp(Employee emp){
		empDao.save(emp);
		return emp;
	}
	
	@Override
	public void deleteEmp(int id){
		Employee record = empDao.getOne(id);
		empDao.delete(record);
	}
	

}
