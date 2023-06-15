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
import util.DBConnector;

/**
 *
 * @author kaise
 */
public class HotelDAO {

    public static ObservableList<Hotel> getHotels() {
        ObservableList<Hotel> hotelsList
                = FXCollections.observableArrayList();
        Connection con;

        try {
            con = DBConnector.connect();
            String sql = "SELECT * FROM hotel";
            ResultSet rs = con.createStatement().executeQuery(sql);

            while (rs.next()) {
                hotelsList.add(new Hotel(
                        rs.getInt("id"),
                        rs.getString("Name"),
                        rs.getString("Strasse"),
                        rs.getInt("PLZ"),
                        rs.getString("Ort"),
                        rs.getString("Telefonnummer"),
                        rs.getString("Email"),
                        rs.getInt("Sterneanzahl"),
                        rs.getInt("DestId")
                ));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return hotelsList;
    }

    public static ObservableList<Hotel> getHotels(int ZielId) {
        ObservableList<Hotel> hotelsList
                = FXCollections.observableArrayList();
        Connection con;

        try {
            con = DBConnector.connect();
            String sql = "SELECT * FROM hotel";
            ResultSet rs = con.createStatement().executeQuery(sql);

            while (rs.next()) {
                if (rs.getInt("DestId") == ZielId) {
                    hotelsList.add(new Hotel(
                            rs.getInt("id"),
                            rs.getString("Name"),
                            rs.getString("Strasse"),
                            rs.getInt("PLZ"),
                            rs.getString("Ort"),
                            rs.getString("Telefonnummer"),
                            rs.getString("Email"),
                            rs.getInt("Sterneanzahl"),
                            rs.getInt("DestId")
                    ));
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return hotelsList;
    }

}
