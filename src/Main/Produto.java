/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


public class Produto {

    private int id;
    private String nome;
    private double preco;
    private String observacao;

    public Produto(int id, String nome, double preco, String observacao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.observacao = observacao;
     
    }

    public void setId(int id) {
        if(id>0){
            this.id = id;
        }else{
            System.out.println("ID Invalido.");
        }
    }
       
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if(preco>0){
            this.preco = preco;
        }else{
            System.out.println("Preço Invalido.");
        }
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
    public double getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getObservacao() {
        return observacao;
    }
       
    
    
    
}
