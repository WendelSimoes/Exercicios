public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;
    private double IMC;

    public Pessoa(String nome, int idade, double altura, double peso, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        
        this.setIMC();
    }
  
    public void setIMC(){
        IMC = this.peso / (altura*altura);
    }
    
    public double getIMC(){
        return IMC;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public String toString(){
        String descricao = null;
        if(this.IMC <= 18.5){
            descricao = "Abaixo do peso normal";
        }else if(this.IMC > 18.5 && this.IMC <= 25){
            descricao = "Peso normal";
        }else if(this.IMC > 25 && this.IMC <= 30){
            descricao = "Acima do peso normal";
        }else if(this.IMC > 30){
            descricao = "Obesidade";
        }
        return this.nome + " " + descricao;
    }
}
