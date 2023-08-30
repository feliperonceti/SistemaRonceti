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
 * Vendedor generated by hbm2java
 */
@Entity
@Table(name="vendedor"
    ,catalog="mpv_aluno"
)
public class Vendedor  implements java.io.Serializable {


     private int idvendedor;
     private String nome;
     private BigDecimal salario;
     private BigDecimal comissao;
     private String vendedorcol;
     private Set vendases = new HashSet(0);

    public Vendedor() {
    }

	
    public Vendedor(int idvendedor) {
        this.idvendedor = idvendedor;
    }
    public Vendedor(int idvendedor, String nome, BigDecimal salario, BigDecimal comissao, String vendedorcol, Set vendases) {
       this.idvendedor = idvendedor;
       this.nome = nome;
       this.salario = salario;
       this.comissao = comissao;
       this.vendedorcol = vendedorcol;
       this.vendases = vendases;
    }
   
     @Id 

    
    @Column(name="idvendedor", unique=true, nullable=false)
    public int getIdvendedor() {
        return this.idvendedor;
    }
    
    public void setIdvendedor(int idvendedor) {
        this.idvendedor = idvendedor;
    }

    
    @Column(name="nome", length=60)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="salario", precision=10)
    public BigDecimal getSalario() {
        return this.salario;
    }
    
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    
    @Column(name="comissao", precision=10)
    public BigDecimal getComissao() {
        return this.comissao;
    }
    
    public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
    }

    
    @Column(name="vendedorcol", length=45)
    public String getVendedorcol() {
        return this.vendedorcol;
    }
    
    public void setVendedorcol(String vendedorcol) {
        this.vendedorcol = vendedorcol;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vendedor")
    public Set getVendases() {
        return this.vendases;
    }
    
    public void setVendases(Set vendases) {
        this.vendases = vendases;
    }




}


