package br.edu.ifpb.maprelentidades.interfaces;

import br.edu.ifpb.maprelentidades.model.Carga;
import br.edu.ifpb.maprelentidades.model.Comandante;
import br.edu.ifpb.maprelentidades.model.Navio;
import br.edu.ifpb.maprelentidades.model.Produto;
import br.edu.ifpb.maprelentidades.model.Transporte;

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
