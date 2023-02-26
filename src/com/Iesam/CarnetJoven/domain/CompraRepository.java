package com.Iesam.CarnetJoven.domain;

import com.Iesam.CarnetJoven.data.UsuarioDataRepository;

import java.util.List;

public interface CompraRepository {

    public void save(Compra compra);

    public Compra getById(String compraId);

    public List<Compra> getAll();

}
