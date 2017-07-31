package com.lans.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import com.lans.mybatis.bean.Employee;

public interface EmployeeMapper {
	@MapKey("id")
	public Map<Integer, Employee> getEmpsByLastNameLikeReturnMap(String lastName);
	
	public Map<String, Object> getEmpByIdReturnMap(Integer id) ;
	
	public List<Employee> getEmpsByLastNameLike(String lastName);
	
	public Employee getEmpByMap(Map<String, Object> param) ;
	
	public Employee getEmpByIdAndLastName(@Param("id") Integer id, @Param("lastName") String lastName);
	
	public Employee getEmpById(Integer id);
	
	public void addEmp(Employee vo);
	
	public void updateEmp(Employee vo);
	
	public void deleteEmp(Integer id);
}
