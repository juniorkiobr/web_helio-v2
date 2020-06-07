package com.company.projetoheliov2.repository;

import com.company.projetoheliov2.models.OrdemServico;
import com.company.projetoheliov2.repository.api.OrdemServicoRepository;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = {Throwable.class})
/**Extender a BaseCrudRepository com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class OrdemServicoRepositoryImpl extends BaseCrudRepository<OrdemServico, Integer> implements OrdemServicoRepository {

    public OrdemServicoRepositoryImpl() {

    }

    @Override
    public List<OrdemServico> findAll() {

        Query<OrdemServico> query = getSession().createQuery(
                "select c from OrdemServico c ",
                OrdemServico.class);
        return query.list();
    }


}
