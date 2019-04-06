public class ContaDemo2 {
    public static void main(String[] args) {
        ContaEspecial contaEspecial = new ContaEspecial("João", "1234", 100, 500);
        contaEspecial.depositarValor(400);
        contaEspecial.retirarValor(50);
        System.out.println(contaEspecial.consultarValorDisponivel());
        contaEspecial.retirarValor(900);
        System.out.println(contaEspecial.consultarValorDisponivel());
        contaEspecial.retirarValor(100);
        contaEspecial.depositarValor(50);
        System.out.println(contaEspecial.consultarValorDisponivel());
        contaEspecial.retirarValor(100);
        System.out.println(contaEspecial.consultarValorDisponivel());
    }  
}
