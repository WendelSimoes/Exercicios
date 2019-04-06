public class Mercadoria {
    private String nome;
    private double valor;
    private int qtdEstoque;

    public Mercadoria(String nome, double valor, int qtdEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;
    }
    
    public double comprar(){
        this.qtdEstoque--;
        return valor;
    }
    
    public double comprar(int qtdItens){
        this.qtdEstoque -= qtdItens;
        return valor*qtdItens;
    }
    
    public double comprar(int qtdItens, int desconto){
        this.qtdEstoque -= qtdItens;
        return (desconto * (valor*qtdItens))/100;
    }
}
