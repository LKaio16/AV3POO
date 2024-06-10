package PokedexP;

public class PokemonTipoAgua extends Pokemon {
    private static final long serialVersionUID = 8680538010825438246L;
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

}
