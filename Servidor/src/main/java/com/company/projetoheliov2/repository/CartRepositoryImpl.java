package com.company.projetoheliov2.repository;

import com.company.projetoheliov2.models.Cart;
import com.company.projetoheliov2.repository.api.CartRepository;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = {Throwable.class})
/**Extender a BaseCrudRepository com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class CartRepositoryImpl extends BaseCrudRepository<Cart, Integer> implements CartRepository {

    public CartRepositoryImpl() {

    }

    @Override
    public List<Cart> findAll() {

        Query<Cart> query = getSession().createQuery(
                "select c from Cart c ",
                Cart.class);
        return query.list();
    }


}
