package br.edu.ifpb.maprelentidades.cenario2.interfaces;

import br.edu.ifpb.maprelentidades.cenario2.model.Carga;
import br.edu.ifpb.maprelentidades.cenario2.model.Comandante;
import br.edu.ifpb.maprelentidades.cenario2.model.Navio;
import br.edu.ifpb.maprelentidades.cenario2.model.Produto;
import br.edu.ifpb.maprelentidades.cenario2.model.Transporte;

/**
 *
 * @author jozimar
 */
public interface DaoInserir {

    public void cadastrarCarga(Carga carga);

    public void cadastrarComandante(Comandante comandante);

    public void cadastrarNavio(Navio navio);

    public void cadastrarProduto(Produto produto);

    public void cadastrarTransporte(Transporte transporte);
}
