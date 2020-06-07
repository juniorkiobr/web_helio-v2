/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.projetoheliov2.controllers;

import com.company.projetoheliov2.models.ServicoCarrinho;
import com.company.projetoheliov2.services.api.ServicoCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/carrinho-servico"},
        produces = MediaType.APPLICATION_JSON_VALUE)
/**Extender o BaseController com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class ServicoCartRestController extends BaseController<ServicoCarrinho, Integer>  {

    @Autowired
    ServicoCartService service;

    @Override
    public ServicoCartService getService() {
        return service;
    }
}
