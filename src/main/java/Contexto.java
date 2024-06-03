// Autora: Bruna Araujo
// Data: 03/06/2024

public class Contexto {
    private String idioma;
    private String regiao;

    public Contexto(String idioma, String regiao) {
        this.idioma = idioma;
        this.regiao = regiao;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getRegiao() {
        return regiao;
    }
}
