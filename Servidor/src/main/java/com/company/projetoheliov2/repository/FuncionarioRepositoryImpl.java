package com.company.projetoheliov2.repository;

import com.company.projetoheliov2.models.Funcionario;
import com.company.projetoheliov2.repository.api.FuncionarioRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = {Throwable.class})
public class FuncionarioRepositoryImpl extends BaseCrudRepository<Funcionario, Integer> implements FuncionarioRepository {

    @Override
    public List<Funcionario> findAll() {
        return getSession().createQuery("select f from FUNCIO f", Funcionario.class).list();
    }
}
