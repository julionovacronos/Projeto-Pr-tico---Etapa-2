/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;
import Model.ProdutoNaCompra;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Murilo
 */
public class ProdutoNaCompraController {
    private SessionFactory conexao;
   
   public ProdutoNaCompraController(){
       conexao = new Configuration().configure().buildSessionFactory();
   }
   public void salvar(ProdutoNaCompra prod){
       Session session;
       session = conexao.openSession();
       Transaction tx = session.beginTransaction();
       session.save(prod);
       tx.commit();
       session.close();   
   }
   public List<ProdutoNaCompra> listar(){
       try{
           
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        List<ProdutoNaCompra> lista = (List<ProdutoNaCompra>)session.createQuery("From ProdutoNaCompra").list();
        tx.commit();
        session.close();   
        return lista;
       }catch(Exception e){
           System.out.println(e);
           return null;
       }
   }
   public void delete(ProdutoNaCompra prod){
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

   public boolean contem(ProdutoNaCompra prod){
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        boolean c = session.contains(prod);
        tx.commit();
        session.close();   
        return c;
   }
   
   public ProdutoNaCompra buscar(int Uid){
       try{
           Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction();
            ProdutoNaCompra c = (ProdutoNaCompra) session.get(ProdutoNaCompra.class, Uid);
            tx.commit();
            session.close();   
            return c;
       }catch(Exception e ){
           System.out.println(e);
       }
       return null;
   }
}
