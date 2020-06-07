package com.company.projetoheliov2.services;

import com.company.projetoheliov2.models.Cart;
import com.company.projetoheliov2.repository.api.CartRepository;
import com.company.projetoheliov2.services.api.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**Extender a BaseServiceImpl com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class CartServiceImpl extends BaseServiceImpl<Cart, Integer> implements CartService {

    @Autowired
    CartRepository repository;

    @Override
    public CartRepository getRepository() {
        return repository;
    }
}
