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
public class Filiale {
    public int FilialenID;
    public String Filialenname;
    public String Strasse;
    public String Hausnummer;
    public int PLZ;
    public String Ort;
    public int AnzahlMitarbeiter;

    public Filiale() {
    }

    public Filiale(int FilialenID, String Filialenname, String Strasse, String Hausnummer, int PLZ, String Ort, int AnzahlMitarbeiter) {
        this.FilialenID = FilialenID;
        this.Filialenname = Filialenname;
        this.Strasse = Strasse;
        this.Hausnummer = Hausnummer;
        this.PLZ = PLZ;
        this.Ort = Ort;
        this.AnzahlMitarbeiter = AnzahlMitarbeiter;
    }

    public int getFilialenID() {
        return FilialenID;
    }

    public void setFilialenID(int FilialenID) {
        this.FilialenID = FilialenID;
    }

    public String getFilialenname() {
        return Filialenname;
    }

    public void setFilialenname(String Filialenname) {
        this.Filialenname = Filialenname;
    }

    public String getStrasse() {
        return Strasse;
    }

    public void setStrasse(String Strasse) {
        this.Strasse = Strasse;
    }

    public String getHausnummer() {
        return Hausnummer;
    }

    public void setHausnummer(String Hausnummer) {
        this.Hausnummer = Hausnummer;
    }

    public int getPLZ() {
        return PLZ;
    }

    public void setPLZ(int PLZ) {
        this.PLZ = PLZ;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String Ort) {
        this.Ort = Ort;
    }

    public int getAnzahlMitarbeiter() {
        return AnzahlMitarbeiter;
    }

    public void setAnzahlMitarbeiter(int AnzahlMitarbeiter) {
        this.AnzahlMitarbeiter = AnzahlMitarbeiter;
    }

    @Override
    public String toString() {
        return "Filiale{" + "FilialenID=" + FilialenID + ", Filialenname=" + Filialenname + ", Strasse=" + Strasse + ", Hausnummer=" + Hausnummer + ", PLZ=" + PLZ + ", Ort=" + Ort + ", AnzahlMitarbeiter=" + AnzahlMitarbeiter + '}';
    }
    
}
