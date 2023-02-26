package com.Iesam.CarnetJoven.domain;

import com.google.gson.Gson;

public class Promocion {

    private String IdPromociones;
    private String tituloPromocion;
    private String DesPromocion;
    private Double descuentoPromocion;

    public String getIdPromociones() {
        return IdPromociones;
    }

    public void setIdPromociones(String idPromociones) {
        IdPromociones = idPromociones;
    }

    public String getTituloPromocion() {
        return tituloPromocion;
    }

    public void setTituloPromocion(String tituloPromocion) {
        this.tituloPromocion = tituloPromocion;
    }

    public String getDesPromocion() {
        return DesPromocion;
    }

    public void setDesPromocion(String desPromocion) {
        DesPromocion = desPromocion;
    }

    public Double getDescuentoPromocion() {
        return descuentoPromocion;
    }

    public void setDescuentoPromocion(Double descuentoPromocion) {
        this.descuentoPromocion = descuentoPromocion;
    }
    @Override
    public String toString (){
        return new Gson().toJson(this);
    }
}
