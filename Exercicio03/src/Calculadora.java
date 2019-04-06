public class Calculadora {
    public double somar(double valor1, double valor2){
        return valor1 + valor2;
    }
    public double subtrair(double valor1, double valor2){
        return valor1 - valor2;
    }
    public double multiplicar(double valor1, double valor2){
        return valor1 * valor2;
    }
    public double dividir(double valor1, double valor2){
        if(valor2 == 0){
            System.out.println("Operação não realizada. Favor entrar com um divisor válido");
            return 0;
        }else{
            return valor1 / valor2;
        }
    }
}
