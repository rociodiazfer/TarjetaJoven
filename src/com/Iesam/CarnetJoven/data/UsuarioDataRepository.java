package com.Iesam.CarnetJoven.data;

import com.Iesam.CarnetJoven.data.Local.UsuarioFileLocalDataSource;
import com.Iesam.CarnetJoven.domain.Usuario;
import com.Iesam.CarnetJoven.domain.UsuarioRepository;

import java.util.List;

public class UsuarioDataRepository implements UsuarioRepository {


    private UsuarioFileLocalDataSource localDataSource;

    public UsuarioDataRepository(UsuarioFileLocalDataSource usuarioFileLocalDataSource){
        this.localDataSource = usuarioFileLocalDataSource;
    }
    @Override
    public void save(Usuario newUsuario) {
        this.localDataSource.save(newUsuario);
    }

    @Override
    public Usuario getById(String usuarioId) {
        return this.localDataSource.findById(usuarioId);
    }

    @Override
    public List<Usuario> getAll() {
        return this.localDataSource.findAll();
    }

    @Override
    public List<Usuario> getAllWithRemote() {
        return null;
    }

}
