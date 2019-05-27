/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

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
   
   
}
