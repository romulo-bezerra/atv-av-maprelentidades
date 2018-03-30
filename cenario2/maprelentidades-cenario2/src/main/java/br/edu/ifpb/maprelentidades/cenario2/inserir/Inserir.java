package br.edu.ifpb.maprelentidades.cenario2.inserir;

import br.edu.ifpb.maprelentidades.cenario2.interfaces.DaoInserir;
import br.edu.ifpb.maprelentidades.cenario2.model.Carga;
import br.edu.ifpb.maprelentidades.cenario2.model.Comandante;
import br.edu.ifpb.maprelentidades.cenario2.model.Navio;
import br.edu.ifpb.maprelentidades.cenario2.model.Produto;
import br.edu.ifpb.maprelentidades.cenario2.model.Transporte;
import br.edu.ifpb.maprelentidades.cenario2.model.enuns.Capacidade;
import br.edu.ifpb.maprelentidades.cenario2.model.enuns.Categoria;
import br.edu.ifpb.maprelentidades.cenario2.model.enuns.Pais;
import java.time.LocalDate;
import java.time.Month;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author jozimar
 */
@Singleton
@Startup
public class Inserir {

    private Carga carga;
    private Produto produto;
    private Produto produto2;
    private Comandante comandante;
    private Transporte transporte;
    private Navio navio;

    @Inject
    private DaoInserir daoInserir;

    @PostConstruct
    public void init() {
        carga = new Carga("Cajazeiras", "João Pessoa");

        produto = new Produto(Categoria.ELETRONICO, "Celular");
        produto2 = new Produto(Categoria.ELETRODOMESTICO, "Geladeira");

        comandante = new Comandante("Capitão Jack Sparrow", Pais.BRASIL);

        transporte = new Transporte(LocalDate.of(2017, Month.OCTOBER, 23), 2500D);

        navio = new Navio("Titanic", Capacidade.GRANDEPORTE, Pais.BRASIL);

        navio.setComandante(comandante);
        navio.setTransporte(transporte);

        comandante.addNavios(navio);
        transporte.setNavio(navio);
        transporte.setCarga(carga);

        carga.setTransporte(transporte);
        carga.addProdutos(produto);
        carga.addProdutos(produto2);

        daoInserir.cadastrarCarga(carga);
        daoInserir.cadastrarProduto(produto);
        daoInserir.cadastrarProduto(produto2);
        daoInserir.cadastrarComandante(comandante);
        daoInserir.cadastrarNavio(navio);
        daoInserir.cadastrarTransporte(transporte);

    }
}
