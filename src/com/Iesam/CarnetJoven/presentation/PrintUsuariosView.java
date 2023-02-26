package com.Iesam.CarnetJoven.presentation;

import com.Iesam.CarnetJoven.data.Local.UsuarioFileLocalDataSource;
import com.Iesam.CarnetJoven.data.UsuarioDataRepository;
import com.Iesam.CarnetJoven.domain.GetUsuarioUseCase;
import com.Iesam.CarnetJoven.domain.Usuario;

import java.util.List;

public class PrintUsuariosView {

    public void print() {
        GetUsuarioUseCase useCase = new GetUsuarioUseCase(new UsuarioDataRepository(UsuarioFileLocalDataSource.getInstance()));

    }
}