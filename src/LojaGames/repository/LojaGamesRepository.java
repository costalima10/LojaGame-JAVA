package LojaGames.repository;

import LojaGames.model.Produto;

public interface LojaGamesRepository {
    public void criar(Produto produto);
    public void listarTodos();
    public Produto buscarId(int id);
    public Produto atualizar(int id ,Produto produto);
    public void deletar(int id);
}
