public class PokemonTipoEletrico extends Pokemon {


    public PokemonTipoEletrico(String descricao, String nome, String tipo, int level) {
        super(descricao, nome, tipo, level);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " Usou um Ataque ELETRICO.");
    }

    @Override
    public void defender() {
        super.defender();
    }
}
