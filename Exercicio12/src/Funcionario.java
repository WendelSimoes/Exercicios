import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private char sexo;
    private char nivel;
    private ArrayList<String> dependentes;

    public Funcionario(String nome, char sexo, char nivel, ArrayList<String> dependentes) {
        this.nome = nome;
        this.validarSexo(sexo);
        this.nivel = nivel;
        this.dependentes = dependentes;
    }
    
    public double calcularSalario(){
        switch(this.nivel){
            case 'T':
                return 2000;
            case 'P': 
                return 3500;
            case 'S':
                return 5000;
        }
        return 0;
    }
    
    public void mostrarDependentes(){
        for(int i = 0; i < this.dependentes.size(); i++){
            System.out.println(dependentes.get(i));
        }
    }
    
    public boolean validarSexo(char sexo){
        if(sexo == 'M' || sexo == 'F'){
            this.sexo = sexo;
            return true;
        }else{
            System.out.println("Sexo invalido");
            return false;
        }
    }
}
