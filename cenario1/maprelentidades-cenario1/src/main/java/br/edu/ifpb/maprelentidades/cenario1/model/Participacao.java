/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.maprelentidades.cenario1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author romulo
 */
@Entity
public class Participacao implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private int nota;

    @OneToMany
    private List<Ator> atores;
    @OneToMany
    private List<Filme> filmes;

    public Participacao() {
        this.atores = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }

    public Participacao(int nota) {
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public boolean addAtorParticipacao(Ator ator) {
        return this.atores.add(ator);
    }

    public boolean remAtorParticipacao(Ator ator) {
        return this.atores.remove(ator);
    }

    public boolean addFilmeParticipacao(Filme filme) {
        return this.filmes.add(filme);
    }

    public boolean remFilmeParticipacao(Filme filme) {
        return this.filmes.remove(filme);
    }

}
