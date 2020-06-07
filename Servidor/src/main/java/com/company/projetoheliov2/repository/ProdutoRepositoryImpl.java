package com.company.projetoheliov2.repository;

import com.company.projetoheliov2.models.Produto;
import com.company.projetoheliov2.repository.api.ProdutoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = {Throwable.class})
public class ProdutoRepositoryImpl extends BaseCrudRepository<Produto, Integer> implements ProdutoRepository {

    @Override
    public List<Produto> findAll() {
        return getSession().createQuery("select P from  Produto P", Produto.class).list();
    }
}
