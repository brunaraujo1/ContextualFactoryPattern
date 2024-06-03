// Autora: Bruna Araujo
// Data: 03/06/2024

import java.util.Scanner;

public class Menu {
    public static void exibirMenu() {
        System.out.println("Escolha o tipo de componente UI:");
        System.out.println("1. Botão");
        System.out.println("2. Caixa de Texto");
        System.out.print("Opção: ");
    }

    public static int lerOpcao() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
