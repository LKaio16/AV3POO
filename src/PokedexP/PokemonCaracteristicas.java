package PokedexP;

import java.util.HashMap;
import java.util.Map;

public abstract class PokemonCaracteristicas {
    private String descricao;
    private Map<String, String> curiosidades;

    public PokemonCaracteristicas(String descricao) {
        this.descricao = descricao;
        this.curiosidades = new HashMap<>();
    }

    public void adicionarCuriosidade(String tipo, String curiosidade) {
        curiosidades.put(tipo, curiosidade);
    }

    public void mostrarCuriosidades() {
        if (curiosidades.isEmpty()) {
            System.out.println("Não há curiosidades cadastradas.");
            return;
        }

        System.out.println("Curiosidades:");
        for (Map.Entry<String, String> entry : curiosidades.entrySet()) {
            System.out.println("Tipo: " + entry.getKey() + " - Curiosidade : " + entry.getValue());
        }
    }

    public String obterCuriosidade(String tipo) {
        return curiosidades.getOrDefault(tipo, "Curiosidade não encontrada.");
    }

    public void removerCuriosidade(String tipo) {
        curiosidades.remove(tipo);
    }

    @Override
    public String toString() {
        return "PokedexP.PokemonCaracteristicas{" +
                "descricao='" + descricao + '\'' +
                ", curiosidades=" + curiosidades +
                '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Map<String, String> getCuriosidades() {
        return curiosidades;
    }

    public void setCuriosidades(Map<String, String> curiosidades) {
        this.curiosidades = curiosidades;
    }
}
