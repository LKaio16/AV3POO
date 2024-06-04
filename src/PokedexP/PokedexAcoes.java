package PokedexP;

public interface PokedexAcoes {
    void adicionarPokemon() throws PokemonJaExistenteException;
    void removerPokemon(Pokemon pokemon);
    Pokemon buscarPokemonPorNome(String nome);
    void listarPokemons();
}

