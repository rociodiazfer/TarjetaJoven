package com.Iesam.CarnetJoven.presentation;

import com.Iesam.CarnetJoven.data.CompraDataRepository;
import com.Iesam.CarnetJoven.data.Local.CompraFileLocalDataSource;
import com.Iesam.CarnetJoven.domain.Compra;
import com.Iesam.CarnetJoven.domain.GetComprasUseCase;


import java.util.List;

public class PrintComprasView {
    GetComprasUseCase getComprasUseCase = new GetComprasUseCase(new CompraDataRepository(CompraFileLocalDataSource.getInstance()));

}
