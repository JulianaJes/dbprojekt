/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlaubsplanung;

/**
 *
 * @author kaise
 */
public class Hotel {
    private int HotelID;
    private String Name;
    private String Postleitzahl;
    private String Adresse;
    private String TelNr;
    private String E_Mail;
    private int Sterneanzahl;
    private int ZielID;

    public Hotel(int HotelID, String Name, String Postleitzahl, String Adresse, String TelNr, String E_Mail, int Sterneanzahl, int ZielID) {
        this.HotelID = HotelID;
        this.Name = Name;
        this.Postleitzahl = Postleitzahl;
        this.Adresse = Adresse;
        this.TelNr = TelNr;
        this.E_Mail = E_Mail;
        this.Sterneanzahl = Sterneanzahl;
        this.ZielID = ZielID;
    }

    public Hotel() {
    }

    public int getHotelID() {
        return HotelID;
    }

    public void setHotelID(int HotelID) {
        this.HotelID = HotelID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPostleitzahl() {
        return Postleitzahl;
    }

    public void setPostleitzahl(String Postleitzahl) {
        this.Postleitzahl = Postleitzahl;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getTelNr() {
        return TelNr;
    }

    public void setTelNr(String TelNr) {
        this.TelNr = TelNr;
    }

    public String getE_Mail() {
        return E_Mail;
    }

    public void setE_Mail(String E_Mail) {
        this.E_Mail = E_Mail;
    }

    public int getSterneanzahl() {
        return Sterneanzahl;
    }

    public void setSterneanzahl(int Sterneanzahl) {
        this.Sterneanzahl = Sterneanzahl;
    }

    public int getZielID() {
        return ZielID;
    }

    public void setZielID(int ZielID) {
        this.ZielID = ZielID;
    }

    @Override
    public String toString() {
        
        return name;
    }
    
    
    
}
