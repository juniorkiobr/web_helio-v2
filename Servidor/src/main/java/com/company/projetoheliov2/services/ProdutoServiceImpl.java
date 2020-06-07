package com.company.projetoheliov2.services;

import com.company.projetoheliov2.models.Produto;
import com.company.projetoheliov2.repository.api.ProdutoRepository;
import com.company.projetoheliov2.services.api.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl extends BaseServiceImpl<Produto, Integer> implements ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public ProdutoRepository getRepository() {
        return produtoRepository;
    }
}
