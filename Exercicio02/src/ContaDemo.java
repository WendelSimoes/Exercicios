public class ContaDemo {
    public static void main(String[] args) {
        Conta conta = new Conta("Wendel", "1234", 100);
        conta.depositarValor(150);
        conta.retirarValor(40);
        System.out.println(conta.consultarValorDisponivel());
    } 
}
