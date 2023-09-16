package Validaciones;

import org.example.Utilidades.Mensaje;
import org.example.Utilidades.Util;

import java.time.LocalDate;

public class OfertaValidacion {
    Util util = new Util();


    public Boolean validarTitulo(String titulo) throws Exception{
        if (titulo.length() > 20) {
            throw new Exception(Mensaje.LONGITUD_NOMBRE.getMensaje());
        }

        return true;
    }
    public Boolean validarDiferenciadeFechas(LocalDate fecha_inicio, LocalDate fecha_fin) throws Exception{
        if (fecha_inicio.isAfter(fecha_fin)){
            throw new Exception(Mensaje.FORMATO_FECHA2.getMensaje());
        }
        return true;
    }
    public Boolean validarFecha(String fecha) throws Exception{

        if (!util.buscarCoincidencia(String.valueOf(fecha),"^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")){
            throw new Exception(Mensaje.FORMATO_FECHA.getMensaje());
        }return true;
    }
    public Boolean validarCosto(Integer costo) throws  Exception{
        if(costo < 0){
            throw new Exception(Mensaje.COSTO_LONGITUD.getMensaje());
        }
        return true;
    }

}
