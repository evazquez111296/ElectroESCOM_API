package com.electroescom.ws.exceptions;

public class UsuarioNoEncontradoException extends Exception {
    
    private String mensaje;
    
    public UsuarioNoEncontradoException(String mensaje){
        super(mensaje);
        this.mensaje=mensaje;
    }
    
    @Override
    public String toString(){
        return mensaje;
    }
}
