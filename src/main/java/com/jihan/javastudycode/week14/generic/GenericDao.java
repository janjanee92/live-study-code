package com.jihan.javastudycode.week14.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericDao<E extends Entity<K>, K> {

    private Map<K, E> datasource = new HashMap<>();

    public void save(E entity) {
        datasource.put(entity.getId(), entity);
    }

    public void delete(E entity) {
        datasource.remove(entity.getId());
    }

    public void delete(K key) {
        datasource.remove(key);
    }

    public List<E> findAll() {
        return new ArrayList<>(datasource.values());
    }

    public E findById(K key) {
        return datasource.get(key);
    }
    
}
