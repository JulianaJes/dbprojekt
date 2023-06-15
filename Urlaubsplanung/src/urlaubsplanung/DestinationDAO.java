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
 * @author Juliana
 */
public class DestinationDAO {

    public static ObservableList<Destination> getDestination() {
        ObservableList<Destination> destinationList
                = FXCollections.observableArrayList();
        Connection con;

        try {
            con = DBConnector.connect();
            String sql = "SELECT * FROM destination";
            ResultSet rs = con.createStatement().executeQuery(sql);

            while (rs.next()) {
                destinationList.add(new Destination(
                        rs.getInt("Zielid"),
                        rs.getString("Land"),
                        rs.getString("Stadt"),
                        rs.getString("Waehrung"),
                        rs.getString("Koninent"),
                        rs.getString("Sprache"),
                        rs.getInt("RaId")
                ));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return destinationList;
    }

}

/**
 *
 * @author kaise
 */
