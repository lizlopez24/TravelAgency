package com.desarrollo.model;

import java.sql.*;

public class TravelsDAOImpl implements TravelsDAO {

    private static final String SQL_INSERT = "INSERT INTO TRAVELS (name, lastname,cardid,phonenum,email,destination_place,tickets,start_date,end_date, adults, children, jubilate,days,hotel,food,aditional_transport,aditional_guide,aditional_places,price) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_FINDBYID="SELECT * FROM TRAVELS WHERE id=?";

    @Override
    public int insert(TravelsDTO travel) {
        int register = 0;
        try {
            Connection conn = Conection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, travel.getName());
            stmt.setString(2, travel.getLastName());
            stmt.setString(3, travel.getCardID());
            stmt.setString(4, travel.getPhoneNum());
            stmt.setString(5, travel.getEmail());
            stmt.setString(6, travel.getDestinationPlace());
            stmt.setBoolean(7, travel.isTicketsA());
            stmt.setDate(8, travel.getStartDate());
            stmt.setDate(9, travel.getEndDate());
            stmt.setInt(10, travel.getAdults());
            stmt.setInt(11, travel.getChildren());
            stmt.setInt(12, travel.getJubilate());
            stmt.setInt(13, travel.getDaysTravel());
            stmt.setString(14, travel.getHotel());
            stmt.setString(15, travel.getFood());
            stmt.setBoolean(16, travel.isAditionalTransport());
            stmt.setBoolean(17, travel.isAditionalGuide());
            stmt.setBoolean(18, travel.isAditionalPlaces());
            stmt.setDouble(19, travel.getSubtotal());

            register = stmt.executeUpdate();

            if (register != 0) {
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    register = generatedKeys.getInt(1);
                }
            }

            Conection.close(stmt);
            Conection.close(conn);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return register;
    }

    @Override
    public TravelsDTO findByID(int id) {
        TravelsDTO travel=new TravelsDTO();
        
        try {
            Connection conn=Conection.getConnection();
            PreparedStatement stmt= conn.prepareStatement(SQL_FINDBYID);
            stmt.setInt(1, id);
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                travel= new TravelsDTO(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getBoolean(8), rs.getDate(9), rs.getDate(10), rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14), rs.getString(15), rs.getString(16), rs.getBoolean(17), rs.getBoolean(18), rs.getBoolean(19),rs.getInt(20));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        return travel;
    }
}
