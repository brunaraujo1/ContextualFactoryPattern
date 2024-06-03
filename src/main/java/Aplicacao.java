// Autora: Bruna Araujo
// Data: 03/06/2024

public class Aplicacao {
    public static void main(String[] args) {
        Contexto contexto = new Contexto("ingles", "US");
        ComponenteUI botao = FabricaComponenteUI.criarBotao(contexto);
        botao.renderizar();

        contexto = new Contexto("espanhol", "ES");
        botao = FabricaComponenteUI.criarBotao(contexto);
        botao.renderizar();

        contexto = new Contexto("frances", "FR");
        botao = FabricaComponenteUI.criarBotao(contexto);
        botao.renderizar();
    }
}

