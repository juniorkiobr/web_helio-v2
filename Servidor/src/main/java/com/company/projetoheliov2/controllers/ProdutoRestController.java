package com.company.projetoheliov2.controllers;

import com.company.projetoheliov2.models.Produto;
import com.company.projetoheliov2.services.api.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/produtos"}, produces = MediaType.APPLICATION_JSON_VALUE)
/**Extender o BaseController com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class ProdutoRestController extends BaseController<Produto, Integer> {

    @Autowired
    ProdutoService produtoService;

    @Override
    public ProdutoService getService() {
        return produtoService;
    }
}
