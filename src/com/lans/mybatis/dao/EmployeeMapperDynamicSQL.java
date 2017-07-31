package com.lans.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lans.mybatis.bean.Employee;

public interface EmployeeMapperDynamicSQL {
	public List<Employee> getEmpsByConditionIf(Employee emp);
	
	public List<Employee> getEmpsByConditionTrim(Employee emp);
	
	public List<Employee> getEmpsByConditionChoose(Employee emp); 
	
	public void updateEmp(Employee emp);
	
	public List<Employee> getEmpsByConditionForeach(List<Integer> ids);
	
	public void addEmps(@Param("emps") List<Employee> emps);
}
