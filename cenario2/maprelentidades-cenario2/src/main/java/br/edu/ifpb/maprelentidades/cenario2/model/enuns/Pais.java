package br.edu.ifpb.maprelentidades.cenario2.model.enuns;

/**
 *
 * @author jozimar
 */
public enum Pais {

    BRASIL("Brasil"),
    CHINA("China"),
    INGLATERRA("Inglaterra"),
    ARGENTINA("Argentina"),
    JAPAO("Japão");

    private final String label;

    private Pais(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
