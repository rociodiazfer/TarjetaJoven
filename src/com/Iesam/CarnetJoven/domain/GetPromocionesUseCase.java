package com.Iesam.CarnetJoven.domain;

import java.util.List;

public class GetPromocionesUseCase {

    private PromocionRepository promocionRepository;

    public GetPromocionesUseCase(PromocionRepository promocionRepository){
        this.promocionRepository= promocionRepository;
    }

    public Promocion execute(String promocionId){
        return this.promocionRepository.getById(promocionId);
    }

}
