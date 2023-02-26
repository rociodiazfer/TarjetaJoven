package com.Iesam.CarnetJoven.presentation;

import com.Iesam.CarnetJoven.data.Local.PromocionFileLocalDataSource;
import com.Iesam.CarnetJoven.data.PromocionDataRepository;
import com.Iesam.CarnetJoven.domain.GetPromocionesUseCase;
import com.Iesam.CarnetJoven.domain.Promocion;
import com.Iesam.CarnetJoven.domain.Usuario;

import java.util.List;

public class PrintPromocionesView {

    public void print() {
        GetPromocionesUseCase useCase = new GetPromocionesUseCase(new PromocionDataRepository(PromocionFileLocalDataSource.getInstance()));
}}
