public class PokemonTipoFogo extends Pokemon {
    public PokemonTipoFogo(String nome, String tipo, int level) {
        super(nome, tipo, level);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " Usou um Ataque de FOGO.");
    }

    @Override
    public void defender() {
        super.defender();
    }
}
