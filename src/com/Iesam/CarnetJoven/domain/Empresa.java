package com.Iesam.CarnetJoven.domain;

import com.google.gson.Gson;

public class Empresa {

    private String IdEmpresa;
    private String nombreEmpresa;
    private String cif;

    public String getIdEmpresa() {
        return IdEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        IdEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }


    @Override
    public String toString (){
        return new Gson().toJson(this);
    }
}
