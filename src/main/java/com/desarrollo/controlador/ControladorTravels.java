
package com.desarrollo.controlador;

import com.desarrollo.model.*;
import java.sql.Date;

public class ControladorTravels {
    private TravelsDAO datos= new TravelsDAOImpl();
    
    public int insertTravel(String name, String lastName, String cardID, String phoneNum, String email, String destinationPlace, boolean ticketsA, Date startDate, Date endDate, int adults, int children, int jubilate, int daysTravel, String hotel, String food, boolean aditionalTransport, boolean aditionalGuide, boolean aditionalPlaces, double subtotal){
        int register;
        TravelsDTO travel= new TravelsDTO(name, lastName, cardID, phoneNum, email, destinationPlace, ticketsA, startDate, endDate, adults, children, jubilate, daysTravel, hotel, food, aditionalTransport, aditionalGuide, aditionalPlaces, subtotal);
        register=datos.insert(travel);
        return register;
    }
    
    public TravelsDTO findTravel(int id){
        return datos.findByID(id);
    }
        
}
