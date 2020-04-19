package com.company.projetoheliov2.controllers;

import com.company.projetoheliov2.services.api.BaseService;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

public class BaseController<T, ID extends Serializable> {

    public BaseService<T, ID> getService() {
        return null;
    }

    @GetMapping(path = {"/find-all"})
    public List<T> findAll() {
        return getService().findAll();
    }

    @PostMapping(path = {"/save"})
    public T save(@RequestBody T object) {
        return getService().save(object);
    }

    @GetMapping(path = {"/find-by-id"})
    public T findId(@RequestParam("id") ID id){
        return getService().findById(id);
    }

    @DeleteMapping(path = {"/delete-by-id"})
    public void deleteById(@RequestParam("id") ID id){
        getService().deleteById(id);
    }

    @DeleteMapping(path = {"/delete"})
    public void delete(@RequestBody T object){
        getService().delete(object);
    }

    @GetMapping(path = {"/count"})
    public long count(){
        return getService().count();
    }
}
