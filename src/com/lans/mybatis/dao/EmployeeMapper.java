package com.lans.mybatis.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lans.mybatis.bean.Employee;

public interface EmployeeMapper {
	public Employee getEmpByMap(Map<String, Object> param) ;
	
	public Employee getEmpByIdAndLastName(@Param("id") Integer id, @Param("lastName") String lastName);
	
	public Employee getEmpById(Integer id);
	
	public void addEmp(Employee vo);
	
	public void updateEmp(Employee vo);
	
	public void deleteEmp(Integer id);
}
