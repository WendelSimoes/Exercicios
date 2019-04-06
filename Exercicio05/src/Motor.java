public class Motor {
    private String nome;
    private int potencia;
    private boolean ligado;

    public Motor(String nome, int potencia) {
        this.nome = nome;
        this.potencia = potencia;
        this.ligado = false;
    }
    
    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }
    public boolean isLigado() {
        return ligado;
    }   

    public int getPotencia() {
        return potencia;
    }   
}
