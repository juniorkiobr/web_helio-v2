package com.company.projetoheliov2.services;

import com.company.projetoheliov2.models.Pagamento;
import com.company.projetoheliov2.repository.api.PagamentoRepository;
import com.company.projetoheliov2.services.api.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**Extender a BaseServiceImpl com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class PagamentoServiceImpl extends BaseServiceImpl<Pagamento, Integer> implements PagamentoService {

    @Autowired
    PagamentoRepository repository;

    @Override
    public PagamentoRepository getRepository() {
        return repository;
    }


}
