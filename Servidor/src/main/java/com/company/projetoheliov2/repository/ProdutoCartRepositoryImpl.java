package com.company.projetoheliov2.repository;

import com.company.projetoheliov2.models.ProdutoCarrinho;
import com.company.projetoheliov2.repository.api.ProdutoCartRepository;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = {Throwable.class})
/**Extender a BaseCrudRepository com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class ProdutoCartRepositoryImpl extends BaseCrudRepository<ProdutoCarrinho, Integer> implements ProdutoCartRepository {

    public ProdutoCartRepositoryImpl() {

    }

    @Override
    public List<ProdutoCarrinho> findAll() {

        Query<ProdutoCarrinho> query = getSession().createQuery(
                "select c from ProdutoCarrinho c ",
                ProdutoCarrinho.class);
        return query.list();
    }


}
