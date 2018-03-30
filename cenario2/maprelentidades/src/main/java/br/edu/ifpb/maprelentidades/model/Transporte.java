package br.edu.ifpb.maprelentidades.model;

import br.edu.ifpb.maprelentidades.util.LocalDateConverter;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Convert;
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
public class Transporte implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Convert(converter = LocalDateConverter.class)
    private LocalDate data;

    @Column(nullable = false)
    private double valor;

    @OneToOne
    private Carga carga;

    @OneToMany
    private List<Produto> produtos;

    @OneToOne
    private Navio navio;

    public Transporte() {
    }

    public Transporte(LocalDate data, double valor, Carga carga) {
        this.data = data;
        this.valor = valor;
        this.carga = carga;
        this.produtos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Navio getNavio() {
        return navio;
    }

    public void setNavio(Navio navio) {
        this.navio = navio;
    }

    public boolean addProdutos(Produto produto) {
        return produtos.add(produto);
    }

}
