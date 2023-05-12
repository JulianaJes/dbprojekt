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
public class Kunde {
    private int KundenID;
    private String Vorname;
    private String Nachname;
    private String Email;
    private String Telefonnummer;
    private int FilialenID;

    public Kunde() {
    }

    public Kunde(int KundenID, String Vorname, String Nachname, String Email, String Telefonnummer, int FilialenID) {
        this.KundenID = KundenID;
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Email = Email;
        this.Telefonnummer = Telefonnummer;
        this.FilialenID = FilialenID;
    }

    public int getKundenID() {
        return KundenID;
    }

    public void setKundenID(int KundenID) {
        this.KundenID = KundenID;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefonnummer() {
        return Telefonnummer;
    }

    public void setTelefonnummer(String Telefonnummer) {
        this.Telefonnummer = Telefonnummer;
    }

    public int getFilialenID() {
        return FilialenID;
    }

    public void setFilialenID(int FilialenID) {
        this.FilialenID = FilialenID;
    }

    @Override
    public String toString() {
        return "Kunde{" + "KundenID=" + KundenID + ", Vorname=" + Vorname + ", Nachname=" + Nachname + ", Email=" + Email + ", Telefonnummer=" + Telefonnummer + ", FilialenID=" + FilialenID + '}';
    }
    
    
    
    
    
}
