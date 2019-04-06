import java.util.ArrayList;

public class Turma {
    ArrayList<String> alunos;
    ArrayList<Float> notas;

    public Turma(ArrayList<String> alunos, ArrayList<Float> notas) {
        this.alunos = alunos;
        this.notas = notas;
    }
    
    public float calcularMediaNota(){
        float soma = 0;
        for(int i = 0; i < notas.size(); i++){
            soma += notas.get(i);
        }
        return soma / notas.size();
    }
    
    public void imprimirAlunos(){
        for(int i = 0; i < alunos.size(); i++){
            System.out.println(alunos.get(i) + " " + notas.get(i));
        }
    }
}
