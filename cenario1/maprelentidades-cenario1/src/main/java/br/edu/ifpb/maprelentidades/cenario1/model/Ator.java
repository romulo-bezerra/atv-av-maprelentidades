/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.maprelentidades.cenario1.model;

import br.edu.ifpb.maprelentidades.cenario1.model.enums.Nacionalidade;
import br.edu.ifpb.maprelentidades.cenario1.model.enums.Sexo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class Ator implements Serializable {

    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Nacionalidade nacionalidade;

    @ManyToMany
    @JoinColumn(nullable = false)
    private List<Filme> filmesEstrelantes;

    @ManyToMany
    private List<ParRomantico> paresRomanticos;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Participacao participacao;

    public Ator() {

    }

    public Ator(String nome, Sexo sexo, Nacionalidade nacionalidade,
            Participacao participacao) {
        this.nome = nome;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
        this.participacao = participacao;
        this.filmesEstrelantes = new ArrayList<>();
        this.paresRomanticos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<Filme> getFilmesEstrelantes() {
        return filmesEstrelantes;
    }

    public void setFilmesEstrelantes(List<Filme> filmes) {
        this.filmesEstrelantes = filmes;
    }

    public List<ParRomantico> getParesRomanticos() {
        return paresRomanticos;
    }

    public void setParesRomanticos(List<ParRomantico> paresRomanticos) {
        this.paresRomanticos = paresRomanticos;
    }

    public Participacao getParticipacao() {
        return participacao;
    }

    public void setParticipacao(Participacao participacao) {
        this.participacao = participacao;
    }

    public boolean addFilmeEstrelante(Filme filme) {
        return this.filmesEstrelantes.add(filme);
    }

    public boolean remFilmeEstrelante(Filme filme) {
        return this.filmesEstrelantes.remove(filme);
    }

    public boolean addParRomantico(ParRomantico parRomantico) {
        return this.paresRomanticos.add(parRomantico);
    }

    public boolean remParRomantico(ParRomantico parRomantico) {
        return this.paresRomanticos.remove(parRomantico);
    }

}
