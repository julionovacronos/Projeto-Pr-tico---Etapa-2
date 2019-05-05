/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

public class ProdutoComum extends Produto{

    private String observacao;

    public ProdutoComum(double id, String nome, double preco, boolean pronto, String observacao) {
        super(id, nome, preco, pronto);
        this.observacao = observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }
    
    
    
    
}
