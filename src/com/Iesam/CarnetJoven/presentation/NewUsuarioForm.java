package com.Iesam.CarnetJoven.presentation;

import com.Iesam.CarnetJoven.data.Local.UsuarioFileLocalDataSource;
import com.Iesam.CarnetJoven.data.UsuarioDataRepository;
import com.Iesam.CarnetJoven.domain.AddUsuariosUseCase;
import com.Iesam.CarnetJoven.domain.Usuario;

public class NewUsuarioForm {


    public void createNewUsuario(){
        Usuario usuario =buildUsuario();
        saveUsuario(usuario);
    }
    private Usuario buildUsuario(){
        Usuario usuario = new Usuario();
        usuario.setAdress("C/Móstoles");
        usuario.setSurname("DF");
        usuario.setName("Rocio");
        usuario.setNif("743274872");

        return usuario;
    }
    private void saveUsuario(Usuario usuario){
        AddUsuariosUseCase addUsuariosUseCase = new AddUsuariosUseCase(new UsuarioDataRepository(UsuarioFileLocalDataSource.getInstance()));
        addUsuariosUseCase.execute(usuario);
    }
}
