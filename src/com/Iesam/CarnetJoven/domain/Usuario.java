package com.Iesam.CarnetJoven.domain;

import com.google.gson.Gson;

public class Usuario {

    private String nif;
    private String name;
    private String surname;
    private String adress;


    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    @Override
    public String toString (){
        return new Gson().toJson(this);
    }
}
