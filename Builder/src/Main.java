public class Main {
    public static void main(String[] args) {

        Computador escritorio = new ComputadorBuilderImpl()
                .comProcessador("Intel i3")
                .comMemoriaRAM(8)
                .comArmazenamento(256)
                .comSistemaOperacional("Windows 10")
                .build();

        Computador gamer = new ComputadorBuilderImpl()
                .comProcessador("Intel i9")
                .comMemoriaRAM(32)
                .comArmazenamento(1000)
                .comPlacaDeVideo("RTX 4080")
                .comSistemaOperacional("Windows 11")
                .comTecladoMecanico(true)
                .comMonitorAdicional(true)
                .build();

        Computador dev = new ComputadorBuilderImpl()
                .comProcessador("Ryzen 7")
                .comMemoriaRAM(16)
                .comArmazenamento(512)
                .comSistemaOperacional("Linux")
                .comMonitorAdicional(true)
                .build();

        System.out.println("\n=== COMPUTADORES ===\n");
        System.out.println("Escritório:\n" + escritorio);
        System.out.println("\nGamer:\n" + gamer);
        System.out.println("\nDesenvolvimento:\n" + dev);
    }
}