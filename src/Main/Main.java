/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.PedidoController;
import Controller.ProdutoController;
import Controller.UsuarioController;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Francisco Carlos
 */
public class Main {
    public static void main(String[] args) {

  
       
       Produto prod = new Produto(10, "ze", 2, "alo internet");
        ProdutoController dao = new ProdutoController();
        dao.salvar(prod);
        
        
    }
    
}
