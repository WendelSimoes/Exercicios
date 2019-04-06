public class PessoaDemo {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("A", 10, 1.1, 40, "Masculino");
        Pessoa pessoa1 = new Pessoa("A", 10, 1.4, 40, "Masculino");
        Pessoa pessoa2 = new Pessoa("A", 10, 1.3, 40, "Masculino");
        Pessoa pessoa3 = new Pessoa("A", 10, 2.5, 40, "Masculino");
        
        System.out.println(pessoa.toString());
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());

    }

}
