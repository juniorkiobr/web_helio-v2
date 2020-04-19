package com.company.projetoheliov2.controllers;

import com.company.projetoheliov2.models.Peca;
import com.company.projetoheliov2.services.api.PecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/produtos"}, produces = MediaType.APPLICATION_JSON_VALUE)
/**Extender o BaseController com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class PecaRestController extends BaseController<Peca, Integer> {

    @Autowired
    PecaService pecaService;

    @Override
    public PecaService getService() {
        return pecaService;
    }
}
