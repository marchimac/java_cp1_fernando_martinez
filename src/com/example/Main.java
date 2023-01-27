package com.example;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Instanciar la interfaz
        ArticleService articleService = new ArticleServiceImpl();

        int option;
        Scanner entrada = new Scanner(System.in);

        do {


            // Imprimir menú de opciones por consola
            System.out.println("""
                    Bienvenido a mi App
                    1. Buscar todos los artículos
                    2. Buscar un articulo por su ID
                    3. Añadir un nuevo artículo
                    4. Actualizar un artículo
                    5. Borrar un artículo
                    6. Salir de la App
                    """);

            // Leer qué opción quiere el usuario

            option = entrada.nextInt();

            System.out.println("Has elegido la opción " + option);

            // Pedir datos y ejecutar método de interfaz
            if (option == 1) {
                List<Article> articles = articleService.findAll();
                System.out.println("Hay un total de " + articles.size() + " artículos.");
                for (Article article : articles)
                    System.out.println(article);
            } else if (option == 2) {
                System.out.println("Introduce el id del artículo a buscar: ");
                long articleId = entrada.nextLong();
                Article article = articleService.findById(articleId);

                if (article == null)
                    System.out.println("404 Not Found");
                else
                    System.out.println(article);
            } else if (option == 3) {
                System.out.println("Introduce el tipo de producto que desea añadir: ");
                String article = entrada.next();

                System.out.println("Introduce la variedad del producto: ");
                String variety = entrada.next();


                // TODO lo de introducir coma o punto para el decimal debe de ir en función del idioma del sistema utilizado
                // TODO porque a mi me funciona con el punto pero no con la coma
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

                Article nuevoArticulo = articleService.create(articulo);

                // TODO Al depurar veo que no me guarda los articulos en la data base, todos son null
                System.out.println("Se ha guardado el artículo de manera correcta con el id: " + nuevoArticulo.getId());
            }

        } while (option != 6);

        entrada.close();
        System.out.println("End of APP");
    }
}