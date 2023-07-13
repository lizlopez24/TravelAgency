
package com.desarrollo.model;

public interface TravelsDAO {
    public abstract int insert(TravelsDTO travel);
    public abstract TravelsDTO findByID(int id);
}
