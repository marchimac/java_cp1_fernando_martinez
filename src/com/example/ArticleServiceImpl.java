package com.example;

import java.util.ArrayList;
import java.util.List;

public class ArticleServiceImpl implements ArticleService {
    private List<Article> database = new ArrayList<>();
    private Long id = 0L;

    public ArticleServiceImpl() {

        Productor productor1 = new Productor("Pepe", "12341234A", "La cruz", "abc@def.com", "5556781239");
        Productor productor2 = new Productor("Paco", "81528513S", "los alejos", "hdu@def.com", "4446781239");
        Productor productor3 = new Productor("Jose", "98765456G", "Mayor", "poi@def.com", "3336781239");
        Productor productor4 = new Productor("Francisco", "82417286B", "Ruiz Aguilera", "aws@def.com", "2226781239");
        Productor productor5 = new Productor("Diego", "99547286K", "Ruiz Aguilera", "aws@def.com", "2226781239");

        Article article1 = new Article(null, "Tomate", "Cherry", 100.0, 2.0, productor1, 10.0);
        Article article2 = new Article(null, "Tomate", "Kumato", 50.0, 4.0, productor2, 5.0);
        Article article3 = new Article(null, "Pimiento verde", "Padrón", 80.0, 2.0, productor3, 8.0);
        Article article4 = new Article(null, "Pimiento verde", "Italiano", 150.0, 2.0, productor4, 12.0);
        Article article5 = new Article(null, "Calabacín", "Blanco", 45.0, 2.5, productor5, 3.0);
    }


    @Override
    public List<Article> findAll() {
        return new ArrayList<>(database);
    }

    @Override
    public Article findById(Long id) {

        for (Article article : database) {
            if (article.getId() == id) {
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
        Long id = 0L;
        for (Article article : database)
            id = Math.max(id, article.getId());

        return id + 1;
    }

    @Override
    public Article update(Article articleToUpdate) {

        if (articleToUpdate.getId() == null)
            return null;

        for (Article article : database) {
            if (article.getId() == articleToUpdate.getId()) {

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
            if (article.getId() == id) {
                database.remove(article);
                return true;
            }
        }
        return false;
    }
}
