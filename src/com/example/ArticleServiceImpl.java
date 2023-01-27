package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArticleServiceImpl implements ArticleService {
    private final List<Article> database = new ArrayList<>();

    @Override
    public List<Article> findAll() {
        return new ArrayList<>(database);
    }

    @Override
    public Article findById(Long id) {

        for (Article article : database) {
            if (Objects.equals(article.getId(), id)) {
                return article;
            }
        }
        return null;
    }

    @Override
    public Article create(Article article) {

        if (article.getId() != null)
            return null;

        Long id = this.generateId();
        article.setId(id);

        database.add(article);

        return article;
    }

    private Long generateId() {
        long id = 0L;
        for (Article article : database)
            id = Math.max(id, article.getId());

        return id + 1;
    }

    @Override
    public Article update(Article articleToUpdate) {

        if (articleToUpdate.getId() == null)
            return null;

        for (Article article : database) {
            if (Objects.equals(article.getId(), articleToUpdate.getId())) {

                article.setCantidad(articleToUpdate.getCantidad());
                article.setPrecioPorKg(articleToUpdate.getPrecioPorKg());
                article.setCantMin(articleToUpdate.getCantMin());

                return article;
            }
        }

        return null;
    }

    @Override
    public boolean removeById(Long id) {

        for (Article article : database) {
            if (Objects.equals(article.getId(), id)) {
                database.remove(article);
                return true;
            }
        }
        return false;
    }
}
