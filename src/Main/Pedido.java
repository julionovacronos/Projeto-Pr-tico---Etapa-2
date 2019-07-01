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
@Entity
public class Pedido implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;
    @Column
    private int mesa;
    @Column
    private boolean pagamento;
    @Column
    private int IDusuario;
    @Column
    private boolean status;
    @Column
    private float total;

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    public Pedido() {
    }

    public Pedido(int ID, int mesa, int IDusuario) {
        this.ID = ID;
        this.mesa = mesa;
        this.pagamento = false;
        this.IDusuario = IDusuario;
        this.status = false;
        this.total = 0;
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

   

   

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
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
    
   
    
}
