package com.example;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Se instancia la interfaz
        ArticleService articleService = new ArticleServiceImpl();
        ProductorService productorService = new ProductorServiceImpl();

        int option;
        Scanner entrada = new Scanner(System.in);

        do {

            // Imprimir menú de opciones por consola
            System.out.println("""
                    Bienvenido a mi App
                                        
                    1. Añadir un nuevo productor
                    2. Añadir un nuevo artículo
                    3. Buscar todos los artículos
                    4. Buscar un articulo por su ID
                    5. Actualizar un artículo
                    6. Borrar un artículo
                    7. Salir de la App
                    """);

            // Leer qué opción quiere el usuario

            option = entrada.nextInt();

            System.out.println("Has elegido la opción " + option);

            // Pedir datos y ejecutar método de interfaz
            if (option == 1) {
                System.out.println("Introduce el nombre del productor que deseas registrar: ");
                String name = entrada.next();

                System.out.println("Introduce el nif del productor: ");
                String nif = entrada.next();

                System.out.println("Introduce la dirección del productor: ");
                String address = entrada.next();
                entrada.nextLine();

                System.out.println("Introduce el email del productor: ");
                String email = entrada.next();

                System.out.println("Introduce el telefono del productor: ");
                String phone = entrada.next();

                Productor productor = new Productor(null, name, nif, address, email, phone);

                Productor newProductor = productorService.create(productor);

                System.out.println();

            } else if (option == 2) {
                System.out.println("Introduce el tipo de producto que desea añadir: ");
                String article = entrada.next();

                System.out.println("Introduce la variedad del producto: ");
                String variety = entrada.next();

                System.out.println("Introduce la cantidad que desea añadir: ");
                Double amount = entrada.nextDouble();

                System.out.println("Introduce el precio por kilo para la venta: ");
                Double pricePerKg = entrada.nextDouble();

                System.out.println("Introduce el nombre del productor: ");
                String prod = entrada.next();

                System.out.println("Introduce la cantidad minima de venta: ");
                Double minSale = entrada.nextDouble();

                System.out.println("Introduce la fecha de entrada, ejemplo (YYYY-MM-dd) ");
                LocalDate entry = LocalDate.parse(entrada.next());

                LocalDate entryDate = LocalDate.now();

                Article articulo = new Article(null, article, variety, amount, pricePerKg, prod, minSale, entry);

                Article newArticle = articleService.create(articulo);

                System.out.println("Se ha guardado el artículo de manera correcta con el id: " + newArticle.getId());

            } else if (option == 3) {
                List<Article> articles = articleService.findAll();
                System.out.println("Hay un total de " + articles.size() + " artículos.");
                for (Article article : articles)
                    System.out.println(article);

            } else if (option == 4) {
                System.out.println("Introduce el id del artículo a buscar: ");
                long articleId = entrada.nextLong();
                Article article = articleService.findById(articleId);

                if (article == null)
                    System.out.println("404 Not Found");
                else
                    System.out.println(article);

            } else if (option == 5) {
                System.out.println("Introduce el ID del artículo a actualizar: ");
                Long articleId = entrada.nextLong();

                Article article = articleService.findById(articleId);
                System.out.println("Este es el artículo que va a actualizar: " + articleId);
                System.out.println(article);

                System.out.println("Introduce la nueva cantidad del artículo");
                Double amount = entrada.nextDouble();

                System.out.println("Introduce el nuevo precio por kilo del artículo");
                Double newPrice = entrada.nextDouble();

                System.out.println("Introduce la nueva cantidad mínima de venta");
                Double minimum = entrada.nextDouble();

                article.setCantidad(amount);
                article.setPrecioPorKg(newPrice);
                article.setCantMin(minimum);

                Article updateArticle = articleService.update(article);

                if (updateArticle == null)
                    System.out.println("El artículo no se ha actualizado");
                else
                    System.out.println("Artículo actualizado: " + updateArticle);

            } else if (option == 6) {
                System.out.println("Introduce el ID del artículo que desea borrar:");
                Long articleId = entrada.nextLong();

                boolean isRemoved = articleService.removeById(articleId);

                if (isRemoved)
                    System.out.println("Borrado correctamente");
                else
                    System.out.println("No se ha podido borrar el artículo");

            } else if (option == 7) {
                break;
            }
        } while (option != 7);

        entrada.close();
        System.out.println("End of APP");
    }
}