package br.unisantos.prova.fehidro.rest;

import java.util.List;

public interface RESTClientInterface<T> {
    public static final String REST_WEBSERVICE_URL = 
    	       "http://localhost:8080/prova-fehidro-server/api/";
    public static final String REST_CRITERIO_URL = "criterios/";

    public List<T> findAll();
    public T find(Long id);
    public T create(T obj);
    public T edit(T obj);
    public boolean delete(Long id);        
}
