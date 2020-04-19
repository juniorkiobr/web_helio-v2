package com.company.projetoheliov2.repository;

import com.company.projetoheliov2.models.Funcio;
import com.company.projetoheliov2.repository.api.FuncioRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = {Throwable.class})
public class FuncioRepositoryImpl extends BaseCrudRepository<Funcio, Integer> implements FuncioRepository {

    @Override
    public List<Funcio> findAll() {
        return getSession().createQuery("select f from FUNCIO f", Funcio.class).list();
    }
}
