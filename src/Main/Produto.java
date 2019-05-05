/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


public class Produto {

    protected double id;
    protected String nome;
    protected double preco;
    protected boolean pronto;

    public Produto(double id, String nome, double preco, boolean pronto) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.pronto = pronto;
    }

    public void setId(double id) {
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
    
    public void setPronto(boolean pronto){
        this.pronto=pronto;
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
    
    public boolean getPronto(){
        return pronto;
    }
    
    
    
    
    
}
