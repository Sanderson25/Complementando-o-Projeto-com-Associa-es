public class Estudante extends Usuario {
    private String matricula;
    private String turmaAno;
    private Escola escolaAnterior;

    public Estudante(String nome, String cpf, String dataNascimento, String email, 
                     String matricula, String turmaAno, Escola escolaAnterior) {
        super(nome, cpf, dataNascimento, email);
        this.matricula = matricula;
        this.turmaAno = turmaAno;
        this.escolaAnterior = escolaAnterior;
    }

    // Getters e Setters
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getTurmaAno() { return turmaAno; }
    public void setTurmaAno(String turmaAno) { this.turmaAno = turmaAno; }
    public Escola getEscolaAnterior() { return escolaAnterior; }
    public void setEscolaAnterior(Escola escolaAnterior) { this.escolaAnterior = escolaAnterior; }
}
