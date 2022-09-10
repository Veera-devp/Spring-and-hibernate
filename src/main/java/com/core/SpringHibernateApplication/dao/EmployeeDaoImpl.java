package com.core.SpringHibernateApplication.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.core.SpringHibernateApplication.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{
	String status = "";
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public String insert(Employee e) {
		try {
			hibernateTemplate.save(e);
			status = "Insertion Success";
		} catch (Exception ex) {
			ex.printStackTrace();
			status = "Insertion Failure";
		}
		return status;
	}

	@Transactional
	public String update(Employee e) {
		try {
			hibernateTemplate.update(e);
			status = "Updations Success";
		} catch (Exception ex) {
			ex.printStackTrace();
			status = "Updations Failure";
		}
		return status;
	}

	@Transactional
	public String delete(Employee e) {
		try {
			hibernateTemplate.delete(e);
			status = "Deletion Success";
		} catch (Exception ex) {
			ex.printStackTrace();
			status = "Deletion Failure";
		}
		return status;

	}

	@Transactional
	public Employee getEmployee(int eno) {
		Employee emp = null;
		try {
			emp = (Employee) hibernateTemplate.get(Employee.class, eno);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return emp;
	}
}
