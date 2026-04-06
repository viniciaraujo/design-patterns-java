public class FuncionarioSimples implements Funcionario {
    private String nome;
    private double salario;

    public FuncionarioSimples(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }

}
