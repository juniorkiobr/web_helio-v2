package com.company.projetoheliov2.services;

import com.company.projetoheliov2.models.Servico;
import com.company.projetoheliov2.repository.api.ServicoRepository;
import com.company.projetoheliov2.services.api.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**Extender a BaseServiceImpl com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class ServicoServiceImpl extends BaseServiceImpl<Servico, Integer> implements ServicoService {

    @Autowired
    ServicoRepository repository;

    @Override
    public ServicoRepository getRepository() {
        return repository;
    }
}
