package com.company.projetoheliov2.repository;

import com.company.projetoheliov2.models.Peca;
import com.company.projetoheliov2.repository.api.PecaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = {Throwable.class})
public class PecaRepositoryImpl extends BaseCrudRepository<Peca, Integer> implements PecaRepository {

    @Override
    public List<Peca> findAll() {
        return getSession().createQuery("select P from  Peca P", Peca.class).list();
    }
}
