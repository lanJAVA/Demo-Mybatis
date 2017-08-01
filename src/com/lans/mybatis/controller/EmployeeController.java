/*
 * Copyright 2017 - ����Ƽ�
 * 
 * ����������Ϣ�Ƽ����޹�˾
 * ����˾���������������ݵ�Ȩ����
 * ������Ϊ������Ϣ�����ޱ���˾�ڲ�ʹ�á�
 * �Ǿ�����˾������ɣ��κ��˲�����й����������Ŀ�ġ�
 */
package com.lans.mybatis.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lans.mybatis.bean.Employee;
import com.lans.mybatis.service.EmployeeService;

@Controller
public class EmployeeController {
  @Autowired
  EmployeeService employeeService;
  @RequestMapping("getEmps")
  public String emps(Map<String, Object> map) {
    List<Employee> emps = employeeService.getEmps();
    map.put("allEmps", emps);
    return "list";
  }
}
