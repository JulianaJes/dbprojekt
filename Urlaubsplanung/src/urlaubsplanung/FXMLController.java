/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlaubsplanung;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Juliana
 */
public class FXMLController implements Initializable {

    private ListProperty<Hotel> listProperty = new SimpleListProperty();
    private ObservableList<Hotel> hotels;

    private ListProperty<Destination> listDestination = new SimpleListProperty();
    private ObservableList<Destination> destinations;

    @FXML
    private TextField tfVorname;
    @FXML
    private TextField tfNachname;
    @FXML
    private TextField tfEmail;
    @FXML
    private TextField tfTel;
    @FXML
    private ComboBox<Hotel> cbHotel;
    @FXML
    private Button btSave;
    @FXML
    private ComboBox<Destination> cbLand;
    @FXML
    private DatePicker dpAnreise;
    @FXML
    private DatePicker dpAbreise;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        hotels = HotelDAO.getHotels();
        cbHotel.itemsProperty().bind(listProperty);
        listProperty.setValue(hotels);

        destinations = DestinationDAO.getDestination();
        cbLand.itemsProperty().bind(listDestination);
        listDestination.setValue(destinations);
        
  
    }

    @FXML
    private void handleBtSaveAction(ActionEvent event) {
        Kunde k = new Kunde();
        Buchung b = new Buchung();

        k.setVorname(tfVorname.getText());
        k.setNachname(tfNachname.getText());
        k.setEmail(tfEmail.getText());
        k.setTelefonnummer(tfTel.getText());
        KundeDAO.saveKunde(k);
        
        Hotel h = cbHotel.getSelectionModel().getSelectedItem();
        b.HotelID = h.getHotelId();
        // BuchungDAO.saveBuchung(b); zu implementieren
    }

    @FXML
    private void cbDestinationAction(ActionEvent event) {
        Destination d = cbLand.getSelectionModel().getSelectedItem();
        if (d != null) {
            System.out.println(d.getZielID() + " " + d);
            hotels = HotelDAO.getHotels(d.getZielID());
            cbHotel.itemsProperty().bind(listProperty);
            listProperty.setValue(hotels);
        }
    }

    @FXML
    private void cbHotelAction(ActionEvent event) {
        Hotel h = cbHotel.getSelectionModel().getSelectedItem();
        if (h != null)
            System.out.println(h.getHotelId() + " " + h);
    }

    @FXML
    private void dpAnreiseAction(ActionEvent event) {
        System.out.println("Datum der Anreise : " + dpAnreise.getValue());
    }

    @FXML
    private void dpAbreiseAction(ActionEvent event) {
        System.out.println("Datum der Abreise : " + dpAbreise.getValue());
    }
}
