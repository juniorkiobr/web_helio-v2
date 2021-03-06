package com.company.projetoheliov2.repository.api;

import com.company.projetoheliov2.models.OrdemServico;

import java.util.List;

/**Extender a BaseRepository com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID
 *
 * Esse service são para funcões específicas da entidade,
 * ou seja que não estão presentes com outras*/
public interface OrdemServicoRepository extends BaseRepository<OrdemServico, Integer> {

    List<OrdemServico> findAll();

}
