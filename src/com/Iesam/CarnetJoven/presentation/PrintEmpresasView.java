package com.Iesam.CarnetJoven.presentation;

import com.Iesam.CarnetJoven.data.EmpresaDataRepository;
import com.Iesam.CarnetJoven.data.Local.EmpresaFileLocalDataSource;
import com.Iesam.CarnetJoven.data.Local.PromocionFileLocalDataSource;
import com.Iesam.CarnetJoven.data.PromocionDataRepository;
import com.Iesam.CarnetJoven.domain.Empresa;
import com.Iesam.CarnetJoven.domain.GetEmpresasUseCase;
import com.Iesam.CarnetJoven.domain.GetPromocionesUseCase;


import java.util.List;

public class PrintEmpresasView {
    public void print() {
            GetEmpresasUseCase useCase = new GetEmpresasUseCase(new EmpresaDataRepository(EmpresaFileLocalDataSource.getInstance()));
        List<Empresa> empresas = useCase.execute();
        for(Empresa empresa: empresas){
            System.out.println(empresa.toString());
        }

    }
}
