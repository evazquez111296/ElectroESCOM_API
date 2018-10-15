/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.electroescom.models.dao;

import com.electroescom.models.pojos.modelos.Evento;
import com.electroescom.models.pojos.modelos.Usuario;
import java.util.Date;

/**
 *
 * @author evazquez
 */
public class Test {
    
    public static void main(String[] args){
        System.out.println("Corriendo");
        EventoDAO uDAO=new EventoDAO();

        /*
        Usuario u=new Usuario();
        u.setApellidoMaterno("Martinez");
        u.setApellidoPaterno("Vazquez");
        u.setContrasenia("abc");
        u.setCorreo("evazquez@logsys.com.mx");
        u.setFechaNac(new Date());
        u.setNombrePila("Jesus Eduardo");
        u.setNombreUsuario("evazquez");
        u.setTelefono("53803305");
        byte b=(byte)1;
        u.setTipo_usuario(b);
        UsuarioDAO uDAO=new UsuarioDAO();
        uDAO.insertaUsuario(u);*/
        Evento e=new Evento();
        Date d=new Date();
        e.setFecha(d);
        e.setNombreUsuario("evazquez");
        e.setObservaciones("test evento");
        e.setTipo_evento((byte)1);
        uDAO.insertar(e);
        int r=1+2;
    }
    
}
