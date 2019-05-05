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
public class ProdutoPersonalizado extends Produto {
    
    private String ingredientes;

    public ProdutoPersonalizado(String ingredientes, double id, String nome, double preco, boolean pronto) {
        super(id, nome, preco, pronto);
        this.ingredientes = ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getIngredientes() {
        return ingredientes;
    }
      
}
