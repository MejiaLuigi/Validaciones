package org.example.modelos;

import Validaciones.OfertaValidacion;
import org.example.Utilidades.Util;

import java.time.LocalDate;

public class Oferta {
    private Integer id;
    private String titulo;
    private String descripcion;

    private String formatoFecha;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private Integer costopersona;
    private Integer idlocal;

    private Util util = new Util();
    private OfertaValidacion validacion = new OfertaValidacion();

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, String formatoFecha, LocalDate fecha_inicio, LocalDate fecha_fin, Integer costopersona, Integer idlocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.formatoFecha = formatoFecha;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.costopersona = costopersona;
        this.idlocal = idlocal;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Oferta{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", formatoFecha='" + formatoFecha + '\'' +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_fin=" + fecha_fin +
                ", costopersona=" + costopersona +
                ", idlocal=" + idlocal +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try{
            this.validacion.validarTitulo(titulo);
            this.titulo = titulo;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFormatoFecha() {
        return formatoFecha;
    }

    public void setFormatoFecha(String formatoFecha) {
        this.formatoFecha = formatoFecha;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {

        try{
            this.validacion.validarFecha(fecha_inicio);
            this.fecha_inicio = this.util.convertirStringenLocaldate(fecha_inicio);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        try {
            this.validacion.validarFecha(fecha_fin);
            this.validacion.validarDiferenciadeFechas(this.fecha_inicio, this.util.convertirStringenLocaldate(fecha_fin));
            this.fecha_inicio=this.util.convertirStringenLocaldate(fecha_fin);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Integer getCostopersona() {
        return costopersona;
    }

    public void setCostopersona(Integer costopersona) {
        try{
            this.validacion.validarCosto(costopersona);
            this.costopersona = costopersona;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Integer getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(Integer idlocal) {
        this.idlocal = idlocal;
    }
}
