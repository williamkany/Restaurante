package br.com.ezzysoft.restaurante.entidade;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by christian on 22/10/17.
 */
public class PessoaJuridica extends Pessoa implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "id")
        private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
