package com.example;

import java.util.List;

public interface ProductorService {

    // Crear un productor
    Productor create(Productor productor);

    // Buscar todos los productores
    List<Productor> findAll();

    // Buscar productor por su id
    Productor findById(Long id);

    // Actualizar un productor
    Productor update(Productor productorToUpdate);

    // Borrar
    boolean removeById(Long id);
}
