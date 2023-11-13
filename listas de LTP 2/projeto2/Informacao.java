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
		
		inicializar(path);
		Contato c = new Contato();
		try {
			gravarContato(c, path);
			Contato contato = lerProcesso(2,path);
			System.out.println("Contato: "+contato.id
					+" "+contato.tipoAcao
					+" "+contato.nomeAutor
					+" "+contato.dataNascimentoAutor
					+" "+contato.emailAutor
					+" "+contato.cpfAutor
					+" "+contato.nomeReu
					+" "+contato.dateNascimentoReu
					+" "+contato.emailReu
					+" "+contato.cpfReu				
					);
		} catch (Exception e) {
			System.out.println("arquivo não pode ser lido/gravado");
			e.printStackTrace();
		}
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
				BuscarProcesso(path);
				break;
			case 3:
				ListarInformacao(path);
				break;
			case 4:
				RemoverInformacao(path);
				break;
			case 5:
			System.out.println("Digite o ID do contato que deseja reescrever:");
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
		System.out.println("Numero do processo: ");
		c.id =leia.nextInt();
		leia = new Scanner(System.in);
		System.out.println("Qual foi a ação ocorrida: ");
		c.tipoAcao= leia.nextLine();
		System.out.println("Nome do autor: ");
		c.nomeAutor = leia.nextLine();
		System.out.println("Data de nascimento do autor: ");
		c.dataNascimentoAutor= leia.nextLine();
		System.out.println("Email do Autor: ");
		c.emailAutor = leia.nextLine();
		System.out.println("CPF do Autor");
		c.cpfAutor = leia.nextLine();

		System.out.println("Nome do Reu: ");
		c.nomeReu = leia.nextLine();
		System.out.println("Data de nascimento do Reu: ");
		c.dateNascimentoReu= leia.nextLine();
		System.out.println("Email Reu: ");
		c.emailReu = leia.nextLine();
		System.out.println("CPF do Reu");
		c.cpfReu = leia.nextLine();

		c.id=id;
		try {
			gravarContato(c,path);
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel gravar o contato");
			e.printStackTrace();
			return false;
		}
		return true;

	}

	private static void BuscarProcesso(String path) {
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Digite o CPF para buscar o processo que deseja buscar:");
		String cpfAutor = leia.nextLine();
	
		try {
			Contato contato = lerContato(cpfAutor, path);
			if (contato != null) {
				System.out.println("Contato encontrado:");
				System.out.println("ID: " + contato.id);
				System.out.println("Tipo da Ação: "+contato.tipoAcao);
				System.out.println("Nome Autor: " + contato.nomeAutor);
				System.out.println("Data de Nascimento do Autor:"+contato.dataNascimentoAutor);
				System.out.println("Email do Autor: "+contato.emailAutor);
				System.out.println("CPF Autor: "+contato.cpfAutor);
				System.out.println("Nome Reu: " + contato.nomeReu);
				System.out.println("Data de Nascimento do Reu:"+contato.dateNascimentoReu);
				System.out.println("Email do Reu: "+contato.emailReu);
				System.out.println("CPF Reu: "+contato.cpfReu);
			} else {
				System.out.println("Contato não encontrado.");
			}
		} catch (IOException e) {
			System.out.println("Erro ao buscar informações do contato.");
			e.printStackTrace();
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
							System.out.println("Contato encontrado:");
							System.out.println("ID: " + contato.id);
							System.out.println("Tipo da Ação: "+contato.tipoAcao);
							System.out.println("Nome Autor: " + contato.nomeAutor);
							System.out.println("Data de Nascimento do Autor:"+contato.dataNascimentoAutor);
							System.out.println("Email do Autor: "+contato.emailAutor);
							System.out.println("CPF Autor: "+contato.cpfAutor);
							System.out.println("Nome Reu: " + contato.nomeReu);
							System.out.println("Data de Nascimento do Reu:"+contato.dateNascimentoReu);
							System.out.println("Email do Reu: "+contato.emailReu);
							System.out.println("CPF Reu: "+contato.cpfReu);
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
	
		System.out.println("Digite o ID do contato que deseja remover:");
		int id = leia.nextInt();
	
		try {
			File arquivo = new File(path + id + ".txt");
	
			if (arquivo.exists()) {
				if (arquivo.delete()) {
					System.out.println("Contato removido com sucesso.");
				} else {
					System.out.println("Falha ao remover o contato.");
				}
			} else {
				System.out.println("Contato não encontrado.");
			}
		} catch (Exception e) {
			System.out.println("Erro ao remover o contato.");
			e.printStackTrace();
		}
	}
	
 
	private static void ReescreverInformacao(int id, String path) {
		Scanner leia = new Scanner(System.in);
	
		try {
			Contato c = lerProcesso(id, path);
	
			if (c != null) {
				System.out.println("Numero do processo: ");
				c.id =leia.nextInt();
				System.out.println("Qual foi a ação ocorrida: ");
				c.tipoAcao= leia.nextLine();
				System.out.println("Nome do autor: ");
				c.nomeAutor = leia.nextLine();
				System.out.println("Data de nascimento do autor: ");
				c.dataNascimentoAutor= leia.nextLine();
				System.out.println("Email do Autor: ");
				c.emailAutor = leia.nextLine();
				System.out.println("CPF do Autor");
				c.cpfAutor = leia.nextLine();

				System.out.println("Nome do Reu: ");
				c.nomeReu = leia.nextLine();
				System.out.println("Data de nascimento do Reu: ");
				c.dateNascimentoReu= leia.nextLine();
				System.out.println("Email Reu: ");
				c.emailReu = leia.nextLine();
				System.out.println("CPF do Reu");
				c.cpfReu = leia.nextLine();
	
				gravarContato(c, path);
				System.out.println("Contato reescrito com sucesso.");
			} else {
				System.out.println("Contato não encontrado.");
			}
		} catch (IOException e) {
			System.out.println("Erro ao reescrever informações do contato.");
			e.printStackTrace();
		}
	} 

	private static void menu() {
		System.out.println("-------------------------"
				+ "\n1 - Cadastrar"
				+ "\n2 - Buscar"
				+ "\n3 - Listar"
				+ "\n4 - Remover"
				+ "\n5 - Reescreve"
				+ "\n6 - Sair"
				+ "-------------------------");
		
	}

	private static void menuCadastro(){
		System.out.println("-----------------------------"
							+ "\n1 - Vara da criança"
							+ "\n2 - Vara da mulher"
							+ "\n3 - Vara do homem"
							+ "\n4 - Sair");
	}

	private static Contato lerContato(String cpfAutor, String path) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader(path + cpfAutor + ".txt"));
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
	

	private static void gravarContato(Contato c, String path) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(path+c.id+".txt");
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
	private static int lerId() {
		BufferedReader bf;
		int id=0;
		try {
			bf = new BufferedReader(new FileReader("id.txt"));
			id = Integer.parseInt(bf.readLine());
			bf.close();
		} catch (IOException | NumberFormatException e) {
			System.err.println("Id não encontrado");
			e.printStackTrace();
		}		
		return id;
	}
}