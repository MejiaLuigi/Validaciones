package org.example.Utilidades;

public enum Mensaje {

    //El enum sirve para enumerar atributos, en este caso los mensajes de las exceptions.
    // Sirve para optimizar el codigo, esto va a sustituir cambios en donde los tenga que hacer
    FORMATO_NOMBRE("Revise el formato del Nombre ingresado"),
    LONGITUD_NOMBRE("Revise Longitud del nombre es muy corta"),

    FORMATO_UBICACION ("revise bien la ubicación"),

    FORMATO_LOCAL("Revise el Nit"),
    FORMTO_LONGITUDLOCAL("Revise Cantidad Digitos"),
    FORMATO_lONGNOMBRE("REVISE TOTAL DE CARACTERES"),

    FORMATO_CORREO ("REVISE FORMATO DEL CORREO"),

    FORMATO_FECHA("Formato Invalido"),
    FORMATO_FECHA2("La fecha final no puede ser antes de la inicial"),

    COSTO_LONGITUD ("Revise La Info"),

    NUMERO_PERSONAS ("REVISE LA CANTIDAD DE PERSONAS"), FORMATO_OFERTA("Revise el formato"), LONGITUD_TITULO("LONGITU INCORRECTA");

    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
