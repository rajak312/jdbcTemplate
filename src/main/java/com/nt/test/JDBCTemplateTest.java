package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmployeeService;


public class JDBCTemplateTest 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        EmployeeService service=ctx.getBean("empService",EmployeeService.class);
        
        System.out.println(service.fetchEmpCount());
    }
}
