package com.security.securityauth.abstractentities;

public interface IPersistence<T> {

    T create(T entity);
    T update(T entity);
    void delete(Long id);
}
