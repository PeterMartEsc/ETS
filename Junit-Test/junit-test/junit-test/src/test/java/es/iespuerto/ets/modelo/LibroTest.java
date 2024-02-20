package es.iespuerto.ets.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibroTest {

    private String isbn = "isbn";
    private String titulo = "nombre";
    private String autor = "autor";
    private String fPublicacion = "20-02-2024";

    Libro libro;

    @BeforeEach
    public void beforeEach(){
        libro= new Libro(isbn, titulo, autor, fPublicacion);
    }


    @Test
    public void libroNotNullTest(){
        Assertions.assertNotNull(libro, "La variable no puede ser nula");
    }

    @Test
    public void libroGetSetTest(){
        String tituloUpdate = "otro nombre";
        String fPublicacionUpdate = "21-02-2024";
        String autorUpdate = "autorUpdate";

        libro.setAutor(autorUpdate);
        libro.setfPublicacion(fPublicacionUpdate);
        libro.setTitulo(tituloUpdate);

        Assertions.assertEquals(tituloUpdate, libro.getTitulo(),
                "El resultado no es el esperado");
        Assertions.assertEquals(fPublicacionUpdate, libro.getfPublicacion(),
                "El resultado no es el esperado");
        Assertions.assertEquals(autorUpdate, libro.getAutor(),
                "El resultado no es el esperado");
        Assertions.assertEquals(isbn, libro.getIsbn(),
                "El resultado no es el esperado");
    }

    @Test
    public void toStringTest(){
        Assertions.assertTrue(libro.toString().contains(isbn),
                "No contiene el valor esperado");
        Assertions.assertTrue(libro.toString().contains(titulo),
                "No contiene el valor esperado");
        Assertions.assertTrue(libro.toString().contains(autor),
                "No contiene el valor esperado");
        Assertions.assertTrue(libro.toString().contains(fPublicacion),
                "No contiene el valor esperado");
    }

}
