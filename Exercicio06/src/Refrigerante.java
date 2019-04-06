public class Refrigerante {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Refrigerante(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }
    
    public double efetuarVenda(double valor){
        this.qtdEstoque--;
        return valor - this.preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }  
}
