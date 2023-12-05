public class PokemonTipoOutro extends Pokemon {

    public PokemonTipoOutro(String descricao, String nome, String tipo, int level) {
        super(descricao, nome, tipo, level);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " Usou um Ataque QUALQUER.");
    }

    @Override
    public void defender() {
        super.defender();
    }
}
