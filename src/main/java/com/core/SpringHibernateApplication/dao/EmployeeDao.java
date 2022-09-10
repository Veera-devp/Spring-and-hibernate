package com.core.SpringHibernateApplication.dao;

import com.core.SpringHibernateApplication.model.Employee;

public interface EmployeeDao 
{
	public String insert(Employee e);
    public String update(Employee e);
    public String delete(Employee e);
    public Employee getEmployee(int eno);
}
