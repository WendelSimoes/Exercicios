public class LivroDemo {
    public static void main(String[] args) {
        Livro livro = new Livro("A", 10);
        Livro livro1 = new Livro("B", 20);
        Livro livro2 = new Livro("C", 30);
        Livro livro3 = new Livro("D", 40);
        
        Livro[] livros = new Livro[4];
        livros[0] = livro;
        livros[1] = livro1;
        livros[2] = livro2;
        livros[3] = livro3;
    }
    
}
