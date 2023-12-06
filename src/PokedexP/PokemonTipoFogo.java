package PokedexP;

public class PokemonTipoFogo extends Pokemon {


    public PokemonTipoFogo(String descricao, String nome, String tipo, int level) {
        super(descricao, nome, tipo, level);
    }

    @Override
    public void atacar() {
        try {
            System.out.println(getNome() + " Usou um Ataque de FOGO.");
        }catch (NullPointerException e){
            System.out.println("NENHUM POKEMON SELECIONADO");
        }
    }

    @Override
    public void defender() {
        super.defender();
    }
}
