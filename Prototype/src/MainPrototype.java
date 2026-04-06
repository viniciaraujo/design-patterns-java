public class MainPrototype {
    public static void main(String[] args) {

        System.out.println("\n=== DOCUMENTOS ===\n");

        // Documento modelo
        Documento modelo = new Documento(
                "Ofício Padrão",
                "Diretoria de Ensino",
                "Encaminhamos o presente documento para apreciação.",
                "Direção Geral",
                "01/01/2026",
                "Normal"
        );

        // Clone 1 - Urgente
        Documento urgente = modelo.clone();
        urgente.setTitulo("Ofício Urgente");
        urgente.setPrioridade("Urgente");

        // Clone 2 - Nova data
        Documento novaData = modelo.clone();
        novaData.setData("23/03/2026");

        // Clone 3 - Conteúdo adicional
        Documento conteudoExtra = modelo.clone();
        conteudoExtra.setConteudo(
                modelo.getConteudo() + " Favor analisar com prioridade."
        );

        // Exibição
        System.out.println("Original:\n" + modelo);
        System.out.println("\nUrgente:\n" + urgente);
        System.out.println("\nNova Data:\n" + novaData);
        System.out.println("\nConteúdo Extra:\n" + conteudoExtra);
    }
}