package be.myvibe.bean;

import java.io.Serializable;
import java.sql.Date;

public class UserBean implements Serializable {
    private int idGebruiker;
    private int idGebruikertype;
    private String gebruikersnaam;
    private String wachtwoord;
    private String email;
    private String voornaam;
    private String achternaam;
    private String straat;
    private String huisnummer;
    private String gemeente;
    private String postcode;
    private Date geboortedatum;
    private String geslacht;

    @Override
    public String toString() {
        return "UserBean{" + "idGebruiker=" + idGebruiker + ", idGebruikertype=" + idGebruikertype + ", gebruikersnaam=" + gebruikersnaam + ", wachtwoord=" + wachtwoord + ", email=" + email + ", voornaam=" + voornaam + ", achternaam=" + achternaam + ", straat=" + straat + ", huisnummer=" + huisnummer + ", gemeente=" + gemeente + ", postcode=" + postcode + ", geboortedatum=" + geboortedatum + ", geslacht=" + geslacht + '}';
    }
    
    public int getIdGebruiker() {
        return idGebruiker;
    }

    public void setIdGebruiker(int idGebruiker) {
        this.idGebruiker = idGebruiker;
    }

    public int getIdGebruikertype() {
        return idGebruikertype;
    }

    public void setIdGebruikertype(int idGebruikertype) {
        this.idGebruikertype = idGebruikertype;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }
    
}
