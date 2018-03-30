package br.edu.ifpb.maprelentidades.dao;

import br.edu.ifpb.maprelentidades.interfaces.DaoInserir;
import br.edu.ifpb.maprelentidades.model.Carga;
import br.edu.ifpb.maprelentidades.model.Comandante;
import br.edu.ifpb.maprelentidades.model.Navio;
import br.edu.ifpb.maprelentidades.model.Produto;
import br.edu.ifpb.maprelentidades.model.Transporte;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jozimar
 */
@Stateless
@Local(DaoInserir.class)
public class InserirDao implements DaoInserir {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;

    @Override
    public void cadastrarCarga(Carga carga) {
        entityManager.persist(carga);
    }

    @Override
    public void cadastrarComandante(Comandante comandante) {
        entityManager.persist(comandante);
    }

    @Override
    public void cadastrarNavio(Navio navio) {
        entityManager.persist(navio);
    }

    @Override
    public void cadastrarProduto(Produto produto) {
        entityManager.persist(produto);
    }

    @Override
    public void cadastrarTransporte(Transporte transporte) {
        entityManager.persist(transporte);
    }
}
