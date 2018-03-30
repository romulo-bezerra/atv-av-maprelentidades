/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.maprelentidades.cenario1.main;

import br.edu.ifpb.maprelentidades.cenario1.model.Ator;
import br.edu.ifpb.maprelentidades.cenario1.model.Evento;
import br.edu.ifpb.maprelentidades.cenario1.model.Filme;
import br.edu.ifpb.maprelentidades.cenario1.model.ParRomantico;
import br.edu.ifpb.maprelentidades.cenario1.model.Participacao;
import br.edu.ifpb.maprelentidades.cenario1.model.enums.Genero;
import br.edu.ifpb.maprelentidades.cenario1.model.enums.Nacionalidade;
import br.edu.ifpb.maprelentidades.cenario1.model.enums.Sexo;

/**
 *
 * @author romulo
 */
public class App {

    public static void main(String[] args) {

        Evento evento1 = new Evento("Evento 1", "Local Evento1", 2018);

        Participacao participacao1 = new Participacao(8, evento1);

        evento1.setParticipacao(participacao1);

        Filme filme1 = new Filme("Filme A", Genero.ACAO,
                "Diretor A", 2018, participacao1);

        Ator ator1 = new Ator("Ator 1", Sexo.MASCULINO,
                Nacionalidade.BRASILEIRO, participacao1);
        Ator ator2 = new Ator("Ator 2", Sexo.FEMININO,
                Nacionalidade.BRASILEIRO, participacao1);
        Ator ator3 = new Ator("Ator 3", Sexo.FEMININO,
                Nacionalidade.BRASILEIRO, participacao1);

        ParRomantico parRomantico1 = new ParRomantico(filme1);
        parRomantico1.addAtorParRomantico(ator3);
        parRomantico1.addAtorParRomantico(ator2);

        ator1.addParRomantico(parRomantico1);

        filme1.addAtorEstrelado(ator3);
        filme1.addAtorEstrelado(ator2);
        filme1.addAtorEstrelado(ator1);

        filme1.addParRomantico(parRomantico1);

        System.out.println("Filme: " + filme1);
    }

}
