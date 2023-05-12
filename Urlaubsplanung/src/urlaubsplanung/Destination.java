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
public class Destination {
    private int ZielID;
    private String Land;
    private String Stadt;
    private String Währung;
    private String Kontinent;
    private String Sprachen;
    private int RaID;

    public Destination() {
    }

    public Destination(int ZielID, String Land, String Stadt, String Währung, String Kontinent, String Sprachen, int RaID) {
        this.ZielID = ZielID;
        this.Land = Land;
        this.Stadt = Stadt;
        this.Währung = Währung;
        this.Kontinent = Kontinent;
        this.Sprachen = Sprachen;
        this.RaID = RaID;
    }

    public int getZielID() {
        return ZielID;
    }

    public void setZielID(int ZielID) {
        this.ZielID = ZielID;
    }

    public String getLand() {
        return Land;
    }

    public void setLand(String Land) {
        this.Land = Land;
    }

    public String getStadt() {
        return Stadt;
    }

    public void setStadt(String Stadt) {
        this.Stadt = Stadt;
    }

    public String getWährung() {
        return Währung;
    }

    public void setWährung(String Währung) {
        this.Währung = Währung;
    }

    public String getKontinent() {
        return Kontinent;
    }

    public void setKontinent(String Kontinent) {
        this.Kontinent = Kontinent;
    }

    public String getSprachen() {
        return Sprachen;
    }

    public void setSprachen(String Sprachen) {
        this.Sprachen = Sprachen;
    }

    public int getRaID() {
        return RaID;
    }

    public void setRaID(int RaID) {
        this.RaID = RaID;
    }

    @Override
    public String toString() {
        return "Destination{" + "Land=" + Land + '}';
    }
    
    

}