/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "exprofissional", catalog = "CvDados", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Exprofissional.findAll", query = "SELECT e FROM Exprofissional e"),
    @NamedQuery(name = "Exprofissional.findById", query = "SELECT e FROM Exprofissional e WHERE e.exprofissionalPK.id = :id"),
    @NamedQuery(name = "Exprofissional.findByIdusuario", query = "SELECT e FROM Exprofissional e WHERE e.exprofissionalPK.idusuario = :idusuario"),
    @NamedQuery(name = "Exprofissional.findByEmpresa", query = "SELECT e FROM Exprofissional e WHERE e.empresa = :empresa"),
    @NamedQuery(name = "Exprofissional.findByCargo", query = "SELECT e FROM Exprofissional e WHERE e.cargo = :cargo"),
    @NamedQuery(name = "Exprofissional.findByDtentrada", query = "SELECT e FROM Exprofissional e WHERE e.dtentrada = :dtentrada"),
    @NamedQuery(name = "Exprofissional.findByDtsaida", query = "SELECT e FROM Exprofissional e WHERE e.dtsaida = :dtsaida")})
public class Exprofissional implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExprofissionalPK exprofissionalPK;
    @Column(name = "EMPRESA")
    private String empresa;
    @Column(name = "CARGO")
    private String cargo;
    @Column(name = "DTENTRADA")
    @Temporal(TemporalType.DATE)
    private Date dtentrada;
    @Column(name = "DTSAIDA")
    @Temporal(TemporalType.DATE)
    private Date dtsaida;
    @Lob
    @Column(name = "DESCRICAO")
    private String descricao;

    public Exprofissional() {
    }

    public Exprofissional(ExprofissionalPK exprofissionalPK) {
        this.exprofissionalPK = exprofissionalPK;
    }

    public Exprofissional(int id, int idusuario) {
        this.exprofissionalPK = new ExprofissionalPK(id, idusuario);
    }

    public ExprofissionalPK getExprofissionalPK() {
        return exprofissionalPK;
    }

    public void setExprofissionalPK(ExprofissionalPK exprofissionalPK) {
        this.exprofissionalPK = exprofissionalPK;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDtentrada() {
        return dtentrada;
    }

    public void setDtentrada(Date dtentrada) {
        this.dtentrada = dtentrada;
    }

    public Date getDtsaida() {
        return dtsaida;
    }

    public void setDtsaida(Date dtsaida) {
        this.dtsaida = dtsaida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exprofissionalPK != null ? exprofissionalPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exprofissional)) {
            return false;
        }
        Exprofissional other = (Exprofissional) object;
        if ((this.exprofissionalPK == null && other.exprofissionalPK != null) || (this.exprofissionalPK != null && !this.exprofissionalPK.equals(other.exprofissionalPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Exprofissional[ exprofissionalPK=" + exprofissionalPK + " ]";
    }
    
}
