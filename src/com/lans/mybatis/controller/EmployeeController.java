/*
 * Copyright 2017 - 数多科技
 * 
 * 北京数多信息科技有限公司
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
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
