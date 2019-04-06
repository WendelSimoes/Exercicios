import java.util.ArrayList;

public class Dicionario {
    ArrayList<String> palavras;
    ArrayList<String> significados;

    public Dicionario(ArrayList<String> palavras, ArrayList<String> significados) {
        this.palavras = palavras;
        this.significados = significados;
    }
    
    public String pesquisar(){
        return palavras.get(0) + " - " + significados.get(0);
    }
    
    public String pesquisar(String palavra){
        int i = palavras.indexOf(palavra);
        return palavras.get(i) + " - " + significados.get(i);
    }
    
    public String pesquisar(int index){
        return palavras.get(index) + " - " + significados.get(index);
    }
    
    public boolean validarPalavra(String palavra){
        if(palavras.contains(palavra)){
            System.out.println("Palavra já existente no dicionario");
            return false;
        }else{
            return true;
        }
    }
}
