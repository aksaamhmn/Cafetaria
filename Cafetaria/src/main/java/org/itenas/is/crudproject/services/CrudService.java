/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itenas.is.crudproject.services;

import java.util.List;

/**
 *
 * @author Kurnia R. Putra
 * @param <T>
 */
public interface CrudService<T> {
    void create(T object);
    T findOne(int idMenu);
    List<T> findAll();
    void update(int idMenu, T object);
    boolean delete(int idMenu);
}
