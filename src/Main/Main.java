/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.PedidoController;
import Controller.ProdutoController;
import Controller.ProdutoNaCompraController;
import Controller.UsuarioController;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Francisco Carlos
 */
public class Main {
    public static void main(String[] args) {

  
       
      ProdutoNaCompra prod = new ProdutoNaCompra(1, 2, 3, 4);
      ProdutoNaCompraController dao = new ProdutoNaCompraController();
      dao.salvar(prod);
        
        
    }
    
}
