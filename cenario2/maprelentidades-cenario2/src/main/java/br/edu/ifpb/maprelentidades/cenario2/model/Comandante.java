package br.edu.ifpb.maprelentidades.cenario2.model;

import br.edu.ifpb.maprelentidades.cenario2.model.enuns.Pais;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author jozimar
 */
@Entity
public class Comandante implements Serializable {

    @Id
    @GeneratedValue
    private int idComandante;

    @Column(nullable = false, length = 80)
    private String nome;

    @Enumerated(EnumType.STRING)
    private Pais pais;

    @OneToMany(mappedBy = "comandante")
    private List<Navio> navios;

    public Comandante() {
    }

    public Comandante(String nome, Pais pais) {
        this.nome = nome;
        this.pais = pais;
        this.navios = new ArrayList<>();
    }

    public int getIdComandante() {
        return idComandante;
    }

    public void setIdComandante(int idComandante) {
        this.idComandante = idComandante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Navio> getNavios() {
        return navios;
    }

    public void setNavios(List<Navio> navios) {
        this.navios = navios;
    }

    public boolean addNavios(Navio navio) {
        return navios.add(navio);
    }
}
