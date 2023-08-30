package bean;
// Generated 29/08/2023 10:54:52 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Servicos generated by hbm2java
 */
@Entity
@Table(name="servicos"
    ,catalog="mpv_aluno"
)
public class Servicos  implements java.io.Serializable {


     private int idservicos;
     private String nome;
     private BigDecimal valor;
     private String ativo;
     private Set osServicosesForIdos = new HashSet(0);
     private Set osServicosesForServicos = new HashSet(0);

    public Servicos() {
    }

	
    public Servicos(int idservicos) {
        this.idservicos = idservicos;
    }
    public Servicos(int idservicos, String nome, BigDecimal valor, String ativo, Set osServicosesForIdos, Set osServicosesForServicos) {
       this.idservicos = idservicos;
       this.nome = nome;
       this.valor = valor;
       this.ativo = ativo;
       this.osServicosesForIdos = osServicosesForIdos;
       this.osServicosesForServicos = osServicosesForServicos;
    }
   
     @Id 

    
    @Column(name="idservicos", unique=true, nullable=false)
    public int getIdservicos() {
        return this.idservicos;
    }
    
    public void setIdservicos(int idservicos) {
        this.idservicos = idservicos;
    }

    
    @Column(name="nome", length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="valor", precision=10)
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
    @Column(name="ativo", length=1)
    public String getAtivo() {
        return this.ativo;
    }
    
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="servicosByIdos")
    public Set getOsServicosesForIdos() {
        return this.osServicosesForIdos;
    }
    
    public void setOsServicosesForIdos(Set osServicosesForIdos) {
        this.osServicosesForIdos = osServicosesForIdos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="servicosByServicos")
    public Set getOsServicosesForServicos() {
        return this.osServicosesForServicos;
    }
    
    public void setOsServicosesForServicos(Set osServicosesForServicos) {
        this.osServicosesForServicos = osServicosesForServicos;
    }




}


