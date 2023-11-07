import java.util.Scanner;

public class entradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoArray = 10;  // Defina o tamanho do array conforme necessário
        String[] cpfs = new String[tamanhoArray];
        String[] nomes = new String[tamanhoArray];

        int totalPessoasCadastradas = 0;

        while (true) {
            System.out.print("Digite o CPF: ");
            String cpf = scanner.next();
            System.out.print("Digite o nome completo: ");
            scanner.nextLine();  // Consumir a quebra de linha anterior
            String nome = scanner.nextLine();

            cpfs[totalPessoasCadastradas] = cpf;
            nomes[totalPessoasCadastradas] = nome;

            totalPessoasCadastradas++;

            System.out.print("Deseja cadastrar outra pessoa? (S/N): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.print("Digite o CPF que deseja encontrar: ");
        String cpfBusca = scanner.next();

        for (int i = 0; i < totalPessoasCadastradas; i++) {
            if (cpfs[i].equals(cpfBusca)) {
                System.out.println("CPF encontrado!");
                System.out.println("Nome: " + nomes[i]);
                break;
            }
        }

        System.out.println("CPF não encontrado.");

        scanner.close();
    }
}
