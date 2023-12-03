package LojaGames.model;

public class Console extends Produto{
    private String modelo;
    private int capacidade;
    public Console(int id, int tipo, String nome, String marca, float preco, String modelo, int capacidade) {
        super(id, tipo, nome, marca, preco);
        this.modelo = modelo;
        this.capacidade = capacidade;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    @Override
    public void visualizar(){
        super.visualizar();
        System.out.printf("Modelo: %s\nCapacidade %d\nPreço: R$ %.2f\n" +
                "-------------------------------",this.getModelo(),this.getCapacidade(),this.getPreco());
    }
}
