/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "auditoria", catalog = "CvDados", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auditoria.findAll", query = "SELECT a FROM Auditoria a"),
    @NamedQuery(name = "Auditoria.findById", query = "SELECT a FROM Auditoria a WHERE a.auditoriaPK.id = :id"),
    @NamedQuery(name = "Auditoria.findByRotina", query = "SELECT a FROM Auditoria a WHERE a.rotina = :rotina"),
    @NamedQuery(name = "Auditoria.findByAcao", query = "SELECT a FROM Auditoria a WHERE a.acao = :acao"),
    @NamedQuery(name = "Auditoria.findByDatahora", query = "SELECT a FROM Auditoria a WHERE a.datahora = :datahora"),
    @NamedQuery(name = "Auditoria.findByIdusuario", query = "SELECT a FROM Auditoria a WHERE a.auditoriaPK.idusuario = :idusuario")})
public class Auditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AuditoriaPK auditoriaPK;
    @Basic(optional = false)
    @Column(name = "ROTINA")
    private int rotina;
    @Basic(optional = false)
    @Column(name = "ACAO")
    private char acao;
    @Basic(optional = false)
    @Column(name = "DATAHORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahora;

    public Auditoria() {
    }

    public Auditoria(AuditoriaPK auditoriaPK) {
        this.auditoriaPK = auditoriaPK;
    }

    public Auditoria(AuditoriaPK auditoriaPK, int rotina, char acao, Date datahora) {
        this.auditoriaPK = auditoriaPK;
        this.rotina = rotina;
        this.acao = acao;
        this.datahora = datahora;
    }

    public Auditoria(int id, int idusuario) {
        this.auditoriaPK = new AuditoriaPK(id, idusuario);
    }

    public AuditoriaPK getAuditoriaPK() {
        return auditoriaPK;
    }

    public void setAuditoriaPK(AuditoriaPK auditoriaPK) {
        this.auditoriaPK = auditoriaPK;
    }

    public int getRotina() {
        return rotina;
    }

    public void setRotina(int rotina) {
        this.rotina = rotina;
    }

    public char getAcao() {
        return acao;
    }

    public void setAcao(char acao) {
        this.acao = acao;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (auditoriaPK != null ? auditoriaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auditoria)) {
            return false;
        }
        Auditoria other = (Auditoria) object;
        if ((this.auditoriaPK == null && other.auditoriaPK != null) || (this.auditoriaPK != null && !this.auditoriaPK.equals(other.auditoriaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Auditoria[ auditoriaPK=" + auditoriaPK + " ]";
    }
    
}
