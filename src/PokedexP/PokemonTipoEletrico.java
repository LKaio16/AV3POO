package PokedexP;

public class PokemonTipoEletrico extends Pokemon {
    private static final long serialVersionUID = 8680538010825438246L;
    public PokemonTipoEletrico(String descricao, String nome, String tipo, int level) {
        super(descricao, nome, tipo, level);
    }

    @Override
    public void atacar() {
        try {
            System.out.println(getNome() + " Usou um Ataque de ELETRICO.");
        }catch (NullPointerException e){
            System.out.println("NENHUM POKEMON SELECIONADO");
        }
    }

    @Override
    public void defender() {
        super.defender();
    }
}
