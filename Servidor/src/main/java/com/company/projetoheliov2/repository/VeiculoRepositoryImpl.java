package com.company.projetoheliov2.repository;

import com.company.projetoheliov2.models.Veiculo;
import com.company.projetoheliov2.repository.api.VeiculoRepository;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = {Throwable.class})
/**Extender a BaseCrudRepository com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID*/
public class VeiculoRepositoryImpl extends BaseCrudRepository<Veiculo, Integer> implements VeiculoRepository {

    public VeiculoRepositoryImpl() {

    }

    @Override
    public List<Veiculo> findAll() {

        Query<Veiculo> query = getSession().createQuery(
                "select c from Veiculo c ",
                Veiculo.class);
        return query.list();
    }


}
