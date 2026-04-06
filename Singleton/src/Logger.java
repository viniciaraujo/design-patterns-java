import java.util.ArrayList;
import java.util.List;

public class Logger {

    // Instância única
    private static Logger instancia;

    // Lista de logs
    private List<String> logs;

    // Construtor privado (IMPOSSIBILITA usar new)
    private Logger() {
        logs = new ArrayList<>();
    }

    // Método que retorna a única instância
    public static Logger getInstance() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    // Adiciona mensagem
    public void log(String mensagem) {
        logs.add(mensagem);
    }

    // Exibe todas as mensagens
    public void exibirLogs() {
        System.out.println("=== LOGS DO SISTEMA ===");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}