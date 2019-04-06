public class RefrigeranteDemo {
    public static void main(String[] args) {
        Refrigerante refrigerante1 = new Refrigerante("Cocacola", 1.5, 40);
        Refrigerante refrigerante2 = new Refrigerante("FantaUva", 0.9, 10);
        Refrigerante refrigerante3 = new Refrigerante("FantaLaranja", 0.9, 8);
        Refrigerante refrigerante4 = new Refrigerante("Spritc", 0.8, 20);
        Refrigerante refrigerante5 = new Refrigerante("Kuat", 1, 100);
        
        System.out.println("Troco: " + refrigerante1.efetuarVenda(5));
        System.out.println("Saldo: " + refrigerante1.getQtdEstoque());
    }
    
}
