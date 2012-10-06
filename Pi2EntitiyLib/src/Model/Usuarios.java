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
@Table(name = "usuarios", catalog = "CvDados", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findById", query = "SELECT u FROM Usuarios u WHERE u.usuariosPK.id = :id"),
    @NamedQuery(name = "Usuarios.findByLogin", query = "SELECT u FROM Usuarios u WHERE u.usuariosPK.login = :login"),
    @NamedQuery(name = "Usuarios.findBySenha", query = "SELECT u FROM Usuarios u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuarios.findByGrpacesso", query = "SELECT u FROM Usuarios u WHERE u.grpacesso = :grpacesso"),
    @NamedQuery(name = "Usuarios.findByCpf", query = "SELECT u FROM Usuarios u WHERE u.cpf = :cpf"),
    @NamedQuery(name = "Usuarios.findByNome", query = "SELECT u FROM Usuarios u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuarios.findByDtnasc", query = "SELECT u FROM Usuarios u WHERE u.dtnasc = :dtnasc"),
    @NamedQuery(name = "Usuarios.findByAtivo", query = "SELECT u FROM Usuarios u WHERE u.ativo = :ativo"),
    @NamedQuery(name = "Usuarios.findByEmail", query = "SELECT u FROM Usuarios u WHERE u.email = :email"),
    @NamedQuery(name = "Usuarios.findByTelefone", query = "SELECT u FROM Usuarios u WHERE u.telefone = :telefone"),
    @NamedQuery(name = "Usuarios.findByCelular", query = "SELECT u FROM Usuarios u WHERE u.celular = :celular"),
    @NamedQuery(name = "Usuarios.findByUf", query = "SELECT u FROM Usuarios u WHERE u.uf = :uf"),
    @NamedQuery(name = "Usuarios.findByCidade", query = "SELECT u FROM Usuarios u WHERE u.cidade = :cidade"),
    @NamedQuery(name = "Usuarios.findByDeficiente", query = "SELECT u FROM Usuarios u WHERE u.deficiente = :deficiente")})
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuariosPK usuariosPK;
    @Basic(optional = false)
    @Column(name = "SENHA")
    private String senha;
    @Column(name = "GRPACESSO")
    private Integer grpacesso;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DTNASC")
    @Temporal(TemporalType.DATE)
    private Date dtnasc;
    @Lob
    @Column(name = "OBS")
    private String obs;
    @Basic(optional = false)
    @Column(name = "ATIVO")
    private boolean ativo;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "UF")
    private String uf;
    @Column(name = "CIDADE")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "DEFICIENTE")
    private boolean deficiente;

    public Usuarios() {
    }

    public Usuarios(UsuariosPK usuariosPK) {
        this.usuariosPK = usuariosPK;
    }

    public Usuarios(UsuariosPK usuariosPK, String senha, boolean ativo, boolean deficiente) {
        this.usuariosPK = usuariosPK;
        this.senha = senha;
        this.ativo = ativo;
        this.deficiente = deficiente;
    }

    public Usuarios(int id, String login) {
        this.usuariosPK = new UsuariosPK(id, login);
    }

    public UsuariosPK getUsuariosPK() {
        return usuariosPK;
    }

    public void setUsuariosPK(UsuariosPK usuariosPK) {
        this.usuariosPK = usuariosPK;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getGrpacesso() {
        return grpacesso;
    }

    public void setGrpacesso(Integer grpacesso) {
        this.grpacesso = grpacesso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtnasc() {
        return dtnasc;
    }

    public void setDtnasc(Date dtnasc) {
        this.dtnasc = dtnasc;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean getDeficiente() {
        return deficiente;
    }

    public void setDeficiente(boolean deficiente) {
        this.deficiente = deficiente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuariosPK != null ? usuariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.usuariosPK == null && other.usuariosPK != null) || (this.usuariosPK != null && !this.usuariosPK.equals(other.usuariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Usuarios[ usuariosPK=" + usuariosPK + " ]";
    }
    
}
