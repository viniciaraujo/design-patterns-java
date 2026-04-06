public class Computador {
    private String processador;
    private int memoriaRAM;
    private int armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;
    private boolean tecladoMecanico;
    private boolean monitorAdicional;

    // Construtor privado
    private Computador() {}

    // Método de fábrica (usado pelo Builder)
    static Computador novoComputador() {
        return new Computador();
    }

    // Setters (usados pelo Builder)
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void setTecladoMecanico(boolean tecladoMecanico) {
        this.tecladoMecanico = tecladoMecanico;
    }

    public void setMonitorAdicional(boolean monitorAdicional) {
        this.monitorAdicional = monitorAdicional;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + valorOuPadrao(processador, "Não informado") + '\'' +
                ", memoriaRAM=" + memoriaRAM + "GB" +
                ", armazenamento=" + armazenamento + "GB" +
                ", placaDeVideo='" + valorOuPadrao(placaDeVideo, "Não possui") + '\'' +
                ", sistemaOperacional='" + valorOuPadrao(sistemaOperacional, "Não informado") + '\'' +
                ", tecladoMecanico=" + (tecladoMecanico ? "Sim" : "Não") +
                ", monitorAdicional=" + (monitorAdicional ? "Sim" : "Não") +
                '}';
    }

    // Método auxiliar pra evitar null
    private String valorOuPadrao(String valor, String padrao) {
        return valor != null ? valor : padrao;
    }
}