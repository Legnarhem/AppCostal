/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appcostal.model;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author MAMISHO
 */
public class DAO {
    public List<Hermano> hermanosDisponibles(){
        List<Hermano> hermanos;
        SessionFactory s=HibernateUtil.getSessionFactory();
        Session se;
        se=s.openSession();
        Transaction tx=se.beginTransaction();
        Query q=se.createQuery("From Hermano");
        hermanos=(List<Hermano>)q.list();
        tx.commit();
        se.close();
        return hermanos;
    }
    
    public Hermano buscaHermano(String email, String clave){
        Hermano hermano=null;
        SessionFactory s=HibernateUtil.getSessionFactory();
        Session se;
        se=s.openSession();
        Transaction tx=se.beginTransaction();
        Query q=se.createQuery("From Hermano where email='"+email+"' and clave='"+clave+"'");
        List<Hermano> lista=(List<Hermano>)q.list();
        if(!lista.isEmpty()){
            hermano=lista.get(0);
        }
        tx.commit();
        se.close();
        return hermano;
    }
    
    public void Insertar(Object obj){
        SessionFactory s=HibernateUtil.getSessionFactory();
        Session se;
        se=s.openSession();
        Transaction tx=se.beginTransaction();
        se.save(obj);
        tx.commit();
        se.close();
    }
    
    public Hermano obtenerHermano(String dni){
        Hermano hermano=null;
        SessionFactory s=HibernateUtil.getSessionFactory();
        Session se;
        se=s.openSession();
        Transaction tx=se.beginTransaction();
        Query q=se.createQuery("From Hermano where dni='"+dni+"'");
        List<Hermano> lista=(List<Hermano>)q.list();
        if(!lista.isEmpty()){
            hermano=lista.get(0);
        }
        tx.commit();
        se.close();
        return hermano;
    }
    
    public void actualizar(Object obj){
        SessionFactory s=HibernateUtil.getSessionFactory();
        Session se;
        se=s.openSession();
        Transaction tx=se.beginTransaction();
        se.update(obj);
        tx.commit();
        se.close();
    }
    
        public void eliminar(Object obj){
        SessionFactory s=HibernateUtil.getSessionFactory();
        Session se;
        se=s.openSession();
        Transaction tx=se.beginTransaction();
        se.delete(obj);
        tx.commit();
        se.close();
    }
        
    public List<Paso> pasosDisponibles(){
        List<Paso> pasos;
        SessionFactory s=HibernateUtil.getSessionFactory();
        Session se;
        se=s.openSession();
        Transaction tx=se.beginTransaction();
        Query q=se.createQuery("From Paso");
        pasos=(List<Paso>)q.list();
        tx.commit();
        se.close();
        return pasos;
    }
      public List<Iguala> igualasDisponibles(){
        List<Iguala> igualas;
        SessionFactory s=HibernateUtil.getSessionFactory();
        Session se;
        se=s.openSession();
        Transaction tx=se.beginTransaction();
        Query q=se.createQuery("From Iguala");
        igualas=(List<Iguala>)q.list();
        tx.commit();
        se.close();
        return igualas;
    }
      
       public Iguala obtenerIguala(String idiguala){
        Iguala iguala=null;
        SessionFactory s=HibernateUtil.getSessionFactory();
        Session se;
        se=s.openSession();
        Transaction tx=se.beginTransaction();
        Query q=se.createQuery("From Iguala where idiguala='"+idiguala+"'");
        List<Iguala> lista=(List<Iguala>)q.list();
        if(!lista.isEmpty()){
            iguala=lista.get(0);
        }
        tx.commit();
        se.close();
        return iguala;
    }
      
      
    
    public Hermandad obtenerHermandad(String idhermandad){
        Hermandad hermandad=null;
        SessionFactory s=HibernateUtil.getSessionFactory();
        Session se;
        se=s.openSession();
        Transaction tx=se.beginTransaction();
        Query q=se.createQuery("From Hermandad where idhermandad='"+idhermandad+"'");
        List<Hermandad> lista=(List<Hermandad>)q.list();
        if(!lista.isEmpty()){
            hermandad=lista.get(0);
        }
        tx.commit();
        se.close();
        return hermandad;
    }
    
    public Paso obtenerPaso(String idpaso){
        Paso paso=null;
        SessionFactory s=HibernateUtil.getSessionFactory();
        Session se;
        se=s.openSession();
        Transaction tx=se.beginTransaction();
        Query q=se.createQuery("From Paso where idpaso='"+idpaso+"'");
        List<Paso> lista=(List<Paso>)q.list();
        if(!lista.isEmpty()){
            paso=lista.get(0);
        }
        tx.commit();
        se.close();
        return paso;
    }
    
    public List<Hermandad> hermandadesDisponibles(){
        List<Hermandad> hermandades;
        SessionFactory s=HibernateUtil.getSessionFactory();
        Session se;
        se=s.openSession();
        Transaction tx=se.beginTransaction();
        Query q=se.createQuery("From Hermandad");
        hermandades=(List<Hermandad>)q.list();
        tx.commit();
        se.close();
        return hermandades;
    }
}
