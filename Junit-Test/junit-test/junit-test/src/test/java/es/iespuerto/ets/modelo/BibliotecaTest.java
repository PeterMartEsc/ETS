package es.iespuerto.ets.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

    private int id = 1;
    private String nombre = "nombre";
    private String direccion = "direccion";
    Biblioteca biblioteca;

    @BeforeEach
    public void beforeEach(){
        biblioteca = new Biblioteca(id, nombre, direccion);
    }

    @Test
    public void bibliotecaNotNullTest(){
        Assertions.assertNotNull(biblioteca,
                "El objeto no puede ser nulo");
    }

    @Test
    public void bibliotecaGetSetTest(){
        String otroNombre = "otro nombre";
        String otraDireccion = "otra direccion";
        biblioteca.setDireccion(otraDireccion);
        biblioteca.setNombre(otroNombre);
        Assertions.assertEquals(otraDireccion, biblioteca.getDireccion(),
                "No se ha obtenido el valor esperado");
        Assertions.assertEquals(otroNombre, biblioteca.getNombre(),
                "No se ha obtenido el valor esperado");
    }

    @Test
    public void bibliotecaToStringTest(){
        Assertions.assertTrue(biblioteca.toString().contains(nombre), "No se ha encontrado el valor esperado");
        Assertions.assertTrue(biblioteca.toString().contains(direccion), "No se ha encontrado el valor esperado");
        Assertions.assertTrue(biblioteca.toString().contains(String.valueOf(id)), "No se ha encontrado el valor esperado");
    }

    @Test
    public void bibliotecaEqualsTest(){
        Assertions.assertTrue(biblioteca.equals(biblioteca), "No se ha obtenido el resultado esperado");
        Biblioteca bibliotecaEquals = new Biblioteca(id);
        Assertions.assertTrue(biblioteca.equals(bibliotecaEquals), "No se ha obtenido el resultado esperado");

    }
}
