public class AdaptadorTomada implements TomadaNova {
    private TomadaAntiga tomadaAntiga;

    public AdaptadorTomada(TomadaAntiga tomadaAntiga) {
        this.tomadaAntiga = tomadaAntiga;
    }

    @Override
    public void fornecerEnergiaNova() {
        tomadaAntiga.fornecerEnergiaAntiga();
    }
}
