public class PokemonTipoOutro extends Pokemon {
    public PokemonTipoOutro(String nome, String tipo, int level) {
        super(nome, tipo, level);
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
