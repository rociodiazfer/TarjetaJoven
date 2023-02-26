package com.Iesam.CarnetJoven.presentation;

import com.Iesam.CarnetJoven.data.CompraDataRepository;
import com.Iesam.CarnetJoven.data.Local.CompraFileLocalDataSource;
import com.Iesam.CarnetJoven.data.Local.PromocionFileLocalDataSource;
import com.Iesam.CarnetJoven.data.Local.UsuarioFileLocalDataSource;
import com.Iesam.CarnetJoven.data.PromocionDataRepository;
import com.Iesam.CarnetJoven.data.UsuarioDataRepository;
import com.Iesam.CarnetJoven.domain.*;

import java.util.Date;

public class NewCompraForm {

    public void createNewCompra() {
        Compra compra = new Compra();
        compra.setIdCompra("1");
        compra.setDateCompra(new Date(2022, 02, 10));
        compra.setUsuario(findUsuario("1"));
        compra.setPromocion(findPromocion("5"));

        saveCompra(compra);
    }

    private Usuario findUsuario(String usuarioId) {
        GetUsuarioUseCase getUsuarioUseCase = new GetUsuarioUseCase(new UsuarioDataRepository(UsuarioFileLocalDataSource.getInstance()));
        return getUsuarioUseCase.execute(usuarioId);
    }

    private Promocion findPromocion(String promocionId) {
        GetPromocionesUseCase getPromocionesUseCase = new GetPromocionesUseCase(new PromocionDataRepository(PromocionFileLocalDataSource.getInstance()));
        return getPromocionesUseCase.execute(promocionId);
    }

    private void saveCompra(Compra compra) {
        AddCompraUseCase addCompraUseCase = new AddCompraUseCase(new CompraDataRepository(CompraFileLocalDataSource.getInstance()));
        addCompraUseCase.execute(compra);

    }
}
