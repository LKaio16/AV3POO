import java.util.Scanner;

public class Menu {
    Pokedex pokedex = new Pokedex();
    Scanner scan = new Scanner(System.in);
    Pokemon pokemonSelecionado = null;

    public void iniciaMenu() {

        int opcaoSelecionada = 0;

        System.out.println("Bem Vindo a Pokedex!!!");
        System.out.println("O que deseja fazer?");
        System.out.println("-----------------------------------");

        while (opcaoSelecionada != 10) {
            System.out.println("-----------------------------------");
            System.out.println("1 - Adicionar Pokemon ");
            System.out.println("2 - Listar Pokemons ");
            System.out.println("3 - Selecionar Pokemon");

            if (pokemonSelecionado != null) {
                System.out.println("-------- Usar " + pokemonSelecionado.getNome() + "---------");
                System.out.println("4 - Excluir da Pokedex");
                System.out.println("5 - Ataque");
                System.out.println("6 - Teleportar");
                System.out.println("7 - Defesa");
                System.out.println("8 - Remover seleção");
                System.out.println("---------------------------------------------------------");
            }

            System.out.println("10 - Sair");

            opcaoSelecionada = scan.nextInt();
            switch (opcaoSelecionada) {
                case 1:
                    pokedex.adicionarPokemon();
                    break;
                case 2:
                    pokedex.listarPokemons();
                    break;
                case 3:
                    Scanner scanNome = new Scanner(System.in);
                    System.out.println("Digite o nome do Pokemon Desejado:");
                    pokemonSelecionado = pokedex.buscarPokemonPorNome(scanNome.nextLine());
                    if (pokemonSelecionado == null) {
                        System.out.println("Nenhum Pokemon encontrado.");
                    }
                    break;
                case 4:
                    pokedex.removerPokemon(pokemonSelecionado);
                    pokemonSelecionado = null;
                    System.out.println("Pokemon Removido com Sucesso!");
                    break;
                case 5:
                    Pokemon pokemon = pokemonSelecionado;
                    pokemon.atacar();
                    break;
                case 6:
                    if (pokemonSelecionado instanceof PokemonTipoPsiquico) {
                        PokemonTipoPsiquico pokemonTipoPsiquico = (PokemonTipoPsiquico) pokemonSelecionado;
                        pokemonTipoPsiquico.teleportar(); // Método específico de pokemons Psiquicos!!
                    } else {
                        System.out.println(pokemonSelecionado.getNome() + " não é um Pokemon Psiquico e não pode teleportar.");
                    }

                    break;
                case 7:
                    pokemonSelecionado.defender();
                    break;
                case 8:
                    pokemonSelecionado = null;
                    break;
                case 10:
                    System.out.println("Obrigado por ultilizar?");
                    break;
                default:
                    System.out.println("Opção invalida");

            }
        }
    }
}
