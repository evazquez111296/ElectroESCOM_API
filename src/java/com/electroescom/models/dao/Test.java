/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.electroescom.models.dao;

import com.electroescom.models.pojos.modelos.Evento;
import com.electroescom.models.pojos.modelos.Usuario;
import java.util.Date;
import java.util.List;

/**
 *
 * @author evazquez
 */
public class Test {
    
    public static void main(String[] args){ 
        UsuarioDAO udao=new UsuarioDAO();
        List<Usuario> user=udao.getUsuarios();
        int a=99;
        int z=5+6;
    }
    
}
