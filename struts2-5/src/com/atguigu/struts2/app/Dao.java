package com.atguigu.struts2.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Dao {
	
	private static Map<Integer, Employee> emps = new LinkedHashMap<Integer, Employee>();
	
	static{
		emps.put(1001, new Employee(1001, "AA", "aa", "aa@atguigu.com"));
		emps.put(1002, new Employee(1002, "BB", "bb", "bb@atguigu.com"));
		emps.put(1003, new Employee(1003, "CC", "cc", "cc@atguigu.com"));
		emps.put(1004, new Employee(1004, "DD", "dd", "dd@atguigu.com"));
		emps.put(1005, new Employee(1005, "EE", "ee", "ee@atguigu.com"));
	}
	
	public List<Employee> getEmployees(){
		return new ArrayList<>(emps.values());
	}
	
	public void delete(Integer empId){
		emps.remove(empId);
	}
	
	public void save(Employee emp){
		long time = System.currentTimeMillis();
		emp.setEmployeeId((int)time);
		
		emps.put(emp.getEmployeeId(), emp);
	}
	
	public Employee get(Integer empId){
		return emps.get(empId);
	}
	
	public void update(Employee emp){
		emps.put(emp.getEmployeeId(), emp);
	}
	
}
