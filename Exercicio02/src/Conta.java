public class Conta {
    private String nome;
    private String numeroConta;
    private double saldo;

    public Conta(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    public void depositarValor(double valor){
        this.saldo += valor;
    }
    public boolean retirarValor(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    public double consultarValorDisponivel(){
        return saldo;
    }
    public void setSaldo(double valor){
        this.saldo -= valor;
    }
}
