/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Francisco Carlos
 */
public class Main {
    public static void main(String[] args) {

       Produto produto = new Produto();
       Pedido pedido = new Pedido();
       pedido.setIDusuario(123);
       pedido.setMesa(1);
       pedido.setPagamento(true);
       pedido.setStatus(true);
       pedido.setPronto(true);
       pedido.setTipo(true);
       PedidoController p1 = new PedidoController();
       //p1.salvar(pedido);
       
        
        
        
    }
    
}
