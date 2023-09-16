package Validaciones;

import org.example.Utilidades.Mensaje;
import org.example.Utilidades.Util;

public class LocalValidacion {

    private Util util = new Util();

    public Boolean validarNit(String nit) throws Exception {
        if (!util.buscarCoincidencia(nit, "^[0-9]+$")){
            throw new Exception(Mensaje.FORMATO_LOCAL.getMensaje());
        }
        if(nit.length()!=10){
            throw new Exception(Mensaje.FORMTO_LONGITUDLOCAL.getMensaje());
        }
        return true;
    }
    public Boolean validarNombreL(String nombre) throws Exception {
        if (!util.buscarCoincidencia(nombre, "^[a-zA-Z0-9 ]+$")){
            throw new Exception(Mensaje.FORMATO_NOMBRE.getMensaje());
        }
        if (nombre.length() >= 30){
            throw new Exception(Mensaje.FORMATO_lONGNOMBRE.getMensaje());
        }
        return true;
    }

}
