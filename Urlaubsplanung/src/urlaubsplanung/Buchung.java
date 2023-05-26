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
public class Buchung {
    public int BuchungsID;
    public int KundenID;
    public int MitarbeiterID;
    public int HotelID;
    public String Zeitraum;

    public Buchung() {
    }

    public Buchung(int BuchungsID, int KundenID, int MitarbeiterID, int HotelID, String Zeitraum) {
        this.BuchungsID = BuchungsID;
        this.KundenID = KundenID;
        this.MitarbeiterID = MitarbeiterID;
        this.HotelID = HotelID;
        this.Zeitraum = Zeitraum;
    }

    public int getBuchungsID() {
        return BuchungsID;
    }

    public void setBuchungsID(int BuchungsID) {
        this.BuchungsID = BuchungsID;
    }

    public int getKundenID() {
        return KundenID;
    }

    public void setKundenID(int KundenID) {
        this.KundenID = KundenID;
    }

    public int getMitarbeiterID() {
        return MitarbeiterID;
    }

    public void setMitarbeiterID(int MitarbeiterID) {
        this.MitarbeiterID = MitarbeiterID;
    }

    public int getHotelID() {
        return HotelID;
    }

    public void setHotelID(int HotelID) {
        this.HotelID = HotelID;
    }

    public String getZeitraum() {
        return Zeitraum;
    }

    public void setZeitraum(String Zeitraum) {
        this.Zeitraum = Zeitraum;
    }

    @Override
    public String toString() {
        return "Buchung{" + "BuchungsID=" + BuchungsID + ", KundenID=" + KundenID + ", MitarbeiterID=" + MitarbeiterID + ", HotelID=" + HotelID + ", Zeitraum=" + Zeitraum + '}';
    }
    
    
}
