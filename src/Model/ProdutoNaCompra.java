/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Murilo
 */
@Entity
public class ProdutoNaCompra implements Serializable{

    public ProdutoNaCompra(int ID, Pedido ped, Produto prod, int quantidade) {
        this.ID = ID;
        this.ped = ped;
        this.prod = prod;
        this.quantidade = quantidade;
    }

   
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int ID;
    @ManyToOne
    @JoinColumn(name = "Id_pedido")
    Pedido ped;
    @ManyToOne
    @JoinColumn(name = "Id_produto")
    Produto prod;
    @Column
    int quantidade;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.ID;
       
        hash = 89 * hash + this.quantidade;
        return hash;
    }

    public Pedido getPed() {
        return ped;
    }

    public void setPed(Pedido ped) {
        this.ped = ped;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProdutoNaCompra other = (ProdutoNaCompra) obj;
        if (this.ID != other.ID) {
            return false;
        }
       
        if (this.quantidade != other.quantidade) {
            return false;
        }
        return true;
    }

    public ProdutoNaCompra() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
