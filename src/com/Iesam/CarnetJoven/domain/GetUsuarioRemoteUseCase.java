package com.Iesam.CarnetJoven.domain;

import java.util.List;

public class GetUsuarioRemoteUseCase {

    private UsuarioRepository usuarioRepository;

    public GetUsuarioRemoteUseCase(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> execute(){
        return this.usuarioRepository.getAllWithRemote();
    }
}
