public abstract class PokemonCaracteristicas {
    private String descricao;

    public PokemonCaracteristicas(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "PokemonCaracteristicas{" +
                "descricao='" + descricao + '\'' +
                '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
