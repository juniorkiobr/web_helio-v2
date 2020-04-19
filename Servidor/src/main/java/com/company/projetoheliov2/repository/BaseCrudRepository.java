package com.company.projetoheliov2.repository;

import com.company.projetoheliov2.repository.api.BaseRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

@NoRepositoryBean
@Transactional(rollbackFor = {Throwable.class})
public class BaseCrudRepository<T, ID extends Serializable> implements BaseRepository<T, ID> {

    @Autowired
    SessionFactory sessionFactory;

    final ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
    Class<T> aClass = (Class<T>) (type).getActualTypeArguments()[0];

    public Session getSession() {

        return sessionFactory.getCurrentSession();
    }


    public List<T> findAllById(List<ID> iterable) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void deleteById(ID id) {
        getSession().delete(findById(id));
    }

    public void delete(T t) {
        getSession().delete(t);
    }

    public void deleteAll(List<? extends T> iterable) {
        throw new IllegalStateException("Método deleteAll não Implementado!!!");
    }

    public void deleteAll() {
        throw new IllegalStateException("Método deleteAll não Implementado!!!");
    }

    public <S extends T> S save(S s) {
        getSession().saveOrUpdate(s);
        return null;
    }

    public <S extends T> List<S> saveAll(List<S> iterable) {
        iterable.forEach(s -> {
            getSession().save(s);
        });
        return null;
    }

    public T findById(ID id) {

        return getSession().find(aClass, id);
    }

    public boolean existsById(ID id) {

        return findById(id) != null;
    }

    public List<T> findAll() {
        throw new IllegalStateException("Método findAll não Implementado!!!");
    }

}
