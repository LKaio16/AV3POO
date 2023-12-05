public class PokemonTipoPsiquico extends Pokemon {


    public PokemonTipoPsiquico(String descricao, String nome, String tipo, int level) {
        super(descricao, nome, tipo, level);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " usou um ataque PSIQUICO");
    }

    public void teleportar(){
        System.out.println(getNome() + " teleportou!");
    }

    @Override
    public void defender() {
        super.defender();
    }
}
