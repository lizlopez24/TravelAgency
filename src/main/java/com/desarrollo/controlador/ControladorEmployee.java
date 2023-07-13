
package com.desarrollo.controlador;

import com.desarrollo.model.*;


public class ControladorEmployee {
    private EmployeeDAO datos= new EmployeeDAOImpl();
    
    public int insertEmployee(String name, String lastName, String cardID, String email, String genero, String user, String password){
        int register;
        EmployeeDTO employee= new EmployeeDTO(name, lastName, cardID, email, genero, user, password);
        
        register=datos.insert(employee);
        
        return register;
    }
    
    public boolean loginEmployee(String user, String password){
        boolean checkRecords;
        EmployeeDTO employee= new EmployeeDTO(user, password);
        checkRecords=datos.select(employee);
        return checkRecords;        
    }
}
