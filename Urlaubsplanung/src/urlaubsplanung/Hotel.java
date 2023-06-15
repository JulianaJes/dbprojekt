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
public class Hotel {
    private int id;
    private String Name;
    private String Strasse;
    private int PLZ;
    private String Ort;
    private String TelNr;
    private String Email;
    private int Sterneanzahl;
    private int DestId;

    public Hotel(int id, String Name, String Strasse, int PLZ, String Ort, String TelNr, String Email, int Sterneanzahl,int DestId) {
       this.id=id;
       this.Name=Name;
       this.Strasse=Strasse;
       this.PLZ=PLZ;
       this.Ort=Ort;
       this.TelNr=TelNr;
       this.Email=Email;
       this.Sterneanzahl=Sterneanzahl;
       this.DestId=DestId;
       
    }

    public Hotel() {
    }

    public int getHotelId() {
        return id;
    }

    public void setHotelId(int id) {
        this.id=id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public String getStrasse(){
        return Strasse;
    }
    public void setStrasse(String Strasse){
        this.Strasse=Strasse;
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

    public void setOrt (String Ort) {
        this.Ort = Ort;
    }

    public String getTelNr() {
        return TelNr;
    }

    public void setTelNr(String TelNr) {
        this.TelNr = TelNr;
    }

    public String getEmail() {
        return Email;
    }

    public void setE_Mail(String Email) {
        this.Email = Email;
    }

    public int getSterneanzahl() {
        return Sterneanzahl;
    }

    public void setSterneanzahl(int Sterneanzahl) {
        this.Sterneanzahl = Sterneanzahl;
    }

    public int getDestId() {
        return DestId;
    }

    public void setZielID(int DestId) {
        this.DestId = DestId;
    }

    @Override
    public String toString() {
        
        return "Hotel "+Name+" in "+Ort+"("+Sterneanzahl+" Sterne)";
    }
    
    
    
}
