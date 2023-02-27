package com.Iesam.CarnetJoven.presentation;

import com.Iesam.CarnetJoven.data.CompraDataRepository;
import com.Iesam.CarnetJoven.data.Local.CompraFileLocalDataSource;
import com.Iesam.CarnetJoven.domain.Compra;
import com.Iesam.CarnetJoven.domain.GetComprasUseCase;


import java.util.List;

public class PrintComprasView {

    public void print(){

    GetComprasUseCase getComprasUseCase = new GetComprasUseCase(new CompraDataRepository(CompraFileLocalDataSource.getInstance()));
    List<Compra>compras = getComprasUseCase.execute();
    for(Compra compra :compras){
        System.out.println(compra.toString());
    }
}}
