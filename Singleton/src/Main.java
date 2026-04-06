public class Main {

    public static void main(String[] args) {

        // Simulando diferentes partes do sistema
        Logger logger1 = Logger.getInstance();
        logger1.log("Iniciando sistema");

        Logger logger2 = Logger.getInstance();
        logger2.log("Processando dados");

        Logger logger3 = Logger.getInstance();
        logger3.log("Finalizando sistema");

        // Exibir logs (pode usar qualquer variável)
        logger1.exibirLogs();
    }
}