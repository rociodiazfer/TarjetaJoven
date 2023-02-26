package com.Iesam.CarnetJoven.data;

import com.Iesam.CarnetJoven.data.Local.PromocionFileLocalDataSource;
import com.Iesam.CarnetJoven.domain.Promocion;
import com.Iesam.CarnetJoven.domain.PromocionRepository;

import java.util.List;

public class PromocionDataRepository implements PromocionRepository {

    private PromocionFileLocalDataSource localDataSource;

    public PromocionDataRepository(PromocionFileLocalDataSource localDataSource){
        this.localDataSource = localDataSource;
    }

    @Override
    public void save(Promocion newpromocion) {
        this.localDataSource.save(newpromocion);
    }

    @Override
    public Promocion getById(String promocionId) {
        return this.localDataSource.findById(promocionId);
    }

    @Override
    public List<Promocion> getAll() {
        return this.localDataSource.findAll();
    }

    @Override
    public List<Promocion> getAllWithRemote() {
        List<Promocion> promocions = localDataSource.findAll();
        if(promocions == null || promocions.isEmpty()){
        }
        return null;
    }

}
