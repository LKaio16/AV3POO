public class PokemonTipoNormal extends Pokemon{

    public PokemonTipoNormal(String nome, String tipo, int level) {
        super(nome, tipo, level);
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
