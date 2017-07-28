package com.lans.mybatis.dao;

import com.lans.mybatis.bean.Employee;

public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);
}
