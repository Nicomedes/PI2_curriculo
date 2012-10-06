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
@Table(name = "grauescolar", catalog = "CvDados", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grauescolar.findAll", query = "SELECT g FROM Grauescolar g"),
    @NamedQuery(name = "Grauescolar.findById", query = "SELECT g FROM Grauescolar g WHERE g.id = :id"),
    @NamedQuery(name = "Grauescolar.findByGrau", query = "SELECT g FROM Grauescolar g WHERE g.grau = :grau")})
public class Grauescolar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "GRAU")
    private String grau;

    public Grauescolar() {
    }

    public Grauescolar(Integer id) {
        this.id = id;
    }

    public Grauescolar(Integer id, String grau) {
        this.id = id;
        this.grau = grau;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grauescolar)) {
            return false;
        }
        Grauescolar other = (Grauescolar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Grauescolar[ id=" + id + " ]";
    }
    
}
