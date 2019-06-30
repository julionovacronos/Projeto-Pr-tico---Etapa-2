/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Murilo
 */
@Entity
public class ProdutoNaCompra implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int ID;
    @Column
    int IDcompra;
    @Column
    int IDproduto;
    @Column
    int quantidade;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.ID;
        hash = 89 * hash + this.IDcompra;
        hash = 89 * hash + this.IDproduto;
        hash = 89 * hash + this.quantidade;
        return hash;
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
        if (this.IDcompra != other.IDcompra) {
            return false;
        }
        if (this.IDproduto != other.IDproduto) {
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

    public int getIDcompra() {
        return IDcompra;
    }

    public void setIDcompra(int IDcompra) {
        this.IDcompra = IDcompra;
    }

    public int getIDproduto() {
        return IDproduto;
    }

    public void setIDproduto(int IDproduto) {
        this.IDproduto = IDproduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
