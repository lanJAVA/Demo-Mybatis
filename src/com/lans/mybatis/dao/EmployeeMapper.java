package com.lans.mybatis.dao;

import java.util.List;

import com.lans.mybatis.bean.Employee;

public interface EmployeeMapper {
	public Employee getEmpById(Integer id);
	public List<Employee> getEmps();
}
