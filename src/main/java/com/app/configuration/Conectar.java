package com.app.configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
	
	private static Connection con;
	private static final String USER="root";
	private static final String PASS="";
	private static final String URL="jdbc:mysql://localhost:3306/exam";
	private static final String DRIVER="com.mysql.cj.jdbc.Driver";
	public static Connection conectarBD() {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL,USER,PASS);
		} catch (Exception e) {
			System.out.println("Error de conexión: "+e);
		}
		return con;
	}
	
	

}
