public class PokemonTipoGrama extends Pokemon{
    public PokemonTipoGrama(String nome, String tipo, int level) {
        super(nome, tipo, level);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " Usou um Ataque de GRAMA.");
    }

    @Override
    public void defender() {
        super.defender();
    }
}
