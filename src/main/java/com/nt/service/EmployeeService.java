package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;

@Service("empService")
public class EmployeeService implements IEmployeeService{

	@Autowired
	private IEmployeeDAO dao;
	@Override
	public int fetchEmpCount() {
		// TODO Auto-generated method stub
		int count=dao.getEmployeeCount();
		return count;
	}
	
	

}
