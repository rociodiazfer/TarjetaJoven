package com.Iesam.CarnetJoven.domain;

import com.google.gson.Gson;

import java.util.Date;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Compra {

    private String idCompra;
    private Date dateCompra;

    private Promocion promocion;

    private Usuario usuario;

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public Date getDateCompra() {
        return dateCompra;
    }

    public void setDateCompra(Date dateCompra) {
        this.dateCompra = dateCompra;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    @Override
    public String toString (){
        return new Gson().toJson(this);
    }
}
