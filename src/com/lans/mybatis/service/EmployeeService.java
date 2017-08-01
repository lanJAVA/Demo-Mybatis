/*
 * Copyright 2017 - ����Ƽ�
 * 
 * ����������Ϣ�Ƽ����޹�˾ ����˾���������������ݵ�Ȩ���� ������Ϊ������Ϣ�����ޱ���˾�ڲ�ʹ�á� �Ǿ�����˾������ɣ��κ��˲�����й����������Ŀ�ġ�
 */
package com.lans.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lans.mybatis.bean.Employee;
import com.lans.mybatis.dao.EmployeeMapper;

@Service
public class EmployeeService {
  @Autowired
  private EmployeeMapper employeeMapper;

  public List<Employee> getEmps() {
    return employeeMapper.getEmps();
  }
}
