package LojaGames.model;

public abstract class Produto {
    private int id, tipo;
    private String nome, marca;
    private float preco;

    public Produto(int id, int tipo, String nome, String marca, float preco) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void visualizar(){
        System.out.printf("\nID: %d\nTipo; %d\nNome: %s\nMarca: %s\n",this.getId(),this.getTipo(),this.getNome(),this.getMarca());

    }

}
