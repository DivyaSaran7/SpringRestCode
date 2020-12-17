package com.spring.SpringRest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String Name;
	private String Dept;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Dept=" + Dept + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		Name = name;
		Dept = dept;
	}
	

}
