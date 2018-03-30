/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.maprelentidades.cenario1.model;

import br.edu.ifpb.maprelentidades.cenario1.model.enums.Genero;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author romulo
 */
@Entity
public class Filme implements Serializable {

    @Id
    @GeneratedValue
    private int codigo;
    @Column(nullable = false, unique = true, length = 50)
    private String titulo;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Column(nullable = false)
    private String diretor;
    @Column(nullable = false)
    private int ano;

    @ManyToMany
    private List<Ator> atoresEstrelados;

    @OneToMany
    private List<ParRomantico> paresRomanticos;

    @ManyToOne
    private Participacao participacao;

    public Filme() {

    }

    public Filme(String titulo, Genero genero, String diretor, int ano,
            Participacao participacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
        this.ano = ano;
        this.participacao = participacao;
        this.atoresEstrelados = new ArrayList<>();
        this.paresRomanticos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Ator> getAtoresEstrelados() {
        return atoresEstrelados;
    }

    public void setAtoresEstrelados(List<Ator> atores) {
        this.atoresEstrelados = atores;
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

    public boolean addAtorEstrelado(Ator ator) {
        return this.atoresEstrelados.add(ator);
    }

    public boolean remAtorEstrelado(Ator ator) {
        return this.atoresEstrelados.remove(ator);
    }

    public boolean addParRomantico(ParRomantico parRomantico) {
        return this.paresRomanticos.add(parRomantico);
    }

    public boolean remParRomantico(ParRomantico parRomantico) {
        return this.paresRomanticos.remove(parRomantico);
    }

}
