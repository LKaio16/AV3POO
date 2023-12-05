import java.util.Scanner;

public abstract class PokemonDefineTipo {
    private String tipo;

    public String escolheTipo() {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Qual é o tipo do Pokemon que deseja adicionar?");
            System.out.println("1 - Normal");
            System.out.println("2 - Fogo");
            System.out.println("3 - Água");
            System.out.println("4 - Grama");
            System.out.println("5 - Elétrico");
            System.out.println("6 - Outro");

            System.out.print("Digite o número correspondente ao tipo: ");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    return "Normal";
                case 2:
                    return "Fogo";
                case 3:
                    return "Agua";
                case 4:
                    return "Grama";
                case 5:
                    return "Eletrico";
                case 6:
                    return "Outro";
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (escolha < 1 || escolha > 6);
        return "Tipo desconhecido";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
