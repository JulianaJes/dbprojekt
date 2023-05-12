/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlaubsplanung;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBConnector;
import util.DML_DAO;

/**
 *
 * @author kaise
 */
public class HotelDao {
    
    public static ObservableList<Hotel> getHotels () {
        ObservableList<Hotel> hotelsList = 
                FXCollections.observableArrayList();
        Connection con;
        
        try {
            con = DBConnector.connect();
            String sql = "SELECT * FROM hotels";
            ResultSet rs = con.createStatement().executeQuery(sql);
            
            while (rs.next()) {
                hotelsList.add(new Hotel(
                     rs.getInt("HotelID"),
                     rs.getString("Name"),
                     rs.getInt("Postleitzahl"),
                     rs.getString("Adresse"),
                     rs.getString("TelNr"),
                     rs.getString("E_Mail"),
                     rs.getInt("Sterneanzahl"),  
                     rs.getInt("Sterneanzahl")
                        
               ));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
        return hotelsList;
    }
  

    
}
