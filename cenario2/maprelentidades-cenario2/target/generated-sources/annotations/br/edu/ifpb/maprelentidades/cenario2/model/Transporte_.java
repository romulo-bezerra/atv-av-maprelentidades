package br.edu.ifpb.maprelentidades.cenario2.model;

import br.edu.ifpb.maprelentidades.cenario2.model.Carga;
import br.edu.ifpb.maprelentidades.cenario2.model.Navio;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-30T15:37:10")
@StaticMetamodel(Transporte.class)
public class Transporte_ { 

    public static volatile SingularAttribute<Transporte, Navio> navio;
    public static volatile SingularAttribute<Transporte, LocalDate> data;
    public static volatile SingularAttribute<Transporte, Double> valor;
    public static volatile SingularAttribute<Transporte, Integer> id;
    public static volatile SingularAttribute<Transporte, Carga> carga;

}