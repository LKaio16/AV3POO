public class PokemonTipoNormal extends Pokemon{

    public PokemonTipoNormal(String descricao, String nome, String tipo, int level) {
        super(descricao, nome, tipo, level);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " Usou um Ataque NORMAL.");
    }

    @Override
    public void defender() {
        super.defender();
    }
}
