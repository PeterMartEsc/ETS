package es.iespuerto.ets.modelo;

import java.util.Objects;

public class Libro {

    private String isbn;

    private String titulo;

    private String autor;

    private String fPublicacion;

    public Libro(String isbn) {
        this.isbn = isbn;
    }

    public Libro(String isbn, String titulo, String autor, String fPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fPublicacion = fPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getfPublicacion() {
        return fPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setfPublicacion(String fPublicacion) {
        this.fPublicacion = fPublicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fPublicacion='" + fPublicacion + '\'' +
                '}';
    }
}
