package Validaciones;

import org.example.Utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {
    //Preparo la prueba
    UsuarioValidacion usuarioValidacion;

    @BeforeEach //palabra reservada que le da funcionalidad al metodo de la prueba (Preparar la prueba para ejecutarla)

    public void configurarPruebas(){
        System.out.printf("Estoy ejecuntando la prueba");
        this.usuarioValidacion= new UsuarioValidacion();
    }
    @Test //para ejecutarlas
    public void validarNombreFallaPorNombreCorto(){
        //Prepare
        String nombrePrueba="Juan";
        //Ejecute            //Palabra para verificar
        Exception respuesta = Assertions.assertThrows(Exception.class, ()-> this.usuarioValidacion.validarNombre(nombrePrueba));
        Assertions.assertEquals(Mensaje.LONGITUD_NOMBRE.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarNombreFallaPorCaracteres(){
        String nombrePrueba = "22";
        Exception respuesta2 = Assertions.assertThrows(Exception.class, ()-> this.usuarioValidacion.validarNombre(nombrePrueba));
        Assertions.assertEquals(Mensaje.FORMATO_NOMBRE.getMensaje(), respuesta2.getMessage());
    }
    @Test
    public void validarNombreCorrecto(){
        String nombrePrueba = "LuisEMejia";
       Boolean respuesta3= Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarNombre(nombrePrueba));
       Assertions.assertTrue(respuesta3);
    }

    public void validarCorreoCorrecto(){
        String correoPrueba = "correo@globant.com";
        Boolean respuesta = Assertions.assertDoesNotThrow(()-> this.usuarioValidacion.validarCorreo(correoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCorreoIncorrecto(){
        String correoPrueba = "correoglobant.com";
        Exception respuesta2 = Assertions.assertThrows(Exception.class, ()-> this.usuarioValidacion.validarCorreo(correoPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_CORREO.getMensaje(), respuesta2.getMessage());
    }

    @Test
    public void validarUbicacionCorrecta() {
        Integer ubicacionPrueba = 2;
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> this.usuarioValidacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarUbicacionIncorrecta() {
        Integer ubicacionPrueba = 5;
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> this.usuarioValidacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_UBICACION.getMensaje(), respuesta.getMessage());
    }
}