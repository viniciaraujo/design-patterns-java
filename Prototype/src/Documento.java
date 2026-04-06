public class Documento implements Prototype {

    private String titulo;
    private String setorResponsavel;
    private String conteudo;
    private String assinatura;
    private String data;
    private String prioridade;

    public Documento(String titulo, String setorResponsavel, String conteudo,
                     String assinatura, String data, String prioridade) {
        this.titulo = titulo;
        this.setorResponsavel = setorResponsavel;
        this.conteudo = conteudo;
        this.assinatura = assinatura;
        this.data = data;
        this.prioridade = prioridade;
    }

    // GETTERS (boa prática)
    public String getTitulo() { return titulo; }
    public String getSetorResponsavel() { return setorResponsavel; }
    public String getConteudo() { return conteudo; }
    public String getAssinatura() { return assinatura; }
    public String getData() { return data; }
    public String getPrioridade() { return prioridade; }

    // SETTERS
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setSetorResponsavel(String setorResponsavel) { this.setorResponsavel = setorResponsavel; }
    public void setConteudo(String conteudo) { this.conteudo = conteudo; }
    public void setAssinatura(String assinatura) { this.assinatura = assinatura; }
    public void setData(String data) { this.data = data; }
    public void setPrioridade(String prioridade) { this.prioridade = prioridade; }

    // CLONE (Prototype)
    @Override
    public Documento clone() {
        return new Documento(
                this.titulo,
                this.setorResponsavel,
                this.conteudo,
                this.assinatura,
                this.data,
                this.prioridade
        );
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", setorResponsavel='" + setorResponsavel + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", assinatura='" + assinatura + '\'' +
                ", data='" + data + '\'' +
                ", prioridade='" + prioridade + '\'' +
                '}';
    }
}