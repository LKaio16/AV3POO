package PokedexP;

public class PokemonNaoEncontradoException extends Exception{
    public PokemonNaoEncontradoException() {
        super("Nenhum Pokémon selecionado ou Pokémon não encontrado.");
    }
}
