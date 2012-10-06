/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Administrator
 */
@Embeddable
public class DiracessoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @Column(name = "IDGRUPO")
    private int idgrupo;
    @Basic(optional = false)
    @Column(name = "IDROTINA")
    private int idrotina;

    public DiracessoPK() {
    }

    public DiracessoPK(int id, int idgrupo, int idrotina) {
        this.id = id;
        this.idgrupo = idgrupo;
        this.idrotina = idrotina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(int idgrupo) {
        this.idgrupo = idgrupo;
    }

    public int getIdrotina() {
        return idrotina;
    }

    public void setIdrotina(int idrotina) {
        this.idrotina = idrotina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) idgrupo;
        hash += (int) idrotina;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiracessoPK)) {
            return false;
        }
        DiracessoPK other = (DiracessoPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.idgrupo != other.idgrupo) {
            return false;
        }
        if (this.idrotina != other.idrotina) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.DiracessoPK[ id=" + id + ", idgrupo=" + idgrupo + ", idrotina=" + idrotina + " ]";
    }
    
}
