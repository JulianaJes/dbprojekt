package urlaubsplanung;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import urlaubsplanung.Buchung;
import util.DBConnector;
import util.DML_DAO;


public class BuchungDAO {

    public static ObservableList<Buchung> getBuchung() {
        ObservableList<Buchung> buchungList
                = FXCollections.observableArrayList();
        Connection con;

        try {
            con = DBConnector.connect();
            String sql = "SELECT * FROM Buchung";
            ResultSet rs = con.createStatement().executeQuery(sql);

            while (rs.next()) {
                buchungList.add(new Buchung(
                        rs.getInt("id"),
                        rs.getInt("KundenId"),
                        rs.getInt("MitarbeiterId"),
                        rs.getInt("HotelId"),
                        rs.getDate("Anfangsdatum"),
                        rs.getDate("Enddatum")));
                        }
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return buchungList;
    }

    public static void saveBuchung(Buchung buchung) {
        String sql = "Insert into kunde (KundenId,MitarbeiterId,HotelId,Anfangsdatum,Enddatum)values("
                + "'" + buchung.getKundenID()+ "',"
                + "'" + buchung.getMitarbeiterID()+ "',"
                + "'" + buchung.getHotelID() + "',"
                + "'" + buchung.getAnfangsdatum() + "',"
                 + "'" + buchung.getEnddatum() + "',"
                + "1)"; // '" + kunde.getFilialenID() + "')";
        System.out.println("sql: " + sql);
        DML_DAO.executeDML(sql);

    }

}
