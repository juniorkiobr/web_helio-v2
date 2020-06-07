package com.company.projetoheliov2.repository;

import com.company.projetoheliov2.models.Servico;
import com.company.projetoheliov2.repository.api.ServicoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = {Throwable.class})
public class ServicoRepositoryImpl extends BaseCrudRepository<Servico, Integer> implements ServicoRepository {

    @Override
    public List<Servico> findAll() {
        return getSession().createQuery("select P from  Servico P", Servico.class).list();
    }
}
