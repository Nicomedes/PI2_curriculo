/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "idiomas", catalog = "CvDados", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Idiomas.findAll", query = "SELECT i FROM Idiomas i"),
    @NamedQuery(name = "Idiomas.findById", query = "SELECT i FROM Idiomas i WHERE i.idiomasPK.id = :id"),
    @NamedQuery(name = "Idiomas.findByIdusuario", query = "SELECT i FROM Idiomas i WHERE i.idiomasPK.idusuario = :idusuario"),
    @NamedQuery(name = "Idiomas.findByIdioma", query = "SELECT i FROM Idiomas i WHERE i.idioma = :idioma"),
    @NamedQuery(name = "Idiomas.findByNivel", query = "SELECT i FROM Idiomas i WHERE i.nivel = :nivel")})
public class Idiomas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IdiomasPK idiomasPK;
    @Column(name = "IDIOMA")
    private String idioma;
    @Column(name = "NIVEL")
    private Short nivel;

    public Idiomas() {
    }

    public Idiomas(IdiomasPK idiomasPK) {
        this.idiomasPK = idiomasPK;
    }

    public Idiomas(int id, int idusuario) {
        this.idiomasPK = new IdiomasPK(id, idusuario);
    }

    public IdiomasPK getIdiomasPK() {
        return idiomasPK;
    }

    public void setIdiomasPK(IdiomasPK idiomasPK) {
        this.idiomasPK = idiomasPK;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Short getNivel() {
        return nivel;
    }

    public void setNivel(Short nivel) {
        this.nivel = nivel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idiomasPK != null ? idiomasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Idiomas)) {
            return false;
        }
        Idiomas other = (Idiomas) object;
        if ((this.idiomasPK == null && other.idiomasPK != null) || (this.idiomasPK != null && !this.idiomasPK.equals(other.idiomasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Idiomas[ idiomasPK=" + idiomasPK + " ]";
    }
    
}
