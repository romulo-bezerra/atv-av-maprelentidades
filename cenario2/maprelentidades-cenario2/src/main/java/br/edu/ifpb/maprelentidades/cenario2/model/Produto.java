package br.edu.ifpb.maprelentidades.cenario2.model;

import br.edu.ifpb.maprelentidades.cenario2.model.enums.Categoria;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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

    @ManyToMany
    private List<Carga> cargas;

    public Produto() {
    }

    public Produto(Categoria categoria, String nome) {
        this.categoria = categoria;
        this.nome = nome;
        this.cargas = new ArrayList<>();
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

    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(List<Carga> cargas) {
        this.cargas = cargas;
    }

    public boolean addCargas(Carga carga) {
        return cargas.add(carga);
    }
}
