
package com.desarrollo.model;

import java.sql.*;

public class Conection {
    public static final String JDBC_URL="jdbc:mysql://localhost:3306/travel_agency?useSLL=false&serverTimezone=UTC";
    public static final String JDBC_USER="root";
    public static final String JDBC_PASSWORD="root";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    public static void close(PreparedStatement stmt) throws SQLException{
        stmt.close();
    }
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
