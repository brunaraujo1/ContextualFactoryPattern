// Autora: Bruna Araujo
// Data: 03/06/2024

public class FabricaComponenteUI {
    public static ComponenteUI criarBotao(Contexto contexto) {
        String idioma = contexto.getIdioma();

        switch (idioma.toLowerCase()) {
            case "ingles":
                return new BotaoIngles();
            case "espanhol":
                return new BotaoEspanhol();
            case "frances":
                return new BotaoFrances();
            default:
                throw new IllegalArgumentException("Idioma não suportado: " + idioma);
        }
    }
}
