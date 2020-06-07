package com.company.projetoheliov2.services;

import com.company.projetoheliov2.models.Veiculo;
import com.company.projetoheliov2.repository.api.VeiculoRepository;
import com.company.projetoheliov2.services.api.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**Extender a BaseServiceImpl com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class VeiculoServiceImpl extends BaseServiceImpl<Veiculo, Integer> implements VeiculoService {

    @Autowired
    VeiculoRepository repository;

    @Override
    public VeiculoRepository getRepository() {
        return repository;
    }


}
