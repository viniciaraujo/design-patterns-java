public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new FuncionarioSimples("João", 3000);
        Funcionario f2 = new FuncionarioSimples("Maria", 4000);
        Funcionario f3 = new FuncionarioSimples("Carlos", 5000);

        Departamentos ti = new Departamentos("TI");
        ti.adicionar(f1);
        ti.adicionar(f2);

        Departamentos empresa = new Departamentos("Empresa");
        empresa.adicionar(f3);
        empresa.adicionar(ti);

        System.out.println("Custo total da empresa: " + empresa.getSalario());
    }
}