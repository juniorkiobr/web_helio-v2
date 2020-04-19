package com.company.projetoheliov2.services;
import com.company.projetoheliov2.models.Funcio;
import com.company.projetoheliov2.repository.api.FuncioRepository;
import com.company.projetoheliov2.services.api.FuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncioServiceImpl extends BaseServiceImpl<Funcio, Integer> implements FuncioService {

    @Autowired
    FuncioRepository funcioRepository;

    @Override
    public FuncioRepository getRepository() {
        return funcioRepository;
    }
}
