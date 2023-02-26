package com.Iesam.CarnetJoven.domain;

public class AddPromocionesUseCase {


    private PromocionRepository promocionRepository;

    public AddPromocionesUseCase(PromocionRepository promocionRepository){
        this.promocionRepository = promocionRepository;
    }
    public void execute(Promocion promocion){
        this.promocionRepository.save(promocion);
    }

}
