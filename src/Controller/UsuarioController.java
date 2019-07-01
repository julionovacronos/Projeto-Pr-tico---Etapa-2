/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.Pedido;
import Main.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Murilo
 */
public class UsuarioController {
    private SessionFactory conexao;
   
   public UsuarioController(){
       conexao = new Configuration().configure().buildSessionFactory();
   }
   public void salvar(Usuario user){
       Session session;
       session = conexao.openSession();
       Transaction tx = session.beginTransaction();
       session.save(user);
       tx.commit();
       session.close();   
   }
   public List<Usuario> listar(){
       try{
           
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        List<Usuario> lista = (List<Usuario>)session.createQuery("From Usuario").list();
        tx.commit();
        session.close();   
        return lista;
       }catch(Exception e){
           System.out.println(e);
           return null;
       }
   }
   public void delete(Usuario user){
        try{
            Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction();
            session.delete(user);
            tx.commit();
            session.close();   
        }catch(Exception e){
            System.out.println(e);
        }
        
   }

   public boolean contem(Usuario user){
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        boolean c = session.contains(user);
        tx.commit();
        session.close();   
        return c;
   }
   
   public Usuario buscar(int Uid){
       try{
           Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction();
            Usuario c = (Usuario) session.get(Usuario.class, Uid);
            tx.commit();
            session.close();   
            return c;
       }catch(Exception e ){
           System.out.println(e);
       }
       return null;
   }
   public void merge(Usuario user){
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.merge(user);
        tx.commit();
        session.close();   
   }
}
