package com.electroescom.models.dao;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{  
    private static final SessionFactory sessionFactory;   

    static 
    { 
        try 
        { 
            sessionFactory = new Configuration().configure().buildSessionFactory(); 
        } catch (HibernateException he) 
        { 
           System.err.println("Error al iniciar SessionFactory: " + he); 
           throw new ExceptionInInitializerError(he); 
        } 
    }  

    public static SessionFactory getSessionFactory() 
    { 
        return sessionFactory; 
    } 
}