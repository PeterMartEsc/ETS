package es.iespuerto.ets.negocio;

import es.iespuerto.ets.modelo.Biblioteca;
import es.iespuerto.ets.modelo.Libro;

import java.util.List;

public class BibliotecaNegocio {

    Biblioteca biblioteca;


    public BibliotecaNegocio(int id){
        biblioteca = new Biblioteca(id);
    }

    public BibliotecaNegocio(int id, String nombre, String direccion){
        biblioteca = new Biblioteca(id, nombre, direccion);
    }

    public List<Libro> obtenerLibros(){

        return biblioteca.getLibros();
    }
}
