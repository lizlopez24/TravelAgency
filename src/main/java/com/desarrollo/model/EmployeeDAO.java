
package com.desarrollo.model;


public interface EmployeeDAO {
    public abstract boolean select(EmployeeDTO employee);
    public abstract int insert(EmployeeDTO employee);
}
