public interface ComputadorBuilder {
    ComputadorBuilder comProcessador(String processador);
    ComputadorBuilder comMemoriaRAM(int memoriaRAM);
    ComputadorBuilder comArmazenamento(int armazenamento);
    ComputadorBuilder comPlacaDeVideo(String placaDeVideo);
    ComputadorBuilder comSistemaOperacional(String sistemaOperacional);
    ComputadorBuilder comTecladoMecanico(boolean tecladoMecanico);
    ComputadorBuilder comMonitorAdicional(boolean monitorAdicional);

    Computador build();
}