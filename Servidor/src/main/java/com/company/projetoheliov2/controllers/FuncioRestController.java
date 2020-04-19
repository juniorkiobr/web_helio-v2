package com.company.projetoheliov2.controllers;

import com.company.projetoheliov2.models.Funcio;
import com.company.projetoheliov2.services.api.FuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/funcionarios"}, produces = MediaType.APPLICATION_JSON_VALUE)
/**Extender o BaseController com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class FuncioRestController extends BaseController<Funcio, Integer> {

    @Autowired
    FuncioService funcioService;

    @Override
    public FuncioService getService() {
        return funcioService;
    }
}
