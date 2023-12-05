import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pokedex extends PokemonDefineTipo implements PokedexAcoes {

    public List<Pokemon> pokemons;

    public Pokedex() {
        pokemons = new ArrayList<>();
    }

    @Override
    public void adicionarPokemon() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Nome do Pokemon:");
        String nome = scan.nextLine();

        System.out.println("Digite o level do Pokemon");
        int level = scan.nextInt();
        scan.nextLine();



        switch(super.escolheTipo()) {
            case "Normal":
                PokemonTipoNormal pokemonTipoNormal = new PokemonTipoNormal(nome, "Normal", level);
                adicionarPokemon(pokemonTipoNormal);
                break;
            case "Fogo":
                PokemonTipoFogo pokemonTipoFogo = new PokemonTipoFogo(nome, "Fogo", level);
                adicionarPokemon(pokemonTipoFogo);
                break;
            case "Agua":
                PokemonTipoAgua pokemonTipoAgua = new PokemonTipoAgua(nome, "Agua", level);
                adicionarPokemon(pokemonTipoAgua);
                break;
            case "Grama":
                PokemonTipoGrama pokemonTipoGrama = new PokemonTipoGrama(nome, "Grama", level);
                adicionarPokemon(pokemonTipoGrama);
                break;
            case "Eletrico":
                PokemonTipoEletrico pokemonTipoEletrico = new PokemonTipoEletrico(nome, "Eletrico", level);
                adicionarPokemon(pokemonTipoEletrico);
                break;
            case "Outro":
                PokemonTipoOutro pokemonTipoOutro = new PokemonTipoOutro(nome, "Outro", level);
                adicionarPokemon(pokemonTipoOutro);
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
                break;
        }
    }

    public void adicionarPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }


    @Override
    public void removerPokemon(Pokemon pokemon) {
        pokemons.remove(pokemon);
    }

    @Override
    public Pokemon buscarPokemonPorNome(String nome) {
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getNome().equalsIgnoreCase(nome)) {
                return pokemon;
            }
        }
        return null;
    }

    @Override
    public void listarPokemons() {
        int contador = 1;

        for (Pokemon pokemon : pokemons) {
            System.out.println("Pokemon" + contador + "{" +
                    "nome='" + pokemon.getNome() + '\'' +
                    ", tipo='" + pokemon.getTipo() + '\'' +
                    ", level=" + pokemon.getLevel() +
                    '}');
            System.out.println("---------------------------------------------------------");
            contador++;
        }
    }


}