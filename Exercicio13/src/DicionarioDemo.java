import java.util.ArrayList;

public class DicionarioDemo {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<String>();
        palavras.add("Java");
        palavras.add("Funcionário");
        palavras.add("Aluno");
        palavras.add("Futebol");
        
        ArrayList<String> significados = new ArrayList<String>();
        significados.add("Linguagem de programação");
        significados.add("Pessoa que trabalha");
        significados.add("Pessoa que estuda");
        significados.add("Modalidade de esporte");
        
        Dicionario dicionario = new Dicionario(palavras, significados);
        System.out.println(dicionario.pesquisar());
        System.out.println(dicionario.pesquisar("Funcionário"));
        System.out.println(dicionario.pesquisar(2));

        System.out.println(dicionario.validarPalavra("Java"));
        System.out.println(dicionario.validarPalavra("Não existente"));
    }
    
}
