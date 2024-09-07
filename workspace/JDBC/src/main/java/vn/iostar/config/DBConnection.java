package vn.iostar.config;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {
	private static Connection conn = null;
	private static String USERNAME = "root";
	private static String PASSWORD = "Tho#2209";
	private static String URL = "jdbc:mysql://localhost:3306/jdbc";
	
	public static Connection getDBConnection() throws IOException {
		conn = null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException ex) {
			Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
		}
		return (conn);
	}
	public static void main(String[] args) {
		String sql = "INSERT INTO users VALUES(?,?,?)";
		String sesql = "SELECT * FROM users ";
		try {
			Connection conn = getDBConnection();
			PreparedStatement p = conn.prepareStatement(sql);
			p.setInt(1, 1);
			p.setString(2, "Thơ");
			p.setString(3, "123");
			p.execute();
			p = conn.prepareStatement(sesql);
			ResultSet rs = p.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " "+ rs.getString(2));
			}
			p.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
