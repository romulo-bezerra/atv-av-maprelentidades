package br.edu.ifpb.maprelentidades.cenario2.model;

import br.edu.ifpb.maprelentidades.cenario2.model.Navio;
import br.edu.ifpb.maprelentidades.cenario2.model.enums.Pais;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-30T17:06:57")
@StaticMetamodel(Comandante.class)
public class Comandante_ { 

    public static volatile SingularAttribute<Comandante, Integer> idComandante;
    public static volatile ListAttribute<Comandante, Navio> navios;
    public static volatile SingularAttribute<Comandante, String> nome;
    public static volatile SingularAttribute<Comandante, Pais> pais;

}