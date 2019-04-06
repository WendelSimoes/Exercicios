public class Lampada {
    private int potencia;
    private String estado;

    public Lampada(){
        this.estado = "Desligado";
    }
    
    public Lampada(String estado, int potencia){
        this.estado = estado;
        this.potencia = potencia;
    }
    
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }  
    
    public void ligar(){
        this.estado = "Ligado";
    }
    public void desligar(){
        this.estado = "Desligado";
    }
}
