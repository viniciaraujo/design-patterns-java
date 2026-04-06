import java.util.ArrayList;
import java.util.List;

public class Departamentos implements Funcionario {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamentos(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }
    public void adicionar(Funcionario f) {
        funcionarios.add(f);
    }
    public void remover(Funcionario f){
        funcionarios.remove(f);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getSalario() {
        double salario = 0;
        for (Funcionario f : funcionarios) {
            salario += f.getSalario();
        }
        return salario;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Departamento: " + nome);
        for (Funcionario f : funcionarios) {
            f.mostrarDetalhes();
        }
    }
}
