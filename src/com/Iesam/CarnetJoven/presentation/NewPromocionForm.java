package com.Iesam.CarnetJoven.presentation;

import com.Iesam.CarnetJoven.data.Local.PromocionFileLocalDataSource;
import com.Iesam.CarnetJoven.data.PromocionDataRepository;
import com.Iesam.CarnetJoven.domain.AddPromocionesUseCase;
import com.Iesam.CarnetJoven.domain.GetPromocionesUseCase;
import com.Iesam.CarnetJoven.domain.Promocion;
import com.Iesam.CarnetJoven.domain.PromocionRepository;

public class NewPromocionForm {

    public void createNewPromocion(){
        Promocion promocion = buildPromocion();
        save(promocion);
    }


    private Promocion buildPromocion(){
        Promocion promocion = new Promocion();
        promocion.setIdPromociones("1");
        promocion.setDesPromocion("HGD");
        promocion.setTituloPromocion("YUL");
        promocion.setDescuentoPromocion(7.9);

        return promocion;
    }

    private void save(Promocion promocion){
        AddPromocionesUseCase addPromocionesUseCase = new AddPromocionesUseCase(new PromocionDataRepository(PromocionFileLocalDataSource.getInstance()));
        addPromocionesUseCase.execute(promocion);
    }
}
