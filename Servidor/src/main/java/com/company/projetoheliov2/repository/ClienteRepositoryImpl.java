package com.company.projetoheliov2.repository;

import com.company.projetoheliov2.models.Client;
import com.company.projetoheliov2.repository.api.ClienteRepository;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = {Throwable.class})
/**Extender a BaseCrudRepository com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class ClienteRepositoryImpl extends BaseCrudRepository<Client, Integer> implements ClienteRepository {

    public ClienteRepositoryImpl() {

    }

    @Override
    public List<Client> findAll() {

        Query<Client> query = getSession().createQuery(
                "select c from Client c ",
                Client.class);
        return query.list();
    }


}
