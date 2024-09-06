<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="vn.iostart.config.DBConnectMySQL" %>
<%@ page import="java.sql.*" %>

<%
	try {
		Connection con = DBConnectMySQL.getDatabaseConnection();
		//dung cho truy van khong co tham so
		Statement st = con.createStatement();
		
		String q1 = "Create table users(name nvarchar(100), email varchar(100)primary key, phone bigint, password varchar(10))";
		System.out.println(q1);
		
		st.execute(q1);
		
		System.out.println(st);
		con.close();
		
	} catch (Exception e){
		System.out.println(e);
	}

%>