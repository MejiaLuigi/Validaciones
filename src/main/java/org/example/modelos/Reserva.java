package org.example.modelos;

import Validaciones.ReservaValidacion;
import org.example.Utilidades.Util;

public class Reserva {
    private Integer id;
    private Integer idUsuario;
    private Integer idLocal;
    private Double costoTotal;
    private String fechaReserva;

    private Integer cantidadPersonas;

    public Util util = new Util();
    public ReservaValidacion validacion = new ReservaValidacion();

    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idLocal, Double costoTotal, String fechaReserva, Integer cantidadPersonas) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idLocal = idLocal;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idLocal=" + idLocal +
                ", costoTotal=" + costoTotal +
                ", fechaReserva='" + fechaReserva + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        try{
            this.validacion.calcularIva(costoTotal);
            this.costoTotal = costoTotal;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        try{
            this.validacion.validarPersonas(cantidadPersonas);
            this.cantidadPersonas = cantidadPersonas;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}


