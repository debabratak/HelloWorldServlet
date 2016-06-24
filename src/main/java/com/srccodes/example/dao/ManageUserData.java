package com.srccodes.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ManageUserData {
	String connectionURL = "jdbc:mysql://localhost:3306/world";
	Connection connection;
	public int fetchData() throws Exception
	{
	ArrayList<UserData> getData = new ArrayList<UserData>();
	try
	
	
	{
	Class.forName("com.mysql.jdbc.Driver");
	connection = DriverManager.getConnection(connectionURL, "root", "root");
	PreparedStatement ps = connection.prepareStatement("SELECT name,age,exp FROM hrdetails");
	ResultSet rs = ps.executeQuery();
	
	int count = 0;
	UserData userData = new UserData();
	while(rs.next())
	{
		
		userData.setName(rs.getString("name"));
		userData.setAge(rs.getInt("age"));
		userData.setExp(rs.getInt("exp"));
		getData.add(userData);
		
		count++;
	}
	System.out.println(userData);
	return count;
	}
	catch(Exception e)
	{
	throw e;
	}
	
	finally {
		if(connection!=null){
			connection.close();
		}
	}

 }
}
