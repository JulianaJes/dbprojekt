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
import util.DML_DAO;

/**
 *
 * @author kaise
 */
public class KundeDAO {

    public static ObservableList<Kunde> getKunden() {
        ObservableList<Kunde> kundenList
                = FXCollections.observableArrayList();
        Connection con;

        try {
            con = DBConnector.connect();
            String sql = "SELECT * FROM persons";
            ResultSet rs = con.createStatement().executeQuery(sql);

            while (rs.next()) {
                kundenList.add(new Kunde(
                        rs.getInt("KundenID"),
                        rs.getString("vorname"),
                        rs.getString("nachname"),
                        rs.getString("Email"),
                        rs.getString("TelNR"),
                        rs.getInt("FilialenID")));

            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return kundenList;
    }

    public static void saveKunde(Kunde kunde) {
        String sql = "Insert into kunde (Vorname,Nachname,Email,Telefonnummer,FilialenId)values("
                + "'" + kunde.getVorname() + "',"
                + "'" + kunde.getNachname() + "',"
                + "'" + kunde.getEmail() + "',"
                + "'" + kunde.getTelefonnummer() + "',"
                + "1)"; // '" + kunde.getFilialenID() + "')";
        System.out.println("sql: " + sql);
        DML_DAO.executeDML(sql);

    }

}
