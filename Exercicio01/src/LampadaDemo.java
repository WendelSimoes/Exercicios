public class LampadaDemo {
    public static void main(String[] args){
        Lampada lampada = new Lampada();
        lampada.setPotencia(200);
        lampada.ligar();
        lampada.desligar();
        System.out.println(lampada.getPotencia());
        
        Lampada lampada2 = new Lampada("Ligado", 300);
        System.out.println(lampada2.getPotencia());
        
    }
}
