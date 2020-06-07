package com.company.projetoheliov2.services;

import com.company.projetoheliov2.models.Cliente;
import com.company.projetoheliov2.repository.api.ClienteRepository;
import com.company.projetoheliov2.services.api.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**Extender a BaseServiceImpl com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Integer> implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public ClienteRepository getRepository() {
        return clienteRepository;
    }
}
