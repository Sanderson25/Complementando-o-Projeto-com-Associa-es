public class NotaSelecao {
    private String disciplina;
    private float nota;
    private boolean eja;

    public NotaSelecao(String disciplina, float nota, boolean eja) {
        this.disciplina = disciplina;
        this.nota = nota;
        this.eja = eja;
    }

    // Getters e Setters
    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }
    public float getNota() { return nota; }
    public void setNota(float nota) { this.nota = nota; }
    public boolean isEja() { return eja; }
    public void setEja(boolean eja) { this.eja = eja; }
}
