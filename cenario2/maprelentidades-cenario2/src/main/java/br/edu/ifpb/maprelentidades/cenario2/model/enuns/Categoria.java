package br.edu.ifpb.maprelentidades.cenario2.model.enuns;

/**
 *
 * @author jozimar
 */
public enum Categoria {

    ELETRONICO("Eletrônico"),
    ALIMENTICIO("Alimenticio"),
    AUTOMOVEL("Automóvel"),
    ELETRODOMESTICO("Eletrodoméstico"),
    MOVEIS("MOVEIS");

    private final String label;

    private Categoria(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
