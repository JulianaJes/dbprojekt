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
    private DatePicker dp_anreise;
    @FXML
    private DatePicker dp_abreise;
    @FXML
    private Button btSave;
    @FXML
    private ComboBox<?> cbLand;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        hotels = HotelDAO.getHotels();
        cbHotel.itemsProperty().bind(listProperty);
        listProperty.setValue(hotels);
    }    

    @FXML
    private void handleBtSaveAction(ActionEvent event) {
        Kunde k = new Kunde();
        
        k.setVorname(tfVorname.getText());
        k.setNachname(tfNachname.getText());
        k.setEmail(tfEmail.getText());
        k.setTelefonnummer(tfTel.getText());
        
        KundeDAO.saveKunde(k);
    }
    
}
