import java.util.Scanner;

public class ControleEstoque {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numProdutos = 6; // Definindo o número de produtos a serem gerenciados.
		String[] nomes = new String[numProdutos]; // Array para armazenar os nomes dos produtos.
		int[] estoque = new int[numProdutos]; // Array para armazenar as quantidades em estoque dos produtos.
		int[] estoqueMinimo = new int[numProdutos]; // Array para armazenar as quantidades mínimas de estoque.
		double[] valorUnitario = new double[numProdutos]; // Array para armazenar os valores unitários dos produtos.
		int[] quantidadeVendida = new int[numProdutos]; // Array para armazenar as quantidades vendidas dos produtos.

		// Loop para preencher as informações de cada produto.
		for (int i = 0; i < numProdutos; i++) {
			System.out.print("Digite o nome do produto " + (i + 1) + ": ");
			nomes[i] = sc.nextLine(); // Lê e armazena o nome do produto.

			System.out.print("Digite a quantidade em estoque do produto " + (i + 1) + ": ");
			estoque[i] = sc.nextInt(); // Lê e armazena a quantidade em estoque do produto.

			System.out.print("Digite a quantidade mínima para estoque do produto " + (i + 1) + ": ");
			estoqueMinimo[i] = sc.nextInt(); // Lê e armazena a quantidade mínima de estoque do produto.

			System.out.print("Digite o valor unitário do produto " + (i + 1) + ": ");
			valorUnitario[i] = sc.nextDouble(); // Lê e armazena o valor unitário do produto.

			sc.nextLine(); // Consumindo a quebra de linha deixada pelo nextDouble para evitar problemas de
							// leitura.
		}

		int posicaoProduto;
		do {
			System.out.print("Digite a posição do produto (0 a " + (numProdutos - 1) + ") ou 99 para sair: ");
			posicaoProduto = sc.nextInt(); // Lê a posição do produto a ser gerenciado.

			if (posicaoProduto >= 0 && posicaoProduto < numProdutos) {
				System.out.print("Digite a quantidade vendida: ");
				int quantidadeVenda = sc.nextInt(); // Lê a quantidade vendida do produto.

				if (estoque[posicaoProduto] >= quantidadeVenda) {
					estoque[posicaoProduto] -= quantidadeVenda; // Atualiza o estoque subtraindo a quantidade vendida.
					quantidadeVendida[posicaoProduto] += quantidadeVenda; // Atualiza a quantidade vendida.
					double valorVenda = quantidadeVenda * valorUnitario[posicaoProduto]; // Calcula o valor da venda.
					System.out.println("Produto: " + nomes[posicaoProduto] + " | Valor da venda: " + valorVenda); // Imprime
																													// as
																													// informações
																													// da
																													// venda.
				} else {
					System.out.println("Estoque insuficiente para a venda.");
				}
			} else if (posicaoProduto != 99) {
				System.out.println("Posição inválida. Tente novamente.");
			}
		} while (posicaoProduto != 99);

		System.out.println("\nBalanço de estoque e vendas:\n");
		for (int i = 0; i < numProdutos; i++) {
			System.out.println("Produto: " + nomes[i]); // Imprime o nome do produto.
			System.out.println("Estoque atual: " + estoque[i]); // Imprime a quantidade em estoque atual.
			System.out.println("Vendas: " + quantidadeVendida[i]); // Imprime a quantidade vendida.

			if (estoque[i] < estoqueMinimo[i]) {
				System.out.println("Estado do estoque: Abaixo do mínimo\n"); // Verifica e imprime se o estoque está
																				// abaixo do mínimo.
			} else {
				System.out.println("Estado do estoque: Normal\n"); // Caso contrário, o estoque está normal.
			}
		}

		sc.close(); // Fecha o Scanner.
	}
}
