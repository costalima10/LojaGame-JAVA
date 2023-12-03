package LojaGames.model;

public class Jogo extends Produto{
private int classificacao;
private String genero;
    public Jogo(int id, int tipo, String nome, String marca, float preco, int classificacao, String genero) {
        super(id, tipo, nome, marca, preco);
        this.classificacao = classificacao;
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    @Override
    public void visualizar(){
        super.visualizar();
        System.out.printf("Genero: %s\nClassificação: +%d\nPreço: %.2f\n" +
                "-------------------------------",this.getGenero(),this.getClassificacao(),this.getPreco());
    }
}
