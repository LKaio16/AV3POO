public class PokemonTipoFogo extends Pokemon {


    public PokemonTipoFogo(String descricao, String nome, String tipo, int level) {
        super(descricao, nome, tipo, level);
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
