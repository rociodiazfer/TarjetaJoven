package com.Iesam.CarnetJoven.domain;

import java.util.List;

public class GetUsuarioUseCase {

    private UsuarioRepository usuarioRepository;

    public GetUsuarioUseCase(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    public Usuario execute(String usuarioId){
        return this.usuarioRepository.getById(usuarioId);
    }

}
