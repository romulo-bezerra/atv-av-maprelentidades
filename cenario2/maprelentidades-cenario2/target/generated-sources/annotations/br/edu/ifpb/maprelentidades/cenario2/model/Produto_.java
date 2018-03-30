package br.edu.ifpb.maprelentidades.cenario2.model;

import br.edu.ifpb.maprelentidades.cenario2.model.Carga;
import br.edu.ifpb.maprelentidades.cenario2.model.enums.Categoria;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-30T19:42:38")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Categoria> categoria;
    public static volatile ListAttribute<Produto, Carga> cargas;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile SingularAttribute<Produto, Integer> codProduto;

}