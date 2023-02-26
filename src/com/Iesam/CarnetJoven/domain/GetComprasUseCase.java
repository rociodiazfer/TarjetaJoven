package com.Iesam.CarnetJoven.domain;

import java.util.List;

public class GetComprasUseCase {

    private CompraRepository repository;

    public GetComprasUseCase(CompraRepository repository){
        this.repository = repository;
    }

    public List<Compra>execute(){
        return this.repository.getAll();
    }
}
