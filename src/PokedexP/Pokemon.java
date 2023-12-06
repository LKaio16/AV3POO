package PokedexP;

public abstract class Pokemon extends PokemonCaracteristicas implements PokemonAcoes {
    private String nome;
    private String tipo;
    private int level;

    public Pokemon(String descricao, String nome, String tipo, int level) {
        super(descricao);
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
    }

    @Override
    public void atacar() throws NullPointerException, PokemonNaoEncontradoException{
        try {
            System.out.println(this.nome + " atacou!");System.out.println(this.nome + " atacou!");
        }catch (NullPointerException e){
            throw new PokemonNaoEncontradoException();
        }
    }

    @Override
    public void defender() throws NullPointerException{
        System.out.println(this.nome + " defendeu!");
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", level=" + level +
                '}';
    }

    public String getNome() throws NullPointerException {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
