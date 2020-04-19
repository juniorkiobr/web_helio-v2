package com.company.projetoheliov2.services;

import com.company.projetoheliov2.models.Peca;
import com.company.projetoheliov2.repository.api.PecaRepository;
import com.company.projetoheliov2.services.api.PecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PecaServiceImpl extends BaseServiceImpl<Peca, Integer> implements PecaService {

    @Autowired
    PecaRepository pecaRepository;

    @Override
    public PecaRepository getRepository() {
        return pecaRepository;
    }
}
