package com.example;

import java.util.List;

public interface VegetablesService {

    // Buscar productos por tipo de alimento
    List<Vegetables> findAllType();

    // Buscar productos por rango de precios
    List<Vegetables> findAllByPriceRange(Double min, Double max);

    // Buscar por productor
    String findProductor(String name);

    // Buscar todos los vegetales
    List<Vegetables> findAll();

    // crear/guardar un vegetal en base de datos
    Vegetables create(Vegetables vegetables);

    // borrar
    boolean removeById(Long id);
}
