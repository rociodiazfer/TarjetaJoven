package com.Iesam.CarnetJoven.domain;

import java.util.List;

public interface PromocionRepository {

    public void save(Promocion promocion);

    public Promocion getById(String promocionId);

    public List<Promocion> getAll();


}
