package com.Iesam.CarnetJoven.domain;

public class AddUsuariosUseCase {

    private UsuarioRepository usuarioRepository;

    public AddUsuariosUseCase(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    public void execute (Usuario usuario){
        this.usuarioRepository.save(usuario);
    }
}
