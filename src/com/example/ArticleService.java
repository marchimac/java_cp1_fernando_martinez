package com.example;

import java.util.List;

public interface ArticleService {

    // Buscar todos los vegetales
    List<Article> findAll();

    // Buscar producto por su id
    Article findById(Long id);

    // crear/guardar un vegetal en base de datos
    Article create(Article article);

    // Actualizar un articulo
    Article update(Article articleToUpdate);

    // borrar
    boolean removeById(Long id);

//    // Buscar productos por tipo de alimento
//    List<Article> findAllType();
//
//    // Buscar productos por rango de precios
//    List<Article> findAllByPriceRange(Double min, Double max);
//
//    // Buscar por productor
//    String findProductor(String name);

}
