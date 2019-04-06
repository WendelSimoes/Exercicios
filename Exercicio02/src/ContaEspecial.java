public class ContaEspecial extends Conta{
    private double limite;
    
    public ContaEspecial(String nome, String numeroConta, double saldo,double limite){
        super(nome, numeroConta, saldo);
        this.limite = limite;
    }
    
    @Override
    public boolean retirarValor(double valor){
        if(valor <= (super.consultarValorDisponivel() + this.limite)){
            setSaldo(valor);
            return true;
        }else{
            return false;
        }
    }
    @Override
    public double consultarValorDisponivel(){
        return super.consultarValorDisponivel() + this.limite;
    }
}
