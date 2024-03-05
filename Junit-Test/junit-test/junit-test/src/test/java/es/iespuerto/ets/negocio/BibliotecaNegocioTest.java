package es.iespuerto.ets.negocio;

import es.iespuerto.ets.modelo.Libro;
import es.iespuerto.ets.modelo.LibroTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaNegocioTest extends LibroTest {

    private int id = 1;
    private String titulo = "nombre";
    private String direccion = "direccion";
    BibliotecaNegocio bibliotecaNegocio;

    Libro libro;

    @BeforeEach
    public void beforeEach(){
        bibliotecaNegocio = new BibliotecaNegocio(id, titulo, direccion);

        //Da igual darle el id de la biblioteca como string, simplemente estamos testeando
        libro = new Libro(String.valueOf(id), titulo, "autor", "fPublicacion");
        bibliotecaNegocio.addLibro(libro);
    }

    @Test
    public void bibliotecaNegocioNotNull(){
        Assertions.assertNotNull(bibliotecaNegocio, "El objeto no puede ser nulo");
        Assertions.assertNotNull(bibliotecaNegocio.obtenerLibros(), "El objeto no puede ser nulo");
    }



    @Test
    public void addLibroTest(){
        bibliotecaNegocio.addLibro(libro);
        Assertions.assertEquals(id, bibliotecaNegocio.obtenerLibros().size(), "No se ha obtenido el numero esperado");
    }

    @Test
    public void addLibroDuplicadoTest(){
        bibliotecaNegocio.addLibro(libro);
        Assertions.assertEquals(1, bibliotecaNegocio.obtenerLibros().size(), "No se ha obtenido el resultado esperado");
    }

    @Test
    public void obtenerLibroTest(){
        Libro libroBuscar = new Libro(String.valueOf(id));

        Assertions.assertEquals(libro, bibliotecaNegocio.obtenerLibro(libroBuscar));
    }

    @Test
    public void obtenerLibroNoExisteTest(){
        Libro libroBuscar = new Libro(String.valueOf(2));
        Assertions.assertEquals(null, bibliotecaNegocio.obtenerLibro(libroBuscar));
    }

    @Test
    public void eliminarLibroTest(){
        Libro libroEliminar = new Libro(String.valueOf(1));
        bibliotecaNegocio.eliminarLibro(libroEliminar);
        Assertions.assertEquals(0,bibliotecaNegocio.obtenerLibros().size(), "El numero no es el esperado");
    }

    @Test
    public void actualizarLibroTest(){
        String otroTtitulo = "otro titulo";
        libro.setTitulo(otroTtitulo);
        Assertions.assertTrue(bibliotecaNegocio.actualizarLibro(libro), "No se ha actualizado");
        Libro libroBuscar = new Libro(String.valueOf(id));
        libroBuscar = bibliotecaNegocio.obtenerLibro(libroBuscar);
        Assertions.assertEquals(otroTtitulo, libroBuscar.getTitulo(), "No se ha obtenido el texto esperado");
    }

    @Test
    public void actualizarLibroNoExistenteTest(){

        Libro libroActualizar = new Libro(String.valueOf("2"));
        Assertions.assertFalse(bibliotecaNegocio.actualizarLibro(libroActualizar), "No se ha actualizado de forma correcta");
    }

}
