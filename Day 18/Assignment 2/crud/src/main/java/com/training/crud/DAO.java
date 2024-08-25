package com.training.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.training.entity.employee_entity;

public class DAO {
	public static Connection checkDB() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "india@12");
		return con;
	}

//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//
//		String qury = ("Select * from emp");
//
//		Connection con = DAO.checkDB();
//
//		PreparedStatement smt = con.prepareStatement(qury);
//
//		ResultSet set = smt.executeQuery();
//
//		while (set.next()) {
//			System.out.println("Id: " + set.getInt(1) + " Name: " + set.getString(2) + " Salary: " + set.getInt(3));
//		}
//	}

	public boolean insert(employee_entity e) throws ClassNotFoundException, SQLException {
		String query = "insert into emp values (?,?,?)";
		Connection con = DAO.checkDB();

		PreparedStatement stmt = con.prepareStatement(query);

		stmt.setInt(1, e.getId());
		stmt.setString(2, e.getName());
		stmt.setInt(3, e.getSalary());

		int result = stmt.executeUpdate();

		return result == 1;

	}

}