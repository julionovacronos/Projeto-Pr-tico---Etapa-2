/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.Produto;
import Main.Usuario;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Murilo
 */
public class ProdutoController {
    private SessionFactory conexao;
   
   public ProdutoController(){
       conexao = new Configuration().configure().buildSessionFactory();
   }
   public void salvar(Produto prod){
       Session session;
       session = conexao.openSession();
       Transaction tx = session.beginTransaction();
       session.save(prod);
       tx.commit();
       session.close();   
   }
   public List<Produto> listar(){
       try{
           
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        List<Produto> lista = (List<Produto>)session.createQuery("From Produto").list();
        tx.commit();
        session.close();   
        return lista;
       }catch(Exception e){
           System.out.println(e);
           return null;
       }
   }
   public void delete(Produto prod){
        try{
            Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction();
            session.delete(prod);
            tx.commit();
            session.close();   
        }catch(Exception e){
            System.out.println(e);
        }
        
   }

   public boolean contem(Produto prod){
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        boolean c = session.contains(prod);
        tx.commit();
        session.close();   
        return c;
   }
   
   public Produto buscar(int Uid){
       try{
           Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction();
            Produto c = (Produto) session.get(Produto.class, Uid);
            tx.commit();
            session.close();   
            return c;
       }catch(Exception e ){
           System.out.println(e);
       }
       return null;
   }
}
