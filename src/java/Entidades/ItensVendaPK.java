/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author a1711997
 */
@Embeddable
public class ItensVendaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_venda")
    private int idVenda;
    @Basic(optional = false)
    @Column(name = "id_produto")
    private int idProduto;

    public ItensVendaPK() {
    }

    public ItensVendaPK(int idVenda, int idProduto) {
        this.idVenda = idVenda;
        this.idProduto = idProduto;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idVenda;
        hash += (int) idProduto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensVendaPK)) {
            return false;
        }
        ItensVendaPK other = (ItensVendaPK) object;
        if (this.idVenda != other.idVenda) {
            return false;
        }
        if (this.idProduto != other.idProduto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.ItensVendaPK[ idVenda=" + idVenda + ", idProduto=" + idProduto + " ]";
    }
    
}
