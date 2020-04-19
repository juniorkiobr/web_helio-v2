package com.company.projetoheliov2.services.api;

import com.company.projetoheliov2.repository.api.BaseRepository;
import org.hibernate.service.spi.ServiceException;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T, ID extends Serializable> {

    BaseRepository<T, ID> getRepository();

    List<T> findAll() throws ServiceException;

    T save(T cliente) throws ServiceException;

    T findById(ID id) throws ServiceException;

    long count() throws ServiceException;

    void deleteById(ID id) throws ServiceException;

    void delete(T cliente) throws ServiceException;

}
