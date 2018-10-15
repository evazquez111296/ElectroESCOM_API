package com.electroescom.models.pojos.modelos;

import java.io.Serializable;
import java.util.Date;

public class Evento implements Serializable{
    
    private int id_evento;
    private String nombreUsuario;
    private Date fecha;
    private byte tipo_evento;
    private String observaciones;

    public Evento(){
        
    }
    public Evento(int id_evento, String nombreUsuario, Date fecha, byte tipo_evento, String observaciones) {
        this.id_evento = id_evento;
        this.nombreUsuario = nombreUsuario;
        this.fecha = fecha;
        this.tipo_evento = tipo_evento;
        this.observaciones = observaciones;
    }

    
    
    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public byte getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(byte tipo_evento) {
        this.tipo_evento = tipo_evento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
    
    
}
