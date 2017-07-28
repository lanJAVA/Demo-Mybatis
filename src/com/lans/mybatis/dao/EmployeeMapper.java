package com.lans.mybatis.dao;

import com.lans.mybatis.bean.Employee;

public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);
	
	public void addEmp(Employee vo);
	
	public void updateEmp(Employee vo);
	
	public void deleteEmp(Integer id);
}
