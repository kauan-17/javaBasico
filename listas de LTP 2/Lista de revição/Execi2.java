    import java.util.*;

public class Execi2 {
	public static void main(String[] args) {
		String texto; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		texto = sc.nextLine();
		String [] dicionario; //vai guardar o dicionario
		int [] compactado; // texto compactado como números
		String reconstruido; //texto reconstruído depois de ser compactado
		
		int quant = contaPalavras(texto);
		System.out.println("Quantidade de palavras: "+ quant);
		
		dicionario = constroiDicionario(texto);
		compactado = codifica(texto,dicionario);
		reconstruido = decodifica(compactado,dicionario);
		compara(texto,reconstruido);
		
		System.out.println("--imprimindo o dicionario");
		imprimeVetor(dicionario);
		System.out.println("\n--imprimindo o texto compactado");
		imprimeVetor(compactado);
		System.out.println("\n--imprimindo o texto reconstruído: ");
		System.out.println(reconstruido);
	}

	private static void imprimeVetor(int[] compactado) {
		for(int i=0; compactado[i]>=0; i++)
			System.out.print(compactado[i]+" ");		
	}

	private static void imprimeVetor(String[] dicionario) {
		for(int i=0; dicionario[i]!=""; i++)
			System.out.print(dicionario[i]+" ");		
	}

	private static void compara(String texto, String reconstruido) {
		int menor = texto.length()>reconstruido.length()? reconstruido.length():texto.length();
		int q=0;
		for(int i=0; i<menor; i++) {
			if(texto.charAt(i)!=reconstruido.charAt(i))
				q++;
		}
		System.out.println("Os textos possuem "+q+" caracteres diferentes");
	}

	private static String decodifica(int[] compactado, String[] dicionario) {
		String s="";
		for(int i=0; compactado[i]>=0;i++) {
			s+=dicionario[compactado[i]] + " "; 
		}
		return s;
	}

	private static int[] codifica(String texto, String[] dicionario) {
		int [] compactado=new int[1000];
		boolean dentro;
		int q=0;
		int inicio;
		String palavra;
		int j=0; //indice do dicionario
		int posicao;
		
		dentro = texto.charAt(0)==' '? false:true;
		inicio=0;
		for(int i=0; i< compactado.length; i++)
			compactado[i]=-1;
		for(int i=0; i<texto.length(); i++) {
			if(dentro && texto.charAt(i)==' ') {				
				dentro=false;
				palavra=texto.substring(inicio,i);
				posicao=encontraPalavra(palavra,dicionario);
				compactado[j++]=posicao;
			}
			if(dentro==false && texto.charAt(i)!=' ') {			
				inicio=i;
				dentro=true;
			}
		}
		palavra = texto.substring(inicio,texto.length());
		if(dentro)
			compactado[j]=encontraPalavra(palavra,dicionario);
				

		return compactado;
	}

	private static String[] constroiDicionario(String texto) {
		String [] dicionario=new String[100];
		boolean dentro;
		int q=0;
		int inicio;
		String palavra;
		int j=0; //indice do dicionario
		
		dentro = texto.charAt(0)==' '? false:true;
		inicio=0;
		for(int i=0; i< dicionario.length; i++)
			dicionario[i]="";
		for(int i=0; i<texto.length(); i++) {
			if(dentro && texto.charAt(i)==' ') {				
				dentro=false;
				palavra=texto.substring(inicio,i);
				if(encontraPalavra(palavra,dicionario)<0)
					dicionario[j++]=palavra;
			}
			if(dentro==false && texto.charAt(i)!=' ') {			
				inicio=i;
				dentro=true;
			}
		}
		palavra = texto.substring(inicio,texto.length());
		if(dentro && encontraPalavra(palavra,dicionario)<0)
				dicionario[j++]=palavra;
				
		return dicionario;
	}

	private static int encontraPalavra(String palavra, String[] dicionario) {
		for(int i=0; i<dicionario.length; i++) 
			if(dicionario[i].equals(palavra))
				return i;
			
		return -1;
	}

	private static int contaPalavras(String texto) {
		boolean dentro;
		int q=0;
		
		dentro = texto.charAt(0)==' '? false:true;
		for(int i=0; i<texto.length(); i++) {
			if(dentro && texto.charAt(i)==' ') {
				q++;
				dentro=false;
			}
			if(dentro==false && texto.charAt(i)!=' ') {
				dentro=true;
			}
		}
		if(dentro)
			q++;
		return q;
	}
}
