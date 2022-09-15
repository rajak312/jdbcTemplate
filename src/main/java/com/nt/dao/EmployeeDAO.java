package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDao")
public class EmployeeDAO implements IEmployeeDAO {
	public static String Get_Emp_Count="select count(3) from emp";
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int getEmployeeCount() {
		
		int count=jt.queryForObject(Get_Emp_Count, Integer.class);
		return count;
		
	}

}
