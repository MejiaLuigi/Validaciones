package Validaciones;

import org.example.Utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LocalValidacionTest {

    LocalValidacion localValidacion;

    @BeforeEach
    public void Configurarprueba(){
        System.out.println("Estoy Ejecutando Prueba");
        this.localValidacion = new LocalValidacion();
    }


    @Test
    public void nitFormatoFalla(){
        String numeroPrueba = "awe123";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()-> this.localValidacion.validarNit(numeroPrueba));

    }

    @Test
    public void nitFallaLongitud () {
        String numeroPrueba = "1234";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()-> this.localValidacion.validarNit(numeroPrueba));
        Assertions.assertEquals(Mensaje.FORMTO_LONGITUDLOCAL.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void nitCorrectoLongitud() {
        String numeroPrueba="1234567890";
        Boolean respueta = Assertions.assertDoesNotThrow(()-> this.localValidacion.validarNit(numeroPrueba));
        Assertions.assertTrue(respueta);
    }

    @Test
    public void nombreLongitudFalla(){
        String nombrePrueba = "La Longitud Debe Ser Menor de 30 caracteres";
    }

}