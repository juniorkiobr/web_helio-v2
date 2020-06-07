package com.company.projetoheliov2.services;

import com.company.projetoheliov2.models.ProdutoCarrinho;
import com.company.projetoheliov2.repository.api.ProdutoCartRepository;
import com.company.projetoheliov2.services.api.ProdutoCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**Extender a BaseServiceImpl com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class ProdutoCartServiceImpl extends BaseServiceImpl<ProdutoCarrinho, Integer> implements ProdutoCartService {

    @Autowired
    ProdutoCartRepository repository;

    @Override
    public ProdutoCartRepository getRepository() {
        return repository;
    }


}
