public class PokemonTipoAgua extends Pokemon {

    public PokemonTipoAgua(String descricao, String nome, String tipo, int level) {
        super(descricao, nome, tipo, level);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " Usou um Ataque de AGUA.");
    }

    @Override
    public void defender() {
        super.defender();
    }
}
