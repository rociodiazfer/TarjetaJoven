package com.Iesam.CarnetJoven.domain;

import java.time.Period;
import java.util.List;

public class GetPromocionesRemoteUseCase {

    private PromocionRepository promocionRepository;
    public GetPromocionesRemoteUseCase(PromocionRepository promocionRepository){
        this.promocionRepository = promocionRepository;
    }

    public List<Promocion> execute(){
        return this.promocionRepository.getAllWithRemote();
    }
}
