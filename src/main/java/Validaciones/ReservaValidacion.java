package Validaciones;

import org.example.Utilidades.Mensaje;
import org.example.Utilidades.Util;


public class ReservaValidacion {

    Util util = new Util();

    public Boolean validarFormatoFecha(String fecha) throws Exception {
        if (util.buscarCoincidencia(String.valueOf(fecha), "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")){
            throw new Exception(Mensaje.FORMATO_FECHA.getMensaje());
        }
        return true;
    }
    public Boolean validarPersonas(Integer personas) throws Exception {
        if (personas < 0 || personas > 4){
            throw new Exception(Mensaje.NUMERO_PERSONAS.getMensaje());
        }
        return true;
    }

    public Double calcularIva (Double costoTotal){
        Double IVA = costoTotal * 0.19;
        return costoTotal + IVA;
    }

}
