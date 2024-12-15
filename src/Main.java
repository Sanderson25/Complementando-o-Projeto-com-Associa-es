import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Estudante> estudantes = new ArrayList<>();
            ArrayList<Professor> professores = new ArrayList<>();
            ArrayList<Escola> escolas = new ArrayList<>();
            
            for (int i = 0; i < 4; i++) {
                System.out.println("Cadastro da Escola " + (i + 1));
                System.out.print("ID MEC: ");
                String idMec = scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Endereço: ");
                String endereco = scanner.nextLine();
                System.out.print("Contato: ");
                String contato = scanner.nextLine();
                System.out.print("Ano de Conclusão: ");
                int anoConclusao = scanner.nextInt();
                scanner.nextLine(); // Consumir quebra de linha
                escolas.add(new Escola(idMec, nome, endereco, contato, anoConclusao));
            }
            
            
            for (int i = 0; i < 4; i++) {
                System.out.println("Cadastro do Estudante " + (i + 1));
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("Data de Nascimento: ");
                String dataNascimento = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("Matrícula: ");
                String matricula = scanner.nextLine();
                System.out.print("Turma/Ano: ");
                String turmaAno = scanner.nextLine();
                System.out.print("Selecione a Escola (1-4): ");
                int escolaIndex = scanner.nextInt() - 1;
                scanner.nextLine(); // Consumir quebra de linha
                estudantes.add(new Estudante(nome, cpf, dataNascimento, email, matricula, turmaAno, null));
            }
            
           
            for (int i = 0; i < 4; i++) {
                System.out.println("Cadastro do Professor " + (i + 1));
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("Data de Nascimento: ");
                String dataNascimento = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("Salário: ");
                float salario = scanner.nextFloat();
                scanner.nextLine(); // Consumir quebra de linha
                System.out.print("SIAPE: ");
                String siape = scanner.nextLine();
                professores.add(new Professor(nome, cpf, dataNascimento, email, salario, siape));
            }
            
            // Impressão de informações
            System.out.println("\nInformações dos Estudantes:");
            for (Estudante est : estudantes) {
                System.out.println("Nome: " + est.getNome());
                System.out.println("CPF: " + est.getClass());
                System.out.println("Turma/Ano: " + est.getTurmaAno());
            }
            
            System.out.println("\nInformações dos Professores:");
            for (Professor prof : professores) {
                System.out.println("Nome: " + prof.getNome());
                System.out.println("CPF: " + prof.getClass());
                System.out.println("SIAPE: " + prof.getSiape());
            }

            System.out.println("\nInformações das Escolas:");
            for (Escola escola : escolas) {
                System.out.println("ID MEC: " + escola.getIdMec());
                System.out.println("Nome: " + escola.getNome());
                System.out.println("Contato: " + escola.getContato());
                System.out.println("Ano de Conclusão: " + escola.getAnoConclusao());
            }
        }
    }
}
