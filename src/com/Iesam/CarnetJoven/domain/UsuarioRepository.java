package com.Iesam.CarnetJoven.domain;

import java.util.List;

public interface UsuarioRepository {

    public void save(Usuario usuario);

    public Usuario getById(String usuarioId);

    public List<Usuario> getAll();

    List<Usuario> getAllWithRemote();

}
