package LojaGames;

import LojaGames.controller.LojaGamesController;
import LojaGames.model.Console;
import LojaGames.model.Jogo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaGame {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        LojaGamesController produtos = new LojaGamesController();
        int opcao,tipo = 0,id,classificacao,capacidade;
        String nome,marca,genero,modelo;
        float preco;

        do{
            System.out.println("                                                        ");
            System.out.println("                     LOJA DE GAMES                      ");
            System.out.println("                                                        ");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("                                                        ");
            System.out.println("                1 - Criar Produto                       ");
            System.out.println("                2 - Listar todos os Produtos            ");
            System.out.println("                3 - Buscar Produto por ID               ");
            System.out.println("                4 - Atualizar Produto                   ");
            System.out.println("                5 - Deletar Produto                     ");
            System.out.println("                0 - Sair                                ");
            System.out.println("                                                        ");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("\nEntre com a opção desejada:                           ");

            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                leia.nextLine();
                opcao = 0;
            }
            switch (opcao){
                case 1:do {
                    System.out.println("Criar Produto\n\n");
                    System.out.println("\nQual Produto Você Deseja ?? \n" +
                            "DIGITE ||1- Console|| OU ||2- JOGOS||\n");
                    tipo = leia.nextInt();
                    leia.nextLine();
                } while (tipo < 1 && tipo > 2);

                    switch (tipo){
                        case 1:
                            System.out.println("\nQual Console Você Deseja Cadastrar ??\n");
                            nome = leia.nextLine();

                            System.out.println("\nDe Qual a Marca Do Console ??\n");
                            marca = leia.nextLine();

                            System.out.println("\nDe Qual o Modelo do Console ??\n");
                            modelo = leia.nextLine();

                            System.out.println("\nDe Qual a Capacidade Do Console ??\n");
                            capacidade = leia.nextInt();

                            System.out.println("\nDe Qual o Preço Do Console ??\n");
                            preco= leia.nextInt();

                            produtos.criar(new Console(produtos.gerarId(),tipo,nome,marca,preco,modelo,capacidade));
                            break;
                            case 2:
                                System.out.println("\nQual Nome Do Jogo Que Deseja Cadastrar ??\n");
                                nome = leia.nextLine();

                                System.out.println("\nDe Qual a Marca Do Jogo ??\n");
                                marca = leia.nextLine();

                                System.out.println("\nDe Qual o Genero do Jogo ??\n");
                                genero = leia.nextLine();

                                System.out.println("\nDe Qual a Classificaçao Do Jogo ??\n");
                                classificacao = leia.nextInt();

                                System.out.println("\nDe Qual o Preço Do Jogo ??\n");
                                preco= leia.nextInt();

                                produtos.criar(new Jogo(produtos.gerarId(),tipo,nome,marca,preco,classificacao,genero));
                                break;
                    }
                    break;
                case 2:
                        System.out.println("Listar Produtos\n\n");
                        produtos.listarTodos();
                    break;
                case 3:
                    System.out.println("\nQual ID do Produto Que Deseja Buscar??\n");
                    id = leia.nextInt();
                    produtos.buscarId(id);
                    break;
                case 4:
                        System.out.println("Atualizar Produto\n\n");
                        System.out.println("\nQual o Id Que Deseja Atualizar??\n");
                        id = leia.nextInt();
                        if(produtos.buscarId(id) == null){
                            System.out.println("\n !! ID NÃO ENCONTRADO !!\n");
                        }else{
                            do {
                                System.out.println("Atualizando Produto\n\n");
                                System.out.println("\nQual Tipo Do Novo Produto ?? \n" +
                                        "DIGITE ||1- Console|| OU ||2- JOGOS||\n");
                                tipo = leia.nextInt();
                                leia.nextLine();
                            } while (tipo < 1 && tipo > 2);
                        }
                    switch (tipo){
                        case 1:
                            System.out.println("\nQual Console Você Deseja Cadastrar ??\n");
                            nome = leia.nextLine();

                            System.out.println("\nDe Qual a Marca Do Console ??\n");
                            marca = leia.nextLine();

                            System.out.println("\nDe Qual o Modelo do Console ??\n");
                            modelo = leia.nextLine();

                            System.out.println("\nDe Qual a Capacidade Do Console ??\n");
                            capacidade = leia.nextInt();

                            System.out.println("\nDe Qual o Preço Do Console ??\n");
                            preco= leia.nextInt();

                            produtos.atualizar(id,new Console(id,tipo,nome,marca,preco,modelo,capacidade));
                            break;
                        case 2:
                            System.out.println("\nQual Nome Do Jogo Que Deseja Cadastrar ??\n");
                            nome = leia.nextLine();

                            System.out.println("\nDe Qual a Marca Do Jogo ??\n");
                            marca = leia.nextLine();

                            System.out.println("\nDe Qual o Genero do Jogo ??\n");
                            genero = leia.nextLine();

                            System.out.println("\nDe Qual a Classificaçao Do Jogo ??\n");
                            classificacao = leia.nextInt();

                            System.out.println("\nDe Qual o Preço Do Jogo ??\n");
                            preco= leia.nextInt();

                            produtos.atualizar(id,new Jogo(id,tipo,nome,marca,preco,classificacao,genero));
                            break;
                    }
                        break;
                case 5:
                        System.out.println("\n Qual ID Deseja Deletar ??\n");
                        id = leia.nextInt();
                        if (produtos.buscarId(id) != null){
                            System.out.printf("\n Produto %d Deletado",id);
                            produtos.deletar(id);
                            break;
                        }
                        break;
            }
        }while(opcao != 0);

    }
}
