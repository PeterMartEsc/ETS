package es.iespuerto.ets.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biblioteca {

    private int id;
    private String nombre;

    private String direccion;

    private List<Libro> libros;

    public Biblioteca(int id) {
        this.id = id;
    }

    public Biblioteca(int id, String nombre, String direccion, List<Libro> libros) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", libros=" + libros +
                '}';
    }
}

