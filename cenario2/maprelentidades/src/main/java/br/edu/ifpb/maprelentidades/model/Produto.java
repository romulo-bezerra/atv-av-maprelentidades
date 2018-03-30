package br.edu.ifpb.maprelentidades.model;

import br.edu.ifpb.maprelentidades.model.enuns.Categoria;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author jozimar
 */
@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue
    private int codProduto;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @Column(nullable = false, length = 80)
    private String nome;

    public Produto() {
    }

    public Produto(Categoria categoria, String nome) {
        this.categoria = categoria;
        this.nome = nome;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
