
package urlaubsplanung;


public class Destination {
    private int id;
    private String Land;
    private String Stadt;
    private String Waehrung;
    private String Kontinent;
    private String Sprachen;
    private int RaID;

    public Destination() {
    }

    public Destination(int id, String Land, String Stadt, String Waehrung, String Kontinent, String Sprachen, int RaID) {
        this.id = id;
        this.Land = Land;
        this.Stadt = Stadt;
        this.Waehrung = Waehrung;
        this.Kontinent = Kontinent;
        this.Sprachen = Sprachen;
        this.RaID = RaID;
    }

    public int getZielID() {
        return id;
    }

    public void setZielID(int id) {
        this.id = id;
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

    public String getWaehrung() {
        return Waehrung;
    }

    public void setWaehrung(String Waehrung) {
        this.Waehrung = Waehrung;
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
        return Land;
    }
    
    

}