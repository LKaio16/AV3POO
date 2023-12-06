package PokedexP;

public class PokemonJaExistenteException extends Exception {
    public PokemonJaExistenteException(String nome) {
        super("Um Pokemon com o nome '" + nome + "' já existe na Pokedex.");
    }
}