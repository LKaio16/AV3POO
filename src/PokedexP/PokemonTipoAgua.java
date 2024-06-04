package PokedexP;

public class PokemonTipoAgua extends Pokemon {
    public PokemonTipoAgua(String descricao, String nome, String tipo, int level) {
        super(descricao, nome, tipo, level);
    }

    @Override
    public void atacar() {
        try {
            System.out.println(getNome() + " Usou um Ataque de AGUA.");
        }catch (NullPointerException e){
            System.out.println("NENHUM POKEMON SELECIONADO");
        }
    }

    @Override
    public void defender() {
        super.defender();
    }
}
