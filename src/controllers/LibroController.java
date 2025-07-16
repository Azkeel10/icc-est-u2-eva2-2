package controllers;

import java.util.List;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import models.Book;

public class LibroController {
    public Map<Book, Book> procesarLibros(List<Book> libros){
        Comparator<Book> comparador = new Comparator<Book>() {
            @Override

            public int compare(Book b1, Book b2) {
                int comparadorTitulo = b2.getTitulo().compareToIgnoreCase(b1.getTitulo()); // Z-A
                if (comparadorTitulo != 0) return comparadorTitulo;    
                    int comparadorAño = Integer.compare(b1.getAño(), b2.getAño()); // ascendente
                        return comparadorAño;
                }
            };
        
            Map<Book, Book> mapaOrdenado = new TreeMap<>(comparador);
        
            for (Book libro : libros) {
                Book clave = new Book(libro.getTitulo(), "", libro.getAño());
                mapaOrdenado.putIfAbsent(clave, libro);
            }
        
        return mapaOrdenado;
    }
}

