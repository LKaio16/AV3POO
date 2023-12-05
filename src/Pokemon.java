public abstract class Pokemon implements PokemonAcoes{
    private String nome;
    private String tipo;
    private int level;

    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " atacou!");
    }

    @Override
    public void defender() {
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

    public String getNome() {
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
