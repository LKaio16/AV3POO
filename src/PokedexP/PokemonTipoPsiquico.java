package PokedexP;

public class PokemonTipoPsiquico extends Pokemon {


    public PokemonTipoPsiquico(String descricao, String nome, String tipo, int level) {
        super(descricao, nome, tipo, level);
    }

    @Override
    public void atacar() {
        try {
            System.out.println(getNome() + " Usou um Ataque PSIQUICO.");
        }catch (NullPointerException e){
            System.out.println("NENHUM POKEMON SELECIONADO");
        }
    }

    public void teleportar(){
        try {
            System.out.println(getNome() + " teleportou!");
        }catch (NullPointerException e){
            System.out.println("NENHUM POKEMON PISIQUICO ENCONTRADO");
        }
    }

    @Override
    public void defender() {
        super.defender();
    }
}
