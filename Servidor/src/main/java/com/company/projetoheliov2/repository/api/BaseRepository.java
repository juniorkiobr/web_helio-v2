package com.company.projetoheliov2.repository.api;

import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public interface BaseRepository<T, ID extends Serializable>{

    Session getSession();

    List<T> findAllById(List<ID> iterable);

    long count();

    void deleteById(ID id);

    void delete(T t);

    void deleteAll(List<? extends T> iterable);

    <S extends T> S save(S s);

    <S extends T> List<S> saveAll(List<S> iterable);

    T findById(ID id);

    boolean existsById(ID id);

    List<T> findAll();

}
