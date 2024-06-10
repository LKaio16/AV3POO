package PokedexP;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu implements MenuAcoes {
    Pokedex pokedex = new Pokedex();
    Scanner scan = new Scanner(System.in);
    Pokemon pokemonSelecionado = null;

    @Override
    public void iniciaMenu() {

        int opcaoSelecionada = 0;

        System.out.println("Bem Vindo a Pokedex!!!");
        System.out.println("O que deseja fazer?");
        System.out.println("-----------------------------------");

        while (opcaoSelecionada != 10) {
            System.out.println("-----------------------------------");
            System.out.println("1 - Adicionar Pokemon ");
            System.out.println("2 - Listar Pokemons ");
            System.out.println("3 - Selecionar Pokemon");
            System.out.println("20 - Salvar ");
            System.out.println("21 - Carregar");

            if (pokemonSelecionado != null) {
                System.out.println("-------- Usar " + pokemonSelecionado.getNome() + "---------");
                System.out.println("4 - Excluir da Pokedex");
                System.out.println("5 - Ataque");
                System.out.println("6 - Teleportar");
                System.out.println("7 - Defesa");
                System.out.println("8 - Remover seleção");
                System.out.println("9 - Extras");
                System.out.println("---------------------------------------------------------");
            }

            System.out.println("10 - Sair");

            opcaoSelecionada = scan.nextInt();
            switch (opcaoSelecionada) {

                // ADICIONAR POKEMON
                case 1:
                    try {
                        pokedex.adicionarPokemon();
                    } catch (InputMismatchException e) {
                        System.out.println("Erro ao adicionar, verifique os dados e tente novamente");
                    } catch (PokemonJaExistenteException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                // LISTAR POKEMONS
                case 2:
                    pokedex.listarPokemons();
                    break;

                // ADICIONAR POKEMON
                case 3:
                    Scanner scanNome = new Scanner(System.in);
                    System.out.println("Digite o nome do Pokemon Desejado:");
                    pokemonSelecionado = pokedex.buscarPokemonPorNome(scanNome.nextLine());
                    if (pokemonSelecionado == null) {
                        System.out.println("Nenhum PokedexP.Pokemon encontrado.");
                    }
                    break;

                // REMOVER POKEMON
                case 4:
                    if (pokemonSelecionado != null) {
                        pokedex.removerPokemon(pokemonSelecionado);
                        pokemonSelecionado = null;
                        System.out.println("Pokemon Removido com Sucesso!");
                    } else {
                        System.out.println("NENHUM POKEMON SELECIONADO");
                    }
                    break;

                // ATACAR
                case 5:
                    try {
                        if (pokemonSelecionado == null) {
                            throw new PokemonNaoEncontradoException();
                        }
                        pokemonSelecionado.atacar();
                    } catch (PokemonNaoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                    // TELEPORTAR
                case 6:
                    try {
                        //Downcast
                        if (pokemonSelecionado instanceof PokemonTipoPsiquico pokemonTipoPsiquico) {
                            pokemonTipoPsiquico.teleportar(); // Método específico de pokemons Psiquicos!!
                        } else {
                            System.out.println(pokemonSelecionado.getNome() + " não é um Pokemon Psiquico e não pode teleportar.");
                        }
                    } catch (NullPointerException e) {
                        System.out.println("NENHUM POKEMON SELECIONADO!");
                    }
                    break;

                // DEFENDER
                case 7:
                    try {
                        pokemonSelecionado.defender();
                    } catch (NullPointerException e) {
                        System.out.println("NENHUM POKEMON SELECIONADO");
                    }
                    break;

                // REMOVER SELECAO
                case 8:
                    pokemonSelecionado = null;
                    break;

                // EXTRAS
                case 9:
                    if (pokemonSelecionado != null) {

                        Scanner scan = new Scanner(System.in);
                        System.out.println("------- EXTRAS -------");
                        System.out.println("1 - Adicionar Curiosidade");
                        System.out.println("2 - Ver Curiosidades");
                        System.out.println("SELECIONE");
                        int opcaoSelecionada2 = scan.nextInt();
                        scan.nextLine();

                        switch (opcaoSelecionada2) {
                            case 1:
                                System.out.println("Qual o tipo da curiosidade?");
                                String tipo = scan.nextLine();
                                System.out.println("Qual a Curiosidade?");
                                String curiosidade = scan.nextLine();

                                pokemonSelecionado.adicionarCuriosidade(tipo, curiosidade);
                                System.out.println("Curiosidade Adicionada!");
                                break;
                            case 2:
                                pokemonSelecionado.mostrarCuriosidades();
                                break;
                        }
                    } else {
                        System.out.println("Opção invalida");
                    }

                    break;

                case 10:
                    System.out.println("Obrigado por ultilizar?");
                    break;
                case 20:
                    pokedex.salvaPokedex((ArrayList<Pokemon>) pokedex.pokemons);
                    break;

                case 21:
                    pokedex.pokemons = pokedex.carregaPokedex();
                    break;
                default:
                    System.out.println("Opção invalida");

            }
        }
    }
}
