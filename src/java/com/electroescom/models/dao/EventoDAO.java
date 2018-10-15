package com.electroescom.models.dao;

import com.electroescom.models.pojos.modelos.Evento;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EventoDAO {

    private Session session;
    private Transaction tx;
    
    private void iniciarTransaccion() throws HibernateException{
        session = HibernateUtil.getSessionFactory().openSession();
        tx=session.beginTransaction();
    }
    
    public void insertar(Evento evento){
        
        try{
            iniciarTransaccion();
            session.save(evento);
            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally{
            if(session!=null)
                session.close();
        }
        
    }
}
