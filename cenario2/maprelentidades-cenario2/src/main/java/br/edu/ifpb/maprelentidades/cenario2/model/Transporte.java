package br.edu.ifpb.maprelentidades.cenario2.model;

import br.edu.ifpb.maprelentidades.cenario2.util.LocalDateConverter;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author jozimar
 */
@Entity
public class Transporte implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Convert(converter = LocalDateConverter.class)
    private LocalDate data;

    @Column(nullable = false)
    private double valor;

    @OneToOne
    private Carga carga;

    @OneToOne
    private Navio navio;

    public Transporte() {
    }

    public Transporte(LocalDate data, double valor) {
        this.data = data;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    public Navio getNavio() {
        return navio;
    }

    public void setNavio(Navio navio) {
        this.navio = navio;
    }
}
