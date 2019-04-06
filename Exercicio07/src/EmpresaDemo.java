public class EmpresaDemo {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("A", 100, 10);
        Empresa empresa2 = new Empresa("B", 200, 20);
        Empresa empresa3 = new Empresa("C", 300, 30);
        Empresa empresa4 = new Empresa("D", 400, 40);
        Empresa empresa5 = new Empresa("E", 500, 50);
        
        Empresa[] empresas = new Empresa[5];
        empresas[0] = empresa1;
        empresas[1] = empresa2;
        empresas[2] = empresa3;
        empresas[3] = empresa4;
        empresas[4] = empresa5;
        
        int i;
        int menorNFuncionarios = 999999;
        for(i = 0; i < empresas.length; i++){
            if(empresas[i].getnFuncionarios() < menorNFuncionarios){
                menorNFuncionarios = empresas[i].getnFuncionarios();
            }
        }
        for(i = 0; i < empresas.length; i++){
            if(empresas[i].getnFuncionarios() == menorNFuncionarios){
                System.out.println("Empresa com menor numero de funcionarios: " + empresas[i].getNome());
            }
        }
        
        double maiorCapital = 0;
        for(i = 0; i < empresas.length; i++){
            if(empresas[i].getCapital() > maiorCapital){
                maiorCapital = empresas[i].getCapital();
            }
        }
        for(i = 0; i < empresas.length; i++){
            if(empresas[i].getCapital() == maiorCapital){
                System.out.println("Empresa com maior capital: " + empresas[i].getNome());
            }
        }
    }
}
