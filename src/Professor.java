public class Professor extends Usuario {
    private float salario;
    private String siape;

    public Professor(String nome, String cpf, String dataNascimento, String email, float salario, String siape) {
        super(nome, cpf, dataNascimento, email);
        this.salario = salario;
        this.siape = siape;
    }

    
    public float getSalario() { return salario; }
    public void setSalario(float salario) { this.salario = salario; }
    public String getSiape() { return siape; }
    public void setSiape(String siape) { this.siape = siape; }
}
