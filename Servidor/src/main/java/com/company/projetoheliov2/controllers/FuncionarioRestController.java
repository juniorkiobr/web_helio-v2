package com.company.projetoheliov2.controllers;

import com.company.projetoheliov2.models.Funcionario;
import com.company.projetoheliov2.services.api.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/funcionarios"}, produces = MediaType.APPLICATION_JSON_VALUE)
/**Extender o BaseController com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class FuncionarioRestController extends BaseController<Funcionario, Integer> {

    @Autowired
    FuncionarioService funcionarioService;

    @Override
    public FuncionarioService getService() {
        return funcionarioService;
    }
}
