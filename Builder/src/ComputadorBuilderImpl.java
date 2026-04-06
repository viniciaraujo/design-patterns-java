public class ComputadorBuilderImpl implements ComputadorBuilder {

    private Computador computador;

    public ComputadorBuilderImpl() {
        this.computador = Computador.novoComputador();
    }

    @Override
    public ComputadorBuilder comProcessador(String processador) {
        computador.setProcessador(processador);
        return this;
    }

    @Override
    public ComputadorBuilder comMemoriaRAM(int memoriaRAM) {
        computador.setMemoriaRAM(memoriaRAM);
        return this;
    }

    @Override
    public ComputadorBuilder comArmazenamento(int armazenamento) {
        computador.setArmazenamento(armazenamento);
        return this;
    }

    @Override
    public ComputadorBuilder comPlacaDeVideo(String placaDeVideo) {
        computador.setPlacaDeVideo(placaDeVideo);
        return this;
    }

    @Override
    public ComputadorBuilder comSistemaOperacional(String sistemaOperacional) {
        computador.setSistemaOperacional(sistemaOperacional);
        return this;
    }

    @Override
    public ComputadorBuilder comTecladoMecanico(boolean tecladoMecanico) {
        computador.setTecladoMecanico(tecladoMecanico);
        return this;
    }

    @Override
    public ComputadorBuilder comMonitorAdicional(boolean monitorAdicional) {
        computador.setMonitorAdicional(monitorAdicional);
        return this;
    }

    @Override
    public Computador build() {
        Computador resultado = this.computador;
        this.computador = Computador.novoComputador(); // permite reutilizar builder
        return resultado;
    }
}