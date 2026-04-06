public class Main {
    public static void main(String[] args) {

        TomadaAntiga tomadaAntiga = new TomadaAntiga();
        AdaptadorTomada adaptadorTomada = new AdaptadorTomada(tomadaAntiga);
        Notebook notebook = new Notebook();
        notebook.conectar(adaptadorTomada);
    }
}