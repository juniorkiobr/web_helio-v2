package com.company.projetoheliov2.repository;

import com.company.projetoheliov2.models.ServicoCarrinho;
import com.company.projetoheliov2.repository.api.ServicoCartRepository;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = {Throwable.class})
/**Extender a BaseCrudRepository com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class ServicoCartRepositoryImpl extends BaseCrudRepository<ServicoCarrinho, Integer> implements ServicoCartRepository {

    public ServicoCartRepositoryImpl() {

    }

    @Override
    public List<ServicoCarrinho> findAll() {

        Query<ServicoCarrinho> query = getSession().createQuery(
                "select c from ServicoCarrinho c ",
                ServicoCarrinho.class);
        return query.list();
    }


}
