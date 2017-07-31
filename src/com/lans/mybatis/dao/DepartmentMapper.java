package com.lans.mybatis.dao;

import com.lans.mybatis.bean.Department;

public interface DepartmentMapper {
	public Department getDeptById(Integer id);
	
	public Department getDeptByIdPlus(Integer id);
	
	public Department getDeptByIdStep(Integer id);
}
