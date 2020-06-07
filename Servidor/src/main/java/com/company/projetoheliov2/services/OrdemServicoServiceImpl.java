package com.company.projetoheliov2.services;

import com.company.projetoheliov2.models.OrdemServico;
import com.company.projetoheliov2.repository.api.OrdemServicoRepository;
import com.company.projetoheliov2.services.api.OrdemServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**Extender a BaseServiceImpl com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class OrdemServicoServiceImpl extends BaseServiceImpl<OrdemServico, Integer> implements OrdemServicoService {

    @Autowired
    OrdemServicoRepository repository;

    @Override
    public OrdemServicoRepository getRepository() {
        return repository;
    }


}
