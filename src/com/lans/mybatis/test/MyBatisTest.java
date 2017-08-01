package com.lans.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.lans.mybatis.bean.Employee;
import com.lans.mybatis.dao.EmployeeMapper;

public class MyBatisTest {
	
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		return factory ;
	}
	
	@Test
	public void testFirstLevelCache() throws IOException {
		SqlSessionFactory factory = getSqlSessionFactory();
		SqlSession session = factory.openSession();
		try {
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
			Employee emp = mapper.getEmpById(2);
			System.out.println(emp);
			Employee emp1 = mapper.getEmpById(1);
			System.out.println(emp1);
			Employee emp2 = mapper.getEmpById(2);
			System.out.println(emp2);
		} finally {
			session.close();
		}
	}
	
	@Test
	public void testSecondLevelCache() throws IOException {
		SqlSessionFactory factory = getSqlSessionFactory();
		SqlSession session = factory.openSession();
		SqlSession session2 = factory.openSession();
		try {
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
			EmployeeMapper mapper2 = session2.getMapper(EmployeeMapper.class);
			
			Employee emp = mapper.getEmpById(2);
			System.out.println(emp);
			session.close();
			
			Employee emp2 = mapper2.getEmpById(2);
			System.out.println(emp2);
			session2.close();
		} finally {
		}
	}
	

}
