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
public class Evento implements Serializable {

    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(nullable = false, length = 100)
    private String local;
    @Column(nullable = false)
    private int ano;

    @OneToMany
    private List<Participacao> participacoes;

    public Evento() {

    }

    public Evento(String nome, String local, int ano) {
        this.nome = nome;
        this.local = local;
        this.ano = ano;
        this.participacoes = new ArrayList<>();
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Participacao> getParticipacoes() {
        return participacoes;
    }

    public void setParticipacoes(List<Participacao> participacoes) {
        this.participacoes = participacoes;
    }

    public boolean addParticipacao(Participacao participacao) {
        return this.participacoes.add(participacao);
    }

    public boolean remParticipacao(Participacao participacao) {
        return this.participacoes.remove(participacao);
    }

}
