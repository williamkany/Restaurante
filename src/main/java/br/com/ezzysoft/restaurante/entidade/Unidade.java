package br.com.ezzysoft.restaurante.entidade;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author Christian Medeiros <christian.souza@gmail.com>
 */
@Entity
@Table(name = "unidade")
@NamedQueries({
        @NamedQuery(name = "Unidade.findAll", query = "SELECT u FROM Unidade u "),
        @NamedQuery(name = "Unidade.findAllOrder", query = "SELECT u FROM Unidade u ORDER BY u.descricao"),
        @NamedQuery(name = "Unidade.findById", query = "SELECT u FROM Unidade u WHERE u.id = :id")})
public class Unidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "sigla")
    private String sigla;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Unidade other = (Unidade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public Unidade() {
    }

    public Unidade(Long id) {
        this.id = id;
    }

    public Unidade(String descricao, String sigla) {
        this.descricao = descricao;
        this.sigla = sigla;
    }

    public Unidade(Long id, String descricao, String sigla) {
        this.id = id;
        this.descricao = descricao;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "br.com.ezzysoft.restaurante.entidade.Unidade[ id=" + id + " ]";
    }

}
