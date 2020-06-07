package com.company.projetoheliov2.services;
import com.company.projetoheliov2.models.Funcionario;
import com.company.projetoheliov2.repository.api.FuncionarioRepository;
import com.company.projetoheliov2.services.api.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServiceImpl extends BaseServiceImpl<Funcionario, Integer> implements FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Override
    public FuncionarioRepository getRepository() {
        return funcionarioRepository;
    }
}
