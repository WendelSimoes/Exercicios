import java.util.ArrayList;

public class ConsultorDeVendas extends Funcionario {
    private double valorBonusMensal;

    public ConsultorDeVendas(String nome, char sexo, char nivel, ArrayList<String> dependentes, double valorBonus) {
        super(nome, sexo, nivel, dependentes);
        this.valorBonusMensal = valorBonus;
    }
  
    @Override
    public double calcularSalario(){
        return super.calcularSalario() + valorBonusMensal;
    }
    
}
