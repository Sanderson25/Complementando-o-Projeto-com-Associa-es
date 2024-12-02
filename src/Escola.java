public class Escola {
    private String idMec; 
    private String nome;
    private String endereco;
    private String contato;
    private int anoConclusao;

    public Escola(String idMec, String nome, String endereco, String contato, int anoConclusao) {
        this.idMec = idMec;
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
        this.anoConclusao = anoConclusao;
    }

    // Getters e Setters
    public String getIdMec() { return idMec; }
    public void setIdMec(String idMec) { this.idMec = idMec; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }
    public int getAnoConclusao() { return anoConclusao; }
    public void setAnoConclusao(int anoConclusao) { this.anoConclusao = anoConclusao; }
}
