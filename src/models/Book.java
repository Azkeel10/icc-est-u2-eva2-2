package models;

public class Book {
    private String titulo;
    private String autor;
    private int año;
    public Book(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAño() {
        return año;
    }
    @Override
    public int hashCode() {
        return titulo.toLowerCase().hashCode() * 31 + año;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Book other = (Book) obj;
            return año == other.año && titulo.equalsIgnoreCase(other.titulo);
    }
    @Override
    public String toString() {
        return "Titulo=" + titulo + ", autor=" + autor + ", año (" + año + ")";
    }

    
}
