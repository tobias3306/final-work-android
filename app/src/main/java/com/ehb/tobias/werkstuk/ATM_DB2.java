package com.ehb.tobias.werkstuk;

import com.orm.SugarRecord;

/**
 * Created by Tobias on 11/01/2018.
 */

public class ATM_DB2 extends SugarRecord{
    private String Adress;
    private String Adresse;
    private String Agen;
    private String Quoi;
    private String Wat;
    private String What;
    private Double Latitude;
    private Double Longitude;

    public ATM_DB2() {
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getAgen() {
        return Agen;
    }

    public void setAgen(String agen) {
        Agen = agen;
    }

    public String getQuoi() {
        return Quoi;
    }

    public void setQuoi(String quoi) {
        Quoi = quoi;
    }

    public String getWat() {
        return Wat;
    }

    public void setWat(String wat) {
        Wat = wat;
    }

    public String getWhat() {
        return What;
    }

    public void setWhat(String what) {
        What = what;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double longitude) {
        Longitude = longitude;
    }
}
