package com.electroescom.models.dao;

import com.electroescom.helpers.Triplet;
import com.electroescom.models.pojos.modelos.Evento;
import com.electroescom.models.pojos.modelos.Usuario;
import com.electroescom.ws.exceptions.ContraseniaInvalidaException;
import com.electroescom.ws.exceptions.UsuarioNoEncontradoException;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

public class UsuarioDAO {
    
    private Session session;
    private Transaction tx;
    
    private void iniciar() throws HibernateException{
        session = HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction();
    }
    
    private void iniciarConsulta(){
            session = HibernateUtil.getSessionFactory().openSession();
    }
    
    public List<Usuario> getUsuarios(){
        iniciarConsulta();
        List<Usuario> usuarios=null;
        try{
            Query query=session.createQuery("from Usuario");
             usuarios=query.list();
        }catch(Exception e){
            usuarios=null;
        }finally{
            if(session!=null)
                session.close();
            /**
             * Verifica si la session esta activa, si es así la cierra.
             */
        }
        return usuarios;
    }
    
    public Triplet<Object,String,Integer> iniciarSesion(String usuario,String contrasenia,Evento ev){
        
        int codigoOperacion;
        String mensaje="";
        Usuario u=null;
        try{
            iniciarConsulta();
            u=session.get(Usuario.class, usuario);
            if(u==null)
                throw new UsuarioNoEncontradoException("Usuario no encontrado");
            else{
                if(!u.getContrasenia().equals(contrasenia))//Verifica si las contraseñas coinciden.
                    throw new ContraseniaInvalidaException("Contraseña invalida");
            }
            codigoOperacion=0;//Si existe el usuario
            EventoDAO edao=new EventoDAO();
            edao.insertar(ev);
            
        }
        catch(UsuarioNoEncontradoException unfe){
            codigoOperacion=-2;//Usuario no encontrado.
            mensaje=unfe.getMessage();
        }
        catch(ContraseniaInvalidaException cie){
            codigoOperacion=-3;
            mensaje=cie.getMessage();
        }
        catch(Exception e){
            codigoOperacion=-1;//Error interno
            mensaje=e.getMessage();
        }finally{
            if(session!=null)
                session.close();
            /**
             * Verifica si la session esta activa, si es así la cierra.
             */
        }
        Triplet<Object,String,Integer> p=new Triplet<>(u,mensaje,codigoOperacion);
        return p;
    }
    
    public int insertaUsuario(Usuario u,Evento e){
        int codigoOperacion=-1;
        try{
            iniciar();
            session.save(u);
            tx.commit();
            codigoOperacion=0;//Registro de usuario con éxito
            EventoDAO edao=new EventoDAO();
            edao.insertar(e);
        }catch(ConstraintViolationException cve){
            tx.rollback();
            codigoOperacion=-2;//El nombre de usuario ya esta
        }
        catch(Exception he){
            tx.rollback();
            codigoOperacion=-1;//Error interno
        }finally{
            if(session!=null)
                session.close();
            /**
             * Verifica si la session esta activa, si es así la cierra.
             */
        }
        
        return codigoOperacion;//regresamos el codigo de la operacion
    }
    
}
