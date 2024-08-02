import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner sc = new Scanner(System.in);

        // Solicita o dados do cliente
        System.out.println("Digite seu numero da sua conta: ");
        Integer numero = sc.nextInt();
        sc.nextLine();
        conta.setNumero(numero);
        System.out.println("Digita a sua Agencia");
        String Agencia = sc.nextLine();
        conta.setAgencia(Agencia);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        conta.setNomeCliente(nome);
        System.out.println("Digite seu saldo da sua conta: ");
        Double saldo = sc.nextDouble();
        conta.setSaldo(saldo);


        // Exibe o nome do cliente
        //System.out.println("O numero da Conta é: " + conta.getNumero());
        //System.out.println(" A sua agencia é: " + conta.getAgencia());
        //System.out.println("O nome do Cliente é: " + conta.getNomeCliente());
        //System.out.println("O Saldo atual é R$: " + conta.getSaldo());
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta: %d e seu saldo %.2f já está disponível para saque.%n",
                conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
    }
}
