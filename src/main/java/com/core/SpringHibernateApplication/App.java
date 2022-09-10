package com.core.SpringHibernateApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.SpringHibernateApplication.dao.EmployeeDao;
import com.core.SpringHibernateApplication.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	EmployeeDao empDao = (EmployeeDao)context.getBean("empDao");
        Employee emp = new Employee();
        emp.setEno(111);
        emp.setEname("AAA");
        emp.setEsal(5000);
        emp.setEaddr("Hyd");
        String status = empDao.insert(emp);
        System.out.println(status);
        System.out.println(empDao.getEmployee(111));
    }
}
