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
}