package com.Iesam.CarnetJoven.data;

import com.Iesam.CarnetJoven.data.Local.CompraFileLocalDataSource;
import com.Iesam.CarnetJoven.domain.Compra;
import com.Iesam.CarnetJoven.domain.CompraRepository;

import java.util.List;

public class CompraDataRepository implements CompraRepository {


    private CompraFileLocalDataSource localDataSource;

    public CompraDataRepository(CompraFileLocalDataSource localDataSource){
        this.localDataSource = localDataSource;
    }
    @Override
    public void save(Compra newcompra) {
        this.localDataSource.save(newcompra);
    }
    @Override
    public Compra getById(String compraId) {
        return this.localDataSource.findById(compraId);
    }

    @Override
    public List<Compra> getAll() {
        return this.localDataSource.findAll();
    }
}
