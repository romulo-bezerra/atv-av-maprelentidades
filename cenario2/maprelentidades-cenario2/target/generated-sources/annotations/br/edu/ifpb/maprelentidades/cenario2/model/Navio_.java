package br.edu.ifpb.maprelentidades.cenario2.model;

import br.edu.ifpb.maprelentidades.cenario2.model.Comandante;
import br.edu.ifpb.maprelentidades.cenario2.model.Transporte;
import br.edu.ifpb.maprelentidades.cenario2.model.enums.Capacidade;
import br.edu.ifpb.maprelentidades.cenario2.model.enums.Pais;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-30T15:37:10")
@StaticMetamodel(Navio.class)
public class Navio_ { 

    public static volatile SingularAttribute<Navio, Integer> codNavio;
    public static volatile SingularAttribute<Navio, Transporte> transporte;
    public static volatile SingularAttribute<Navio, Comandante> comandante;
    public static volatile SingularAttribute<Navio, Capacidade> capacidade;
    public static volatile SingularAttribute<Navio, String> nome;
    public static volatile SingularAttribute<Navio, Pais> pais;

}