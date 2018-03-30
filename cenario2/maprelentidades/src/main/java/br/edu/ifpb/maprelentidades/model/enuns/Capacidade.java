package br.edu.ifpb.maprelentidades.model.enuns;

/**
 *
 * @author jozimar
 */
public enum Capacidade {

    PEQUENOPORTE("Pequeno Porte"),
    MEDIOPORTE("Médio Porte"),
    GRANDEPORTE("Grande Porte");

    private final String label;

    private Capacidade(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
