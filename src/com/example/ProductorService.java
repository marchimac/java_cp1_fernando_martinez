package com.example;

import java.util.List;

public interface ProductorService {

    // Crear un productor
    Productor create(Productor productor);

    // Buscar todos los productores
    List<Productor> findAll();
}
