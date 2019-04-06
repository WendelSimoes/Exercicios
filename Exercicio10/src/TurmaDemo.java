import java.util.ArrayList;

public class TurmaDemo {
    public static void main(String[] args) {
        String aluno = "A";
        String aluno1 = "A";
        String aluno2 = "A";
        String aluno3 = "A";
        String aluno4 = "A";
        String aluno5 = "A";
        String aluno6 = "A";
        String aluno7 = "A";
        String aluno8 = "A";
        String aluno9 = "A";
        
        Float nota = 10f;
        Float nota1 = 10f;
        Float nota2 = 10f;
        Float nota3 = 10f;
        Float nota4 = 10f;
        Float nota5 = 10f;
        Float nota6 = 10f;
        Float nota7 = 10f;
        Float nota8 = 10f;
        Float nota9 = 10f;
 
        ArrayList<String> alunos = new ArrayList<String>();
        
        alunos.add(aluno);
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);
        alunos.add(aluno7);
        alunos.add(aluno8);
        alunos.add(aluno9);
        
        ArrayList<Float> notas = new ArrayList<Float>();

        notas.add(nota);
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);
        notas.add(nota5);
        notas.add(nota6);
        notas.add(nota7);
        notas.add(nota8);
        notas.add(nota9);
        
        Turma turma = new Turma(alunos, notas);
        System.out.println("Média: " + turma.calcularMediaNota());
    }
    
}
