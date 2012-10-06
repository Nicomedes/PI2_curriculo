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
@Table(name = "formacao", catalog = "CvDados", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formacao.findAll", query = "SELECT f FROM Formacao f"),
    @NamedQuery(name = "Formacao.findById", query = "SELECT f FROM Formacao f WHERE f.formacaoPK.id = :id"),
    @NamedQuery(name = "Formacao.findByIdusuario", query = "SELECT f FROM Formacao f WHERE f.formacaoPK.idusuario = :idusuario"),
    @NamedQuery(name = "Formacao.findByInstituicao", query = "SELECT f FROM Formacao f WHERE f.instituicao = :instituicao"),
    @NamedQuery(name = "Formacao.findByCurso", query = "SELECT f FROM Formacao f WHERE f.curso = :curso"),
    @NamedQuery(name = "Formacao.findByDtinicio", query = "SELECT f FROM Formacao f WHERE f.dtinicio = :dtinicio"),
    @NamedQuery(name = "Formacao.findByDtfim", query = "SELECT f FROM Formacao f WHERE f.dtfim = :dtfim"),
    @NamedQuery(name = "Formacao.findByGrauescolar", query = "SELECT f FROM Formacao f WHERE f.grauescolar = :grauescolar")})
public class Formacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FormacaoPK formacaoPK;
    @Column(name = "INSTITUICAO")
    private String instituicao;
    @Column(name = "CURSO")
    private String curso;
    @Column(name = "DTINICIO")
    @Temporal(TemporalType.DATE)
    private Date dtinicio;
    @Column(name = "DTFIM")
    @Temporal(TemporalType.DATE)
    private Date dtfim;
    @Column(name = "GRAUESCOLAR")
    private Integer grauescolar;
    @Lob
    @Column(name = "OBS")
    private String obs;

    public Formacao() {
    }

    public Formacao(FormacaoPK formacaoPK) {
        this.formacaoPK = formacaoPK;
    }

    public Formacao(int id, int idusuario) {
        this.formacaoPK = new FormacaoPK(id, idusuario);
    }

    public FormacaoPK getFormacaoPK() {
        return formacaoPK;
    }

    public void setFormacaoPK(FormacaoPK formacaoPK) {
        this.formacaoPK = formacaoPK;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Date getDtinicio() {
        return dtinicio;
    }

    public void setDtinicio(Date dtinicio) {
        this.dtinicio = dtinicio;
    }

    public Date getDtfim() {
        return dtfim;
    }

    public void setDtfim(Date dtfim) {
        this.dtfim = dtfim;
    }

    public Integer getGrauescolar() {
        return grauescolar;
    }

    public void setGrauescolar(Integer grauescolar) {
        this.grauescolar = grauescolar;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (formacaoPK != null ? formacaoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formacao)) {
            return false;
        }
        Formacao other = (Formacao) object;
        if ((this.formacaoPK == null && other.formacaoPK != null) || (this.formacaoPK != null && !this.formacaoPK.equals(other.formacaoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Formacao[ formacaoPK=" + formacaoPK + " ]";
    }
    
}
