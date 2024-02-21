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
        Assertions.assertNotNull(biblioteca, "El objeto no puede ser nulo");
    }


}
