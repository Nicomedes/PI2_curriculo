/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "grpacesso", catalog = "CvDados", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grpacesso.findAll", query = "SELECT g FROM Grpacesso g"),
    @NamedQuery(name = "Grpacesso.findByGrid", query = "SELECT g FROM Grpacesso g WHERE g.grid = :grid"),
    @NamedQuery(name = "Grpacesso.findByGrnome", query = "SELECT g FROM Grpacesso g WHERE g.grnome = :grnome"),
    @NamedQuery(name = "Grpacesso.findByGrativo", query = "SELECT g FROM Grpacesso g WHERE g.grativo = :grativo")})
public class Grpacesso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "GRID")
    private Integer grid;
    @Basic(optional = false)
    @Column(name = "GRNOME")
    private String grnome;
    @Basic(optional = false)
    @Column(name = "GRATIVO")
    private boolean grativo;

    public Grpacesso() {
    }

    public Grpacesso(Integer grid) {
        this.grid = grid;
    }

    public Grpacesso(Integer grid, String grnome, boolean grativo) {
        this.grid = grid;
        this.grnome = grnome;
        this.grativo = grativo;
    }

    public Integer getGrid() {
        return grid;
    }

    public void setGrid(Integer grid) {
        this.grid = grid;
    }

    public String getGrnome() {
        return grnome;
    }

    public void setGrnome(String grnome) {
        this.grnome = grnome;
    }

    public boolean getGrativo() {
        return grativo;
    }

    public void setGrativo(boolean grativo) {
        this.grativo = grativo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grid != null ? grid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grpacesso)) {
            return false;
        }
        Grpacesso other = (Grpacesso) object;
        if ((this.grid == null && other.grid != null) || (this.grid != null && !this.grid.equals(other.grid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Grpacesso[ grid=" + grid + " ]";
    }
    
}
