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
public class Mitarbeiter {
    private int MitarbeiterID;
    private String Vorname;
    private String Nachname;
    private int FilialenID;

    public Mitarbeiter() {
    }

    public Mitarbeiter(int MitarbeiterID, String Vorname, String Nachname, int FilialenID) {
        this.MitarbeiterID = MitarbeiterID;
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.FilialenID = FilialenID;
    }

    public int getMitarbeiterID() {
        return MitarbeiterID;
    }

    public void setMitarbeiterID(int MitarbeiterID) {
        this.MitarbeiterID = MitarbeiterID;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String Vorname) {
        this.Vorname = Vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String Nachname) {
        this.Nachname = Nachname;
    }

    public int getFilialenID() {
        return FilialenID;
    }

    public void setFilialenID(int FilialenID) {
        this.FilialenID = FilialenID;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" + "MitarbeiterID=" + MitarbeiterID + ", Vorname=" + Vorname + ", Nachname=" + Nachname + ", FilialenID=" + FilialenID + '}';
    }
    
    

}
