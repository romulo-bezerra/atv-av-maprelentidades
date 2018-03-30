/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.maprelentidades.cenario1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author romulo
 */
@Entity
public class ParRomantico implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @ManyToMany
    private List<Ator> atoresParRomantico;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Filme filme;

    public ParRomantico() {

    }

    public ParRomantico(Filme filme) {
        this.filme = filme;
        this.atoresParRomantico = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Ator> getAtoresParRomantico() {
        return atoresParRomantico;
    }

    public void setAtoresParRomantico(List<Ator> atorParRomantico) {
        this.atoresParRomantico = atorParRomantico;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public boolean addAtorParRomantico(Ator ator) {
        return this.atoresParRomantico.add(ator);
    }

    public boolean remAtorParRomantico(Ator ator) {
        return this.atoresParRomantico.remove(ator);
    }

}
