package com.company.projetoheliov2.repository;

import com.company.projetoheliov2.models.Pagamento;
import com.company.projetoheliov2.repository.api.PagamentoRepository;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = {Throwable.class})
/**Extender a BaseCrudRepository com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class PagamentoRepositoryImpl extends BaseCrudRepository<Pagamento, Integer> implements PagamentoRepository {

    public PagamentoRepositoryImpl() {

    }

    @Override
    public List<Pagamento> findAll() {

        Query<Pagamento> query = getSession().createQuery(
                "select c from Pagamento c ",
                Pagamento.class);
        return query.list();
    }


}
