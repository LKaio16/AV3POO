public class PokemonTipoGrama extends Pokemon{


    public PokemonTipoGrama(String descricao, String nome, String tipo, int level) {
        super(descricao, nome, tipo, level);
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
