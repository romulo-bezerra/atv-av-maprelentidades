package br.edu.ifpb.maprelentidades.cenario2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author jozimar
 */
@Entity
public class Carga implements Serializable {

    @Id
    @GeneratedValue
    private int codCarga;

    @Column(nullable = false, length = 80)
    private String origem;

    @Column(nullable = false, length = 80)
    private String destino;

    @OneToOne
    private Transporte transporte;

    @OneToMany
    private List<Produto> produtos;

    public Carga() {
    }

    public Carga(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        this.produtos = new ArrayList<>();
    }

    public int getCodCarga() {
        return codCarga;
    }

    public void setCodCarga(int codCarga) {
        this.codCarga = codCarga;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public boolean addProdutos(Produto produto) {
        return produtos.add(produto);
    }
}
