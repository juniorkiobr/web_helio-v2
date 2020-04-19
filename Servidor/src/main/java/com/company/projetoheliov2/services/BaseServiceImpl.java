package com.company.projetoheliov2.services;

import com.company.projetoheliov2.repository.api.BaseRepository;
import com.company.projetoheliov2.services.api.BaseService;
import org.hibernate.service.spi.ServiceException;

import java.io.Serializable;
import java.util.List;

public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {


    @Override
    public BaseRepository<T, ID> getRepository() {
        return null;
    }

    @Override
    public List<T> findAll() throws ServiceException {
        return getRepository().findAll();
    }

    @Override
    public T save(T cliente) throws ServiceException{
        return getRepository().save(cliente);
    }

    @Override
    public T findById(ID id) throws ServiceException{
        return getRepository().findById(id);
    }

    @Override
    public long count() throws ServiceException{
        return getRepository().count();
    }

    @Override
    public void deleteById(ID id) throws ServiceException{
        getRepository().deleteById(id);
    }

    @Override
    public void delete(T cliente)  throws ServiceException{
        getRepository().delete(cliente);
    }
}
