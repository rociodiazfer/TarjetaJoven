package com.Iesam.CarnetJoven.data;

import com.Iesam.CarnetJoven.data.Local.EmpresaFileLocalDataSource;
import com.Iesam.CarnetJoven.domain.Empresa;
import com.Iesam.CarnetJoven.domain.EmpresaRepository;
import com.Iesam.CarnetJoven.domain.Usuario;

import java.util.List;

public class EmpresaDataRepository implements EmpresaRepository{

    private EmpresaFileLocalDataSource localDataSource;

    public EmpresaDataRepository(EmpresaFileLocalDataSource localDataSource){
        this.localDataSource = localDataSource;
    }

    @Override
    public void save(Empresa newempresa) {
        this.localDataSource.save(newempresa);
    }

    @Override
    public Empresa getById(String empresaId) {
        return this.localDataSource.findById(empresaId);
    }

    @Override
    public List<Empresa> getAll() {
        return this.localDataSource.findAll();
    }

    @Override
    public List<Usuario> getAllWithRemote() {
        return null;
    }
}
