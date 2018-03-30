package br.edu.ifpb.maprelentidades.cenario2.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author jozimar
 */
@Entity
public class Carga implements Serializable {

    @Id
    @GeneratedValue
    private int codCarga;

    @Column(nullable = false, length = 80)
    private String origem;

    @Column(nullable = false, length = 80)
    private String destino;

    public Carga() {
    }

    public Carga(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public int getCodCarga() {
        return codCarga;
    }

    public void setCodCarga(int codCarga) {
        this.codCarga = codCarga;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
