package com.company.projetoheliov2.services.api;

import com.company.projetoheliov2.models.Servico;

/**Extender a BaseService com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID
 *
 * Esse service são para funcões específicas da entidade,
 * ou seja que não estão presentes com outras*/
public interface ServicoService extends BaseService<Servico, Integer> {


}
