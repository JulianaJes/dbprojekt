/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlaubsplanung;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kaise
 */
public class FXMLController implements Initializable {

    @FXML
    private TextField tf_vorname;
    @FXML
    private TextField tf_nachname;
    @FXML
    private TextField tf_email;
    @FXML
    private TextField tf_tel;
    @FXML
    private ComboBox<?> cb_land;
    @FXML
    private ComboBox<?> cb_hotel;
    @FXML
    private DatePicker dp_anreise;
    @FXML
    private DatePicker dp_abreise;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
