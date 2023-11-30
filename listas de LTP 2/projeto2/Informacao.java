import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Informacao {

	public static void main(String[] args) {
		String path = "contatos/";
		int op =6;
		Scanner leia = new Scanner(System.in);
		int id = 0;
		
		Contato c = new Contato();

		do {
			menu();
			op = leia.nextInt();
			switch(op) {
			case 1:
				if(Cadastrar(id, path)) {
					id++;	
				};
				break;
			case 2:
			System.out.println("Digite o CPF/CNPJ que deseja buscar: ");
			String cpfBusca = leia.next();
			BuscarPorCpf(cpfBusca, path);
			break;
			case 3:
				ListarInformacao(path);
				break;
			case 4:
				RemoverInformacao(path);
				break;
			case 5:
			System.out.println("Digite o número do processo que deseja reescrever: ");
			int idReescrever = leia.nextInt();
			ReescreverInformacao(idReescrever, path);
				break;
			case 6:
				gravarId(id);
				System.out.println("Saindo...");
				break;				
			}
		}while(op!=6);
	}

	private static boolean Cadastrar(int id, String path) {
		int ope =4;
		Scanner leia = new Scanner(System.in);
		do{
		menuCadastro();
			ope = leia.nextInt();
			switch (ope) {
				case 1:
					if(CadastrarProcesso(id, path)) {
					id++;	
						};
					break;
				case 2:
						if(CadastrarProcesso(id, path)) {
					id++;	
						};
					break;
				
				case 3:
						if(CadastrarProcesso(id, path)) {
						id++;
							};
					break;
				
				case 4:
						System.out.println("Saindo...");
					break;	
			
			}	

		
		}while (ope!=4);
		return true;
	}

	private static boolean CadastrarProcesso(int id, String path){
		Scanner leia = new Scanner(System.in);
		Contato c = new Contato();
		try {
			
	
			if (c != null) {
				System.out.println("Número do processo: ");
				c.id =leia.nextInt();
				leia = new Scanner(System.in);
				System.out.println("Qual o tipo de ação: ");
				c.tipoAcao= leia.nextLine();
				System.out.println("Nome do(a) Autor(a)/Vítima: ");
				c.nomeAutor = leia.nextLine();
				System.out.println("Data de nascimento do(a) Autor(a)/Vítima: ");
				c.dataNascimentoAutor= leia.nextLine();
				System.out.println("Email do(a) Autor(a)/Vítima: ");
				c.emailAutor = leia.nextLine();
				System.out.println("CPF/CNPJ do(a) Autor(a)/Vítima: ");
				c.cpfAutor = leia.nextLine();

				System.out.println("Nome da(o) Ré(u): ");
				c.nomeReu = leia.nextLine();
				System.out.println("Data de nascimento da(o) Ré(u): ");
				c.dateNascimentoReu= leia.nextLine();
				System.out.println("Email da(o) Ré(u): ");
				c.emailReu = leia.nextLine();
				System.out.println("CPF/CNPJ da(o) Ré(u): ");
				c.cpfReu = leia.nextLine();
	
				gravarContato(c, path);
				System.out.println("Contato reescrito com sucesso.");
			} else {
				System.out.println("Contato não encontrado.");
			}
		}

		catch (IOException e) {
			System.out.println("Erro ao cadrastrar informações do Processo.");
			e.printStackTrace();
		}
		try {
			gravarContato(c,path);
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel gravar o Processo");
			e.printStackTrace();
			return false;
		}
		
		return true;


	}

	private static void BuscarPorCpf(String cpf, String path) {
		// Cria um objeto File representando o diretório especificado pelo caminho
		File diretorio = new File(path);
	
		// Verifica se o diretório existe e é um diretório
		if (diretorio.exists() && diretorio.isDirectory()) {
			// Lista todos os arquivos no diretório
			File[] arquivos = diretorio.listFiles();
	
			// Verifica se há arquivos no diretório
			if (arquivos != null && arquivos.length > 0) {
				// Itera sobre cada arquivo no diretório
				for (File arquivo : arquivos) {
					// Verifica se o arquivo atual é um arquivo regular e tem a extensão ".txt"
					if (arquivo.isFile() && arquivo.getName().endsWith(".txt")) {
						try {
							// Lê as informações de contato do arquivo atual
							Contato contato = lerProcesso(Integer.parseInt(arquivo.getName().replace(".txt", "")), path);
	
							// Verifica se o CPF fornecido corresponde ao CPF do contato (autor ou réu)
							if (contato.cpfAutor.equals(cpf) || contato.cpfReu.equals(cpf)) {
								// Exibe os detalhes do processo correspondente
								System.out.println("Processo(s) encontrado(s):");
								System.out.println("Número do Processo: " + contato.id);
								System.out.println("Tipo de Ação: " + contato.tipoAcao);
								System.out.println("Nome do(a) Autor(a)/Vítima: " + contato.nomeAutor);
								System.out.println("Data de Nascimento do(a) Autor(a)/Vítima:" + contato.dataNascimentoAutor);
								System.out.println("Email do(a) Autor(a)/Vítima: " + contato.emailAutor);
								System.out.println("CPF/CNPJ do(a) Autor(a)/Vítima: " + contato.cpfAutor);
								System.out.println("Nome da(o) Ré(u): " + contato.nomeReu);
								System.out.println("Data de Nascimento da(o) Ré(u):" + contato.dateNascimentoReu);
								System.out.println("Email da(o) Ré(u): " + contato.emailReu);
								System.out.println("CPF/CNPJ da(o) Ré(u): " + contato.cpfReu);
								System.out.println("-------------------------");
							}
						} catch (IOException e) {
							System.out.println("Erro ao ler informações do arquivo: " + arquivo.getName());
							e.printStackTrace();
						}
					}
				}
			} else {
				System.out.println("Nenhum processo encontrado.");
			}
		} else {
			System.out.println("Diretório não encontrado.");
		}
	}
	

	private static void ListarInformacao(String path) {
		File diretorio = new File(path);
	
		// Verifica se o diretório existe
		if (diretorio.exists() && diretorio.isDirectory()) {
			File[] arquivos = diretorio.listFiles();
	
			// Verifica se há arquivos no diretório
			if (arquivos != null && arquivos.length > 0) {
				for (File arquivo : arquivos) {
					if (arquivo.isFile() && arquivo.getName().endsWith(".txt")) {
						try {
							Contato contato = lerProcesso(Integer.parseInt(arquivo.getName().replace(".txt", "")), path);
							 System.out.println("Processo(s) encontrado(s):");
	                            System.out.println("Número do Processo: " + contato.id);
	                            System.out.println("Tipo de Ação: " + contato.tipoAcao);
	                            System.out.println("Nome do(a) Autor(a)/Vítima: " + contato.nomeAutor);
	                            System.out.println("Data de Nascimento do(a) Autor(a)/Vítima:" + contato.dataNascimentoAutor);
	                            System.out.println("Email do(a) Autor(a)/Vítima: " + contato.emailAutor);
	                            System.out.println("CPF/CNPJ do(a) Autor(a)/Vítima: " + contato.cpfAutor);
	                            System.out.println("Nome da(o) Ré(u): " + contato.nomeReu);
	                            System.out.println("Data de Nascimento da(o) Ré(u):" + contato.dateNascimentoReu);
	                            System.out.println("Email da(o) Ré(u): " + contato.emailReu);
	                            System.out.println("CPF/CNPJ da(o) Ré(u): " + contato.cpfReu);
	                            System.out.println("-------------------------");
						} catch (IOException e) {
							System.out.println("Erro ao ler informações do arquivo: " + arquivo.getName());
							e.printStackTrace();
						}
					}
				}
			} else {
				System.out.println("Nenhum contato encontrado.");
			}
		} else {
			System.out.println("Diretório não encontrado.");
		}
	}

	private static void RemoverInformacao(String path) {
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Digite o número do processo que deseja remover: ");
		int id = leia.nextInt();
	
		try {
			File arquivo = new File(path + id + ".txt");
	
			if (arquivo.exists()) {
				if (arquivo.delete()) {
					System.out.println("Processo removido com sucesso.");
				} else {
					System.out.println("Falha ao remover o Processo.");
				}
			} else {
				System.out.println("Processo não encontrado.");
			}
		} catch (Exception e) {
			System.out.println("Erro ao remover o Processo.");
			e.printStackTrace();
		}
	}
	
 
	private static void ReescreverInformacao(int id, String path) {
		Scanner leia = new Scanner(System.in);
	
		try {
			Contato c = lerProcesso(id, path);
	
			if (c != null) {
				System.out.println("Número do processo: ");
				c.id =leia.nextInt();

				try {
						File arquivo = new File(path + id + ".txt");
	
						if (arquivo.exists()) {
							if (arquivo.delete()) {
								System.out.println("Processo pronto para ser reescrito.");
							} else {
								System.out.println("Falha ao reescrever o Processo.");
							}
						} else {
							System.out.println("Processo não encontrado.");
						}
					} catch (Exception e) {
						System.out.println("Erro ao remover o Processo.");
						e.printStackTrace();
					}

				leia = new Scanner(System.in);
				System.out.println("Tipo de Ação: ");
				c.tipoAcao= leia.nextLine();
				System.out.println("Nome do(a) autor(a)/Vítima: ");
				c.nomeAutor = leia.nextLine();
				System.out.println("Data de nascimento do(a) autor(a)/Vítima: ");
				c.dataNascimentoAutor= leia.nextLine();
				System.out.println("Email do(a) Autor(a)/Vítima: ");
				c.emailAutor = leia.nextLine();
				System.out.println("CPF/CNPJ do(a) Autor(a)/Vítima: ");
				c.cpfAutor = leia.nextLine();

				System.out.println("Nome do Réu: ");
				c.nomeReu = leia.nextLine();
				System.out.println("Data de nascimento da(o) Ré(u): ");
				c.dateNascimentoReu= leia.nextLine();
				System.out.println("Email da(o) Ré(u): ");
				c.emailReu = leia.nextLine();
				System.out.println("CPF/CNPJ da(o) Ré(u): ");
				c.cpfReu = leia.nextLine();
	
				gravarContato(c, path);
				System.out.println("Processo reescrito com sucesso.");
			} else {
				System.out.println("Processo não encontrado.");
			}
		} catch (IOException e) {
			System.out.println("Erro ao reescrever informações do processo.");
			e.printStackTrace();
		}
	} 

	private static void menu() {
		System.out.println("-------------------------"
				+ "\n1 - Cadastrar"
				+ "\n2 - Buscar"
				+ "\n3 - Listar"
				+ "\n4 - Remover"
				+ "\n5 - Reescrever"
				+ "\n6 - Sair"
				+ "-------------------------");
		
	}

	private static void menuCadastro(){
		System.out.println("-----------------------------"
							+ "\n1 - Vara Cível"
							+ "\n2 - Vara Criminal"
							+ "\n3 - Vara das Fazendas Públicas "
							+ "\n4 - Sair");
	}
	
	private static Contato lerProcesso(int id ,  String path) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader(path+id+".txt"));
		Contato c = new Contato();
		c.id = Integer.parseInt(bf.readLine());
		c.tipoAcao = bf.readLine();
		c.nomeAutor = bf.readLine();
		c.dataNascimentoAutor = bf.readLine();
		c.emailAutor = bf.readLine();
		c.cpfAutor = bf.readLine();
		c.nomeReu = bf.readLine();
		c.dateNascimentoReu = bf.readLine();
		c.emailReu = bf.readLine();
		c.cpfReu = bf.readLine();
		bf.close();
		return c;
	}
/* 
	private static int inicializar(String path) {
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
		}
	
		File arquivo = new File("id.txt");
		int id = 0;  // Declare e atribua um valor inicial a `id` fora do bloco else
	
		if (!arquivo.exists()) {
			try {
				arquivo.createNewFile();
				gravarId(0);
			} catch (IOException e) {
				System.out.println("Não foi possível criar o ID");
				e.printStackTrace();
			}
		} else {
			id = lerId();
		}
	
		return id;
	}
	*/

	private static void gravarContato(Contato c, String path) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(path + c.id + ".txt");
		pw.println(c.id);
		pw.println(c.tipoAcao);
		pw.println(c.nomeAutor);
		pw.println(c.dataNascimentoAutor);
		pw.println(c.emailAutor);
		pw.println(c.cpfAutor);
		pw.println(c.nomeReu);
		pw.println(c.dateNascimentoReu);
		pw.println(c.emailReu);
		pw.println(c.cpfReu);
		pw.flush();
		pw.close();
	}
	private static void gravarId(int id) {
		PrintWriter pw;
		try {
			pw = new PrintWriter("id.txt");
			pw.println(id);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	
}