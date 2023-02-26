package com.Iesam.CarnetJoven.domain;

import java.util.List;

public interface EmpresaRepository {

    public void save(Empresa empresa);

    public Empresa getById(String empresaId);

    public List<Empresa> getAll();

    List<Usuario> getAllWithRemote();


}
