package com.Iesam.CarnetJoven.presentation;

import com.Iesam.CarnetJoven.data.EmpresaDataRepository;
import com.Iesam.CarnetJoven.data.Local.EmpresaFileLocalDataSource;
import com.Iesam.CarnetJoven.domain.AddEmpresaUseCase;
import com.Iesam.CarnetJoven.domain.Empresa;
import com.Iesam.CarnetJoven.domain.EmpresaRepository;
import com.Iesam.CarnetJoven.domain.GetEmpresasUseCase;

public class NewEmpresaForm {


    public void createNewEmpresa(){
        Empresa empresa = buildEmpresa();
        saveEmpresa(empresa);
    }
    private Empresa findEmpresa(String empresaId){
        GetEmpresasUseCase getEmpresasUseCase = new GetEmpresasUseCase(new EmpresaDataRepository(EmpresaFileLocalDataSource.getInstance()));
        return getEmpresasUseCase.execute(empresaId);
    }
    private Empresa buildEmpresa() {
        Empresa empresa = new Empresa();

        empresa.setNombreEmpresa("FHN");
        empresa.setCif("2323");
        empresa.setIdEmpresa("32");

        return empresa;
    }
    private void saveEmpresa(Empresa empresa){
        AddEmpresaUseCase addEmpresaUseCase = new AddEmpresaUseCase(new EmpresaDataRepository(EmpresaFileLocalDataSource.getInstance()));
        addEmpresaUseCase.execute(empresa);
    }

}
