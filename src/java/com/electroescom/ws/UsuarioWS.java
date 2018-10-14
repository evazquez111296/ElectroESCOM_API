package com.electroescom.ws;

import com.electroescom.models.pojos.modelos.Usuario;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "UsuarioWS")
public class UsuarioWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName="insertar")
    public int insertar(
            @WebParam(name="nombreUsuario") String nombreUsuario,
            @WebParam(name="nombrePila") String nombrePila,
            @WebParam(name="apellidoPaterno") String apPaterno,
            @WebParam(name="apellidoMaterno") String apMaterno,
            @WebParam(name="correo") String correo,
            @WebParam(name="contrasenia") String contrasenia,
            @WebParam(name="tipoUsuario") byte tipoUsuario,
            @WebParam(name="fechaNac") Date fechaNac,
            @WebParam(name="telefono") String telefono

    )
    {
        Usuario u=new Usuario();
        u.setApellidoMaterno(apMaterno);
        u.setApellidoPaterno(apPaterno);
        u.setContrasenia(contrasenia);
        u.setCorreo(correo);
        u.setFechaNac(fechaNac);
        u.setNombrePila(nombrePila);
        u.setNombreUsuario(nombreUsuario);
        u.setTelefono(telefono);
        u.setTipo_usuario(tipoUsuario);
        
        return 1;
    }
}
