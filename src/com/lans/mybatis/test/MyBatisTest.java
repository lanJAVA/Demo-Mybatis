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
	public void test01() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = factory.openSession();
		try {
			Employee employee = session.selectOne("com.lans.mybatis.EmployeeMapper.selectEmp", 1);
			System.out.println(employee);
		} finally {
			session.close();
		}
	}
	
	@Test
	public void test02() throws IOException {
		SqlSessionFactory factory = getSqlSessionFactory();
		SqlSession session = factory.openSession();
		try {
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
			Employee employee = mapper.getEmpById(1);
			System.out.println(employee);
		} finally {
			session.close();
		}
	}

	@Test
	public void test03() throws IOException {
		SqlSessionFactory factory = getSqlSessionFactory();
		SqlSession session = factory.openSession();
		try {
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
			
//			≤‚ ‘ÃÌº”
//			Employee voAdd = new Employee(null, "jerry", "jerry@163.com", "0");
//			mapper.addEmp(voAdd);
			
//			≤‚ ‘–ﬁ∏ƒ
//			Employee voUpdate = new Employee(1, "Tom", "Tom@163.com", "1");
//			mapper.updateEmp(voUpdate);
			
//			≤‚ ‘…æ≥˝
//			mapper.deleteEmp(1);
			
			session.commit();
		} finally {
			session.close();
		}
	}
}
