package com.company.projetoheliov2.services;

import com.company.projetoheliov2.models.ServicoCarrinho;
import com.company.projetoheliov2.repository.api.ServicoCartRepository;
import com.company.projetoheliov2.services.api.ServicoCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**Extender a BaseServiceImpl com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class ServicoCartServiceImpl extends BaseServiceImpl<ServicoCarrinho, Integer> implements ServicoCartService {

    @Autowired
    ServicoCartRepository repository;

    @Override
    public ServicoCartRepository getRepository() {
        return repository;
    }


}
