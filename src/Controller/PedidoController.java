/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pedido;
import Model.Pedido;
import Model.Pedido;
import Model.Pedido;
import Model.Pedido;
import Model.Usuario;
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
public class PedidoController {
   private SessionFactory conexao;
   
   public PedidoController(){
       conexao = new Configuration().configure().buildSessionFactory();
   }
   public void salvar(Pedido pedido){
       Session session;
       session = conexao.openSession();
       Transaction tx = session.beginTransaction();
       session.save(pedido);
       tx.commit();
       session.close();
       
   }
   
   public List<Pedido> listar(){
       try{
           
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        List<Pedido> lista = (List<Pedido>)session.createQuery("From Pedido").list();
        tx.commit();
        session.close();   
        return lista;
       }catch(Exception e){
           System.out.println(e);
           return null;
       }
   }
   public void delete(Pedido ped){
        try{
            Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction();
            session.delete(ped);
            tx.commit();
            session.close();   
        }catch(Exception e){
            System.out.println(e);
        }
        
   }

   public boolean contem(Pedido ped){
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        boolean c = session.contains(ped);
        tx.commit();
        session.close();   
        return c;
   }
   public void merge(Pedido ped){
    try{
            Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction();
            session.merge(ped);
            tx.commit();
            session.close();   
        }catch(Exception e){
            System.out.println(e);
        }
    }
   public Pedido buscar(int Uid){
       try{
           Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction();
            Pedido c = (Pedido) session.get(Pedido.class, Uid);
            tx.commit();
            session.close();   
            return c;
       }catch(Exception e ){
           System.out.println(e);
       }
       return null;
   }
   
}
