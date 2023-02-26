package com.Iesam.CarnetJoven.domain;

public class AddEmpresaUseCase {

    private EmpresaRepository empresaRepository;

    public AddEmpresaUseCase(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    public void execute(Empresa empresa){
        this.empresaRepository.save(empresa);
    }
}
