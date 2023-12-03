import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade4 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TCC> tccs = new ArrayList<>();

        // Menu principal
        int escolha;
        do {
            System.out.println("\n---- Gerenciador de TCCs ----");
            System.out.println("1. Cadastrar TCC");
            System.out.println("2. Inserir Defesa");
            System.out.println("3. Lista TCCs em Execução");
            System.out.println("4. Lista TCCs Aprovados");
            System.out.println("5. Sair");
            System.out.print("Escolha a opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    cadastrarTCC(scanner, tccs);
                    break;
                case 2:
                    inserirDefesa(scanner, tccs);
                    break;
                case 3:
                    listarTCCsEmExecucao(tccs);
                    break;
                case 4:
                    listarTCCsAprovados(tccs);
                    break;
                case 5:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 5);
    }

    private static void cadastrarTCC(Scanner scanner, List<TCC> tccs) {
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("\n---- Cadastro de TCC ----");
        System.out.print("Nome do aluno: ");
        String aluno = scanner.nextLine();
        System.out.print("Nome do orientador: ");
        String orientador = scanner.nextLine();
        System.out.print("Nome do avaliador 1: ");
        String avaliador1 = scanner.nextLine();
        System.out.print("Nome do avaliador 2: ");
        String avaliador2 = scanner.nextLine();
        System.out.print("Título do TCC: ");
        String titulo = scanner.nextLine();

        TCC novoTCC = new TCC(aluno, orientador, avaliador1, avaliador2, titulo);
        tccs.add(novoTCC);

        System.out.println("TCC cadastrado com sucesso!");
    }

    private static void inserirDefesa(Scanner scanner, List<TCC> tccs) {
        System.out.println("\n---- Inserir Defesa ----");
        System.out.print("Informe o título do TCC: ");
        String titulo = scanner.next();

        TCC tcc = buscarTCCPorTitulo(titulo, tccs);

        if (tcc != null && tcc.status == 0) {
            System.out.print("Nota do orientador: ");
            double notaOrientador = scanner.nextDouble();
            System.out.print("Nota do avaliador 1: ");
            double notaAvaliador1 = scanner.nextDouble();
            System.out.print("Nota do avaliador 2: ");
            double notaAvaliador2 = scanner.nextDouble();

            tcc.inserirDefesa(notaOrientador, notaAvaliador1, notaAvaliador2);
            System.out.println("Defesa inserida com sucesso!");
        } else if (tcc == null) {
            System.out.println("TCC não encontrado.");
        } else if (tcc.status != 0) {
            System.out.println("A defesa já foi inserida para este TCC.");
        }
    }

    private static void listarTCCsEmExecucao(List<TCC> tccs) {
        System.out.println("\n---- TCCs em Execução ----");
        for (TCC tcc : tccs) {
            if (tcc.status == 0) {
                exibirInformacoesTCC(tcc);
            }
        }
    }

    private static void listarTCCsAprovados(List<TCC> tccs) {
        System.out.println("\n---- TCCs Aprovados ----");
        for (TCC tcc : tccs) {
            if (tcc.status == 1) {
                exibirInformacoesTCC(tcc);
                System.out.println("Nota Final: " + calcularMediaNotas(tcc));
            }
        }
    }

    private static void exibirInformacoesTCC(TCC tcc) {
        System.out.println("Aluno: " + tcc.aluno);
        System.out.println("Orientador: " + tcc.orientador);
        System.out.println("Avaliador 1: " + tcc.avaliador1);
        System.out.println("Avaliador 2: " + tcc.avaliador2);
        System.out.println("Título: " + tcc.titulo);
        System.out.println("Status: " + getStatusTCC(tcc.status));
    }

    private static String getStatusTCC(int status) {
        switch (status) {
            case 0:
                return "Em Execução";
            case 1:
                return "Aprovado";
            case 2:
                return "Reprovado";
            default:
                return "Desconhecido";
        }
    }

    private static TCC buscarTCCPorTitulo(String titulo, List<TCC> tccs) {
        for (TCC tcc : tccs) {
            if (tcc.titulo.equals(titulo)) {
                return tcc;
            }
        }
        return null;
    }

    private static double calcularMediaNotas(TCC tcc) {
        return (tcc.notaOrientador + tcc.notaAvaliador1 + tcc.notaAvaliador2) / 3;
    }
}
