/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

public class Usuario {
    
    private double id;
    private String nome;
    private String login;
    private String senha;

    public Usuario(double id, String nome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public void setId(double id) {
        if(id>0){
        this.id = id;
        }else{
            System.out.println("ID inválido.");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        if(senha.length()>6){
        this.senha = senha;
        }else{
            System.out.println("A senha é inválida, ela necessita contem mais de 6 digitos.");
        }
    }

    public double getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
        
}
