package com.electroescom.ws;

import com.electroescom.models.dao.UsuarioDAO;
import com.electroescom.models.pojos.modelos.Evento;
import com.electroescom.models.pojos.modelos.Usuario;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "UsuarioWS")
public class UsuarioWS {
    
    @WebMethod(operationName="iniciarSesion")
    public int iniciarSesion(
            @WebParam(name="nombreUsuario") String nombreUsuario,
            @WebParam(name="nombrePila") String nombrePila 
    ){
            Evento e=new Evento();
            e.setFecha(new Date());
            e.setNombreUsuario(nombreUsuario);
            e.setObservaciones("Inicio de Session");
            e.setTipo_evento((byte)1);
        return 0;
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
        
        /**
         * Creamos una instancia de tipo Usuario,
         * la cual se va a persistir en la base de datos.
         */
        
        u.setApellidoMaterno(apMaterno);
        u.setApellidoPaterno(apPaterno);
        u.setContrasenia(contrasenia);
        u.setCorreo(correo);
        u.setFechaNac(fechaNac);
        u.setNombrePila(nombrePila);
        u.setNombreUsuario(nombreUsuario);
        u.setTelefono(telefono);
        u.setTipo_usuario(tipoUsuario);
        /**
         * Asignamos los valores que se dan al 
         * ws a la instancia creada.
         */
        UsuarioDAO udao=new UsuarioDAO();
        /**
         * Creamos una instancia de tipo UsuarioDAO
         * la cual sera la encargada de hacer la 
         * persistencia del usuario.7
         */
        
        Evento e=new Evento();
        e.setFecha(new Date());
        e.setNombreUsuario(nombreUsuario);
        e.setObservaciones("Inicio de Session");
        e.setTipo_evento((byte)1);
        return udao.insertaUsuario(u,e);
    }
    
        
}
