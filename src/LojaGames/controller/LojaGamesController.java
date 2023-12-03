package LojaGames.controller;

import LojaGames.model.Produto;
import LojaGames.repository.LojaGamesRepository;

import java.util.ArrayList;

public class LojaGamesController implements LojaGamesRepository {

    private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    int id = 0;

    @Override
    public void criar(Produto produto) {
    listaProdutos.add(produto);
    }

    @Override
    public void listarTodos() {
    for(var item :listaProdutos){
        item.visualizar();
    }
    }
    public Produto buscarId (int id) {
        for (Produto item : listaProdutos ){
            if(item.getId() == id){
                item.visualizar();
                return item;
            }
        }
        System.out.printf("\n!!! NÃO ENCONTRADO !!!");
        return null;
    }

    @Override
    public Produto atualizar(int id, Produto produto) {
        for (Produto item : listaProdutos ){
            if (item.getId() == id){
                 System.out.println("\n !!! O PRODUTO FOI ATUALIZADO !!!");
                 return listaProdutos.set(listaProdutos.indexOf(item),produto);
            }
        }
        System.out.printf("\n !!! O PRODUTO NÃO FOI ATUALIZADO !!!");
        return null;
    }

    @Override
    public void deletar(int id) {
        for (Produto item : listaProdutos ){
            if (item.getId() == id){
                listaProdutos.remove(item);
                System.out.printf("\n!!! PRODUTO REMOVIDO COM SUCESSO !!!");
                return;
            }
        }
        System.out.println("\n!!!! PRODUTO NÃO ENCONTRADO IMPOSSIVEL DELETAR !!!!");
    }
    public int gerarId(){
        return ++id;
    }
}
