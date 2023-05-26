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
public class Cooperation {
    public int CooperationID;
    public String RaID;
    public int FilialenID;

    public Cooperation() {
    }

    public Cooperation(int CooperationID, String RaID, int FilialenID) {
        this.CooperationID = CooperationID;
        this.RaID = RaID;
        this.FilialenID = FilialenID;
    }

    public int getCooperationID() {
        return CooperationID;
    }

    public void setCooperationID(int CooperationID) {
        this.CooperationID = CooperationID;
    }

    public String getRaID() {
        return RaID;
    }

    public void setRaID(String RaID) {
        this.RaID = RaID;
    }

    public int getFilialenID() {
        return FilialenID;
    }

    public void setFilialenID(int FilialenID) {
        this.FilialenID = FilialenID;
    }

    @Override
    public String toString() {
        return "Cooperation{" + "CooperationID=" + CooperationID + ", RaID=" + RaID + ", FilialenID=" + FilialenID + '}';
    }
    
}
