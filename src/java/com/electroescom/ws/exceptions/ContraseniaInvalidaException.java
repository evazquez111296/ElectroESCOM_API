package com.electroescom.ws.exceptions;

public class ContraseniaInvalidaException extends Exception{
      
    private String mensaje;
    
    public ContraseniaInvalidaException(String mensaje){
        super(mensaje);
        this.mensaje=mensaje;
    }
    
    @Override
    public String toString(){
        return mensaje;
    }
    
}
