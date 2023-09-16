package Validaciones;

import org.example.Utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {

    ReservaValidacion reservaValidacion;

    @BeforeEach
    public void configurarPrueba2s() {
        System.out.println("Estoy ejecutando la prueba");
        this.reservaValidacion = new ReservaValidacion();
    }

    @Test
    public void validarFechaResCorrecto() {
        String fechaRes = "31-12-2023";
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> reservaValidacion.validarFormatoFecha(fechaRes));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarFechaResIncorrecto() {
        String fechaRes = "31/12/2023";
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> reservaValidacion.validarFormatoFecha(fechaRes));
        Assertions.assertEquals(Mensaje.FORMATO_FECHA.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void numeroPerCorrecto() {
        int numeroPer = 3;
        Boolean respuesta = assertDoesNotThrow(() -> reservaValidacion.validarPersonas(numeroPer));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void numeroPerIncorrecto() {
        int numeroPer = 5;
        Exception respuesta = Assertions.assertThrows(Exception.class, () -> reservaValidacion.validarPersonas(numeroPer));
        Assertions.assertEquals(Mensaje.NUMERO_PERSONAS.getMensaje(), respuesta.getMessage());
    }

  }