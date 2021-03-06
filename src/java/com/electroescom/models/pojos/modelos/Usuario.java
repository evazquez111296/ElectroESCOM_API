package com.electroescom.models.pojos.modelos;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable{
    
    private String nombreUsuario;
    private String contrasenia;
    private  byte tipo_usuario;
    private String nombrePila;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correo;
    private Date FechaNac;
    private String telefono;
    private Date Fecha_Ingreso;
    private String urlFoto;
    private char sexo;
    
    public Usuario(){
    
    }

    public Usuario(String nombreUsuario, String contrasenia,
            byte tipo_usuario, String nombrePila, 
            String apellidoPaterno, String apellidoMaterno, 
            String correo, Date FechaNac, String telefono,
            Date Fecha_Ingreso,String urlFoto,char sexo) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.tipo_usuario = tipo_usuario;
        this.nombrePila = nombrePila;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.FechaNac = FechaNac;
        this.telefono = telefono;
        this.Fecha_Ingreso=Fecha_Ingreso;
        this.urlFoto=urlFoto;
        this.sexo=sexo;
    }
    
    public char getSexo(){return this.sexo;}
    
    public void setSexo(char sexo){this.sexo=sexo;}
    
    public String getUrlFoto(){return this.urlFoto;}
    
    public void setUrlFoto(String urlFoto){this.urlFoto=urlFoto;}
    
    public Date getFecha_Ingreso(){return this.Fecha_Ingreso;}
    
    public void setFecha_Ingreso(Date Fecha_Ingreso){this.Fecha_Ingreso=Fecha_Ingreso;}
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public byte getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(byte tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getNombrePila() {
        return nombrePila;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
