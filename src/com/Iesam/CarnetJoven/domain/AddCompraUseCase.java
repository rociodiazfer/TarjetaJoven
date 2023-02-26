package com.Iesam.CarnetJoven.domain;

public class AddCompraUseCase {

    private CompraRepository repository;

    public AddCompraUseCase(CompraRepository repository){
        this.repository = repository;
    }
    public void execute(Compra compra){
        this.repository.save(compra);
    }
}
