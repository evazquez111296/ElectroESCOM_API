package com.electroescom.models.dao;

import com.electroescom.models.pojos.modelos.Usuario;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsuarioDAO {
    
    private Session session;
    private Transaction tx;
    
    private void iniciar() throws HibernateException{
        session = HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction();
    }
    
    public void insertaUsuario(Usuario u){
        int id=-1;
        try{
            iniciar();
            session.save(u);
            tx.commit();
            
        }catch(HibernateException he){
            tx.rollback();
            
        }finally{
            if(session!=null)
                session.close();
            
        }
    }
    
}
