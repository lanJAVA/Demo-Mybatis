package com.lans.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.lans.mybatis.bean.Department;
import com.lans.mybatis.bean.Employee;
import com.lans.mybatis.dao.DepartmentMapper;
import com.lans.mybatis.dao.EmployeeMapper;
import com.lans.mybatis.dao.EmployeeMapperPlus;

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
			Employee voAdd = new Employee(null, "jerry", "jerry@163.com", "0");
			mapper.addEmp(voAdd);
			System.out.println(voAdd);
			
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
	@Test
	public void test04() throws IOException {
		SqlSessionFactory factory = getSqlSessionFactory();
		SqlSession session = factory.openSession();
		try {
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
//			Employee employee = mapper.getEmpByIdAndLastName(3, "jerry");
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", 3);
			map.put("lastName", "jerry");
			Employee employee = mapper.getEmpByMap(map);
			System.out.println(employee); 
		} finally {
			session.close();
		}
	}
	
	@Test
	public void test05() throws IOException {
		SqlSessionFactory factory = getSqlSessionFactory();
		SqlSession session = factory.openSession();
		try {
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
//			List<Employee> emps = mapper.getEmpsByLastNameLike("%e%");
//			for (Employee e: emps) 		System.out.println(e);
			
//			Map<String,Object> map = mapper.getEmpByIdReturnMap(2);
//			System.out.println(map);
			
			Map<Integer, Employee> map1 = mapper.getEmpsByLastNameLikeReturnMap("%r%");
			System.out.println(map1);
		} finally {
			session.close();
		}
	}
	
	@Test
	public void test06() throws IOException {
		SqlSessionFactory factory = getSqlSessionFactory();
		SqlSession session = factory.openSession();
		try {
			EmployeeMapperPlus mapper = session.getMapper(EmployeeMapperPlus.class);
//			Employee emp = mapper.getEmpById(5);
//			System.out.println(emp);
			
//			Employee emp1 = mapper.getEmpAndDept(5);
//			System.out.println(emp1);
//			System.out.println(emp1.getDept());
			
			Employee emp2 = mapper.getEmpByIdStep(5);
//			System.out.println(emp2);
//			System.out.println(emp2.getDept());
			System.out.println(emp2.getEmail());
			System.out.println(emp2.getDept().getDepartmentName());
		} finally {
			session.close();
		}
	}
	
	
	@Test
	public void test07() throws IOException {
		SqlSessionFactory factory = getSqlSessionFactory();
		SqlSession session = factory.openSession();
		try {
			DepartmentMapper mapper = session.getMapper(DepartmentMapper.class);
//			Department dept = mapper.getDeptByIdPlus(1);
//			System.out.println(dept);
//			System.out.println(dept.getEmps());
			Department dept1 = mapper.getDeptByIdStep(1);
//			System.out.println(dept1);
//			System.out.println(dept1.getEmps());
			System.out.println(dept1.getDepartmentName());
		} finally {
			session.close();
		}
	}
}
