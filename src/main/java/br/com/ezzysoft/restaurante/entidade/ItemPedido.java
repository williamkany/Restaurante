package br.com.ezzysoft.restaurante.entidade;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author Christian Medeiros <christian.souza@gmail.com>
 */
@Entity
@Table(name = "itensPedido")
@NamedQueries({
        @NamedQuery(name = "ItemPedido.findAll", query = "SELECT o FROM ItemPedido o"),
        @NamedQuery(name = "ItemPedido.findById", query = "SELECT o FROM ItemPedido o WHERE o.id = :id"),
        @NamedQuery(name = "ItemPedido.findByPedido", query = "SELECT o FROM ItemPedido o WHERE o.pedido.id = :pedidoId")
})
public class ItemPedido implements Serializable {

    public static final String ITENSPORPEDIDO = "ItemPedido.findByPedido";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "quantidade")
    private Double quantidade;
    //---------------- Produto ----------------
    @ManyToOne(optional = false)
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;
    //---------------- Pedido ----------------
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}
