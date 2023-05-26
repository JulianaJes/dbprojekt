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
public class Zuteilung {
    public int ZuteilungsID;
    public int RaID;
    public int HotelID;

    public Zuteilung() {
    }

    public Zuteilung(int ZuteilungsID, int RaID, int HotelID) {
        this.ZuteilungsID = ZuteilungsID;
        this.RaID = RaID;
        this.HotelID = HotelID;
    }

    public int getZuteilungsID() {
        return ZuteilungsID;
    }

    public void setZuteilungsID(int ZuteilungsID) {
        this.ZuteilungsID = ZuteilungsID;
    }

    public int getRaID() {
        return RaID;
    }

    public void setRaID(int RaID) {
        this.RaID = RaID;
    }

    public int getHotelID() {
        return HotelID;
    }

    public void setHotelID(int HotelID) {
        this.HotelID = HotelID;
    }

    @Override
    public String toString() {
        return "Zuteilung{" + "ZuteilungsID=" + ZuteilungsID + ", RaID=" + RaID + ", HotelID=" + HotelID + '}';
    }
    
}
