package com.Iesam.CarnetJoven.domain;

import java.util.List;

public class GetEmpresasUseCase {

    private EmpresaRepository empresaRepository;

    public GetEmpresasUseCase(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }
    public Empresa execute(String empresaId){
        return this.empresaRepository.getById(empresaId);
    }

    public List<Empresa> execute(){
        return this.empresaRepository.getAll();
    }

}
