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
public class Reiseanbieter {
    public int RaID;
    public String Name;
    public int TelNr;
    public String EMail;

    public Reiseanbieter() {
    }

    public Reiseanbieter(int RaID, String Name, int TelNr, String EMail) {
        this.RaID = RaID;
        this.Name = Name;
        this.TelNr = TelNr;
        this.EMail = EMail;
    }

    public int getRaID() {
        return RaID;
    }

    public void setRaID(int RaID) {
        this.RaID = RaID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getTelNr() {
        return TelNr;
    }

    public void setTelNr(int TelNr) {
        this.TelNr = TelNr;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    @Override
    public String toString() {
        return "Reiseanbieter{" + "RaID=" + RaID + ", Name=" + Name + ", TelNr=" + TelNr + ", EMail=" + EMail + '}';
    }
    
}
