package com.training.service.impl;

import java.sql.SQLException;

import com.training.crud.DAO;
import com.training.entity.employee_entity;
import com.training.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public boolean insertEmployee(employee_entity e) {
		DAO d = new DAO();
		try {
			return d.insert(e);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}

}
