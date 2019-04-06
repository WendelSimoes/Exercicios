import java.util.Scanner;

public class ProdutoDemo {
    public static void main(String[] args) {
        Produto produto1 = new Produto("A", 1, 10);
        Produto produto2 = new Produto("B", 2, 10);
        Produto produto3 = new Produto("C", 3, 10);
        Produto produto4 = new Produto("D", 4, 10);
        Produto produto5 = new Produto("E", 5, 10);
        Produto[] produto = new Produto[5];
        produto[0] = produto1;
        produto[1] = produto2;
        produto[2] = produto3;
        produto[3] = produto4;
        produto[4] = produto5;
        
        Scanner scanner = new Scanner(System.in);
        String descricao;
        do{
            descricao = scanner.next();
            for(int i = 0; i < produto.length; i++){
                if(produto[i].getDescricao().equalsIgnoreCase(descricao)){
                    System.out.println("Preço: " + produto[i].getPreco());
                    System.out.println("Saldo: " + produto[i].getSaldo());
                }
            }
        } while(!descricao.equalsIgnoreCase("fim"));    
    }
    
}
