import java.util.List;

import controllers.LibroController;
import java.util.Map;
import models.Book;

public class App {
    public static void main(String[] args) throws Exception {
        List<Book> libros = List.of(
                new Book("Java Básico", "Luis Pérez", 2021), // Duplicado
                new Book("Java Básico", "Luis Pérez", 2019),
                new Book("Java Básico", "Luis Pérezsfsafsa", 2019),
                new Book("Estructuras", "Ana Ruiz", 2018),
                new Book("POO en Java", "Carlos Soto", 2016),
                new Book("POO en Java", "Carlos Soto", 2020), // Duplicado
                new Book("Algoritmos", "Marta Ríos", 2020),
                new Book("Base de Datos", "Luis Pérez", 2017),
                new Book("Análisis de Sistemas", "Pedro León", 2015),
                new Book("Ciencias de la Computación", "Ana Ruiz", 2021),
                new Book("Fundamentos", "Luis Pérez", 2014),
                new Book("Fundamentos", "Luis Pérez", 2022), // Duplicado
                new Book("Python desde cero", "María Díaz", 2023),
                new Book("Python desde cero", "María Díaz", 2024), // Duplicado
                new Book("Inteligencia Artificial", "Jorge Paredes", 2020),
                new Book("Big Data", "Cristina Gómez", 2019),
                new Book("Redes", "Pedro León", 2017),
                new Book("Compiladores", "Raúl Ortega", 2016),
                new Book("Ingeniería Software", "Ana Ruiz", 2015),
                new Book("Cloud Computing", "Carlos Soto", 2021),
                new Book("Microservicios", "María Díaz", 2020),
                new Book("Java Avanzado", "Luis Pérez", 2018),
                new Book("Java Avanzado", "Luis Pérez", 2019), // Duplicado
                new Book("Ciberseguridad", "Pedro León", 2023),
                new Book("Blockchain", "Marta Ríos", 2021),
                new Book("Machine Learning", "Cristina Gómez", 2022));

        LibroController controller = new LibroController();
        Map<Book, Book> resultado = controller.procesarLibros(libros);

        System.out.println("📚 Libros ordenados y sin duplicados:");
        for (Book b : resultado.values()) {
            System.out.println(b);
        }
    }
}
