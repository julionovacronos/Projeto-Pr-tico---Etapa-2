/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private int ID;
    private int mesa;
    private boolean pronto;
    private boolean pagamento;
    private boolean tipo;
    private int IDusuario;
    private boolean status;

    public Pedido(int ID, int mesa, boolean pronto, boolean pagamento, boolean tipo, int IDusuario) {
        this.ID = ID;
        this.mesa = mesa;
        this.pronto = pronto;
        this.pagamento = pagamento;
        this.tipo = tipo;
        this.IDusuario = IDusuario;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public boolean isPronto() {
        return pronto;
    }

    public void setPronto(boolean pronto) {
        this.pronto = pronto;
    }

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public int getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void FoiEntregue(){
        this.status = true;
    }   
    
    public void EstaPronto(){
        this.pronto = true;
    }
    
    
}
