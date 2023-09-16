package Validaciones;

import org.example.Utilidades.Mensaje;
import org.example.modelos.Oferta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {

    OfertaValidacion OfertaValidacion;

    @BeforeEach
    public void configurarPrueba2s() {
        System.out.println("Estoy ejecutando la prueba");
        this.OfertaValidacion = new OfertaValidacion();
    }

    @Test
    public void validarTituloCorrecto() {
        String titulo = "TituloValido";
        Assertions.assertDoesNotThrow(() -> OfertaValidacion.validarTitulo(titulo));
    }

    @Test
    public void validarTituloIncorrecto() {
        String titulo = "TituloInválido123"; // Un título inválido que contiene números
        Exception excepcion = Assertions.assertThrows(Exception.class, () -> OfertaValidacion.validarTitulo(titulo));
        Assertions.assertEquals(Mensaje.FORMATO_OFERTA.getMensaje(), excepcion.getMessage());
    }

    @Test
    public void validarTituloLongitudExcedida() {
        String titulo = "TituloConUnaLongitudMuyLarga"; // Título con más de 20 caracteres
        Exception excepcion = Assertions.assertThrows(Exception.class, () -> OfertaValidacion.validarTitulo(titulo));
        Assertions.assertEquals(Mensaje.LONGITUD_NOMBRE.getMensaje(), excepcion.getMessage());
    }

    @Test
    public void validarFormatoFechaCorrecto() {
        String fecha = "31/12/2023";
        Assertions.assertDoesNotThrow(() -> OfertaValidacion.validarFecha(fecha));
    }

    @Test
    public void validarFormatoFechaIncorrecto() {
        String fecha = "2023-12-31"; // Formato incorrecto
        Exception excepcion = Assertions.assertThrows(Exception.class, () -> OfertaValidacion.validarFecha(fecha));
        Assertions.assertEquals(Mensaje.FORMATO_FECHA.getMensaje(), excepcion.getMessage());
    }

    @Test
    public void validarDiferenciaFechasCorrecto() {
        LocalDate fechaInicio = LocalDate.of(2023, 12, 31);
        LocalDate fechaFin = LocalDate.of(2024, 1, 1);
        Assertions.assertDoesNotThrow(() -> OfertaValidacion.validarDiferenciadeFechas(fechaInicio, fechaFin));
    }

    @Test
    public void validarDiferenciaFechasIncorrecto() {
        LocalDate fechaInicio = LocalDate.of(2024, 1, 1);
        LocalDate fechaFin = LocalDate.of(2023, 12, 31); // Fecha final antes de la fecha inicial
        Exception excepcion = Assertions.assertThrows(Exception.class, () -> OfertaValidacion.validarDiferenciadeFechas(fechaInicio, fechaFin));
        Assertions.assertEquals(Mensaje.FORMATO_FECHA2.getMensaje(), excepcion.getMessage());
    }

    @Test
    public void validarCostoPersonaCorrecto() {
        Integer costo = 50;
        Assertions.assertDoesNotThrow(() -> OfertaValidacion.validarCosto(costo));
    }

    @Test
    public void validarCostoPersonaIncorrecto() {
        Integer costo = -10; // Costo negativo
        Exception excepcion = Assertions.assertThrows(Exception.class, () -> OfertaValidacion.validarCosto(costo));
        Assertions.assertEquals(Mensaje.COSTO_LONGITUD.getMensaje(), excepcion.getMessage());
    }

}