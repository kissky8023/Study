package com.YStudio.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {

	private static final String DBDRIVER = "com.mysql.jdbc.Driver"; // 驱动串

	private static final String DBURL = "jdbc:mysql://172.30.15.97:3306/shop";// 连接URL
	private static final String DBUSER = "root";
	private static final String DBPASSWORD = "root";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBDRIVER); // 注册驱动
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn) {
		if (conn != null) {
			// 如果 conn 连接对象不为空
			try {
				conn.close(); // 关闭 conn 连接对象对象
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(PreparedStatement pstmt) {
		if (pstmt != null) {// 如果 pstmt 预处理对象不为空
			try {
				pstmt.close();// 关闭 pstmt 预处理对象
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs) {
		if (rs != null) {// 如果 rs 结果集对象不为 null
			try {

				rs.close();// 关闭 rs 结果集对象

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
