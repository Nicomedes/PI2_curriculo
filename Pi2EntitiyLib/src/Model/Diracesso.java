/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "diracesso", catalog = "CvDados", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diracesso.findAll", query = "SELECT d FROM Diracesso d"),
    @NamedQuery(name = "Diracesso.findById", query = "SELECT d FROM Diracesso d WHERE d.diracessoPK.id = :id"),
    @NamedQuery(name = "Diracesso.findByIdgrupo", query = "SELECT d FROM Diracesso d WHERE d.diracessoPK.idgrupo = :idgrupo"),
    @NamedQuery(name = "Diracesso.findByIdrotina", query = "SELECT d FROM Diracesso d WHERE d.diracessoPK.idrotina = :idrotina"),
    @NamedQuery(name = "Diracesso.findByAcessar", query = "SELECT d FROM Diracesso d WHERE d.acessar = :acessar"),
    @NamedQuery(name = "Diracesso.findByInserir", query = "SELECT d FROM Diracesso d WHERE d.inserir = :inserir"),
    @NamedQuery(name = "Diracesso.findByDeletar", query = "SELECT d FROM Diracesso d WHERE d.deletar = :deletar"),
    @NamedQuery(name = "Diracesso.findByAtualizar", query = "SELECT d FROM Diracesso d WHERE d.atualizar = :atualizar"),
    @NamedQuery(name = "Diracesso.findBySelecionar", query = "SELECT d FROM Diracesso d WHERE d.selecionar = :selecionar")})
public class Diracesso implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DiracessoPK diracessoPK;
    @Basic(optional = false)
    @Column(name = "ACESSAR")
    private boolean acessar;
    @Basic(optional = false)
    @Column(name = "INSERIR")
    private boolean inserir;
    @Basic(optional = false)
    @Column(name = "DELETAR")
    private boolean deletar;
    @Basic(optional = false)
    @Column(name = "ATUALIZAR")
    private boolean atualizar;
    @Basic(optional = false)
    @Column(name = "SELECIONAR")
    private boolean selecionar;

    public Diracesso() {
    }

    public Diracesso(DiracessoPK diracessoPK) {
        this.diracessoPK = diracessoPK;
    }

    public Diracesso(DiracessoPK diracessoPK, boolean acessar, boolean inserir, boolean deletar, boolean atualizar, boolean selecionar) {
        this.diracessoPK = diracessoPK;
        this.acessar = acessar;
        this.inserir = inserir;
        this.deletar = deletar;
        this.atualizar = atualizar;
        this.selecionar = selecionar;
    }

    public Diracesso(int id, int idgrupo, int idrotina) {
        this.diracessoPK = new DiracessoPK(id, idgrupo, idrotina);
    }

    public DiracessoPK getDiracessoPK() {
        return diracessoPK;
    }

    public void setDiracessoPK(DiracessoPK diracessoPK) {
        this.diracessoPK = diracessoPK;
    }

    public boolean getAcessar() {
        return acessar;
    }

    public void setAcessar(boolean acessar) {
        this.acessar = acessar;
    }

    public boolean getInserir() {
        return inserir;
    }

    public void setInserir(boolean inserir) {
        this.inserir = inserir;
    }

    public boolean getDeletar() {
        return deletar;
    }

    public void setDeletar(boolean deletar) {
        this.deletar = deletar;
    }

    public boolean getAtualizar() {
        return atualizar;
    }

    public void setAtualizar(boolean atualizar) {
        this.atualizar = atualizar;
    }

    public boolean getSelecionar() {
        return selecionar;
    }

    public void setSelecionar(boolean selecionar) {
        this.selecionar = selecionar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diracessoPK != null ? diracessoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diracesso)) {
            return false;
        }
        Diracesso other = (Diracesso) object;
        if ((this.diracessoPK == null && other.diracessoPK != null) || (this.diracessoPK != null && !this.diracessoPK.equals(other.diracessoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Diracesso[ diracessoPK=" + diracessoPK + " ]";
    }
    
}
