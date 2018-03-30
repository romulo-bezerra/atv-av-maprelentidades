package br.edu.ifpb.maprelentidades.cenario2.model;

import br.edu.ifpb.maprelentidades.cenario2.model.enums.Pais;
import br.edu.ifpb.maprelentidades.cenario2.model.enums.Capacidade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author jozimar
 */
@Entity
public class Navio implements Serializable {

    @Id
    @GeneratedValue
    private int codNavio;

    @Column(nullable = false, length = 80)
    private String nome;

    @Enumerated(EnumType.STRING)
    private Capacidade capacidade;

    @Enumerated(EnumType.STRING)
    private Pais pais;

    @OneToMany
    private List<Transporte> transportes;

    @ManyToOne
    private Comandante comandante;

    public Navio() {
    }

    public Navio(String nome, Capacidade capacidade, Pais pais) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.pais = pais;
        this.transportes = new ArrayList<>();
    }

    public int getCodNavio() {
        return codNavio;
    }

    public void setCodNavio(int codNavio) {
        this.codNavio = codNavio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Capacidade getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Capacidade capacidade) {
        this.capacidade = capacidade;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Transporte> getTransportes() {
        return transportes;
    }

    public void setTransportes(List<Transporte> transportes) {
        this.transportes = transportes;
    }

    public Comandante getComandante() {
        return comandante;
    }

    public void setComandante(Comandante comandante) {
        this.comandante = comandante;
    }

    public boolean addTrasportes(Transporte transporte) {
        return transportes.add(transporte);
    }
}
