package br.edu.ifpb.maprelentidades.cenario2.model;

import br.edu.ifpb.maprelentidades.cenario2.model.Produto;
import br.edu.ifpb.maprelentidades.cenario2.model.Transporte;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-30T15:37:10")
@StaticMetamodel(Carga.class)
public class Carga_ { 

    public static volatile ListAttribute<Carga, Produto> produtos;
    public static volatile SingularAttribute<Carga, Transporte> transporte;
    public static volatile SingularAttribute<Carga, String> origem;
    public static volatile SingularAttribute<Carga, String> destino;
    public static volatile SingularAttribute<Carga, Integer> codCarga;

}