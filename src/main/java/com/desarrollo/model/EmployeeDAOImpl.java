package com.desarrollo.model;

import java.sql.*;


public class EmployeeDAOImpl implements EmployeeDAO {

    private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (name, lastname, cardid, email, genero, user, password) VALUES (?,?,?,?,?,?,SHA1(?))";
    private static final String SQL_SELECT = "SELECT * FROM EMPLOYEE WHERE user=? AND password=SHA1(?)";

    @Override
    public boolean select(EmployeeDTO employee) {
        try {
            Connection conn = Conection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setString(1, employee.getUser());
            stmt.setString(2, employee.getPassword());
            ResultSet rs= stmt.executeQuery();
            
            if(rs.next()){
                System.out.println(rs.getString(2));
                return true;
            }
            Conection.close(rs);
            Conection.close(stmt);
            Conection.close(conn);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return false;
    }

    @Override
    public int insert(EmployeeDTO employee) {
        int register = 0;
        try {
            Connection conn = Conection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getLastName());
            stmt.setString(3, employee.getCardID());
            stmt.setString(4, employee.getEmail());
            stmt.setString(5, employee.getGenero());
            stmt.setString(6, employee.getUser());
            stmt.setString(7, employee.getPassword());

            register = stmt.executeUpdate();

            Conection.close(stmt);
            Conection.close(conn);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return register;
    }

}
