package com.company.projetoheliov2.services.api;

import com.company.projetoheliov2.models.Client;

/**Extender a BaseService com as classes necessárias.
 * Primeiro: a entidade
 * Segundo: O serializavel do ID
 *
 * Esse service são para funcões específicas da entidade,
 * ou seja que não estão presentes com outras*/
public interface ClienteService extends BaseService<Client, Integer> {


}
