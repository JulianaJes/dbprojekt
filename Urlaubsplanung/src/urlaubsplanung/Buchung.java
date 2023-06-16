/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlaubsplanung;

import java.sql.Date;


/**
 *
 * @author kaise
 */
public class Buchung {
    public int BuchungsID;
    public int KundenID;
    public int MitarbeiterID;
    public int HotelID;
    public Date Anfangsdatum;
    public Date Enddatum;

    public Buchung() {
    }

    public Buchung(int BuchungsID, int KundenID, int MitarbeiterID, int HotelID, Date Anfangsdatum, Date Enddatum ) {
        this.BuchungsID = BuchungsID;
        this.KundenID = KundenID;
        this.MitarbeiterID = MitarbeiterID;
        this.HotelID = HotelID;
        this.Anfangsdatum=Anfangsdatum;
        this.Enddatum=Enddatum;
       
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

    public Date getAnfangsdatum() {
        return Anfangsdatum;
    }

    public void setAnfangsdatum(Date Anfangsdatum) {
        this.Anfangsdatum=Anfangsdatum;
    }
    
      public Date getEnddatum() {
        return Enddatum;
    }

    public void setEnddatum(Date Enddatum) {
        this.Enddatum=Enddatum;
    }


    @Override
    public String toString() {
        return "Buchung{" + "BuchungsID=" + BuchungsID + ", KundenID=" + KundenID + ", MitarbeiterID=" + MitarbeiterID + ", HotelID=" + HotelID 
                + ", Zeitraum=" + Anfangsdatum + " bis "+Enddatum;
    }
    
    
}
