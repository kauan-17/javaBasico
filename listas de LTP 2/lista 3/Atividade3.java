import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Atividade3 {
public static void main(String[] args) {
        // Definir o número de clusters (k)
        int k = 3;

        // Gerar 100 valores aleatórios
        List<Double> valores = gerarValoresAleatorios(100);

        // Inicializar centróides aleatórios
        List<Double> centroides = inicializarCentroides(valores, k);

        // Executar o algoritmo K-means
        List<List<Double>> clusters = kMeans(valores, centroides);

        // Exibir os clusters resultantes
        exibirClusters(clusters);
    }

    // Gera 100 valores aleatórios entre 0 e 100
    private static List<Double> gerarValoresAleatorios(int quantidade) {
        List<Double> valores = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < quantidade; i++) {
            valores.add(random.nextDouble() * 100);
        }

        return valores;
    }

    // Inicializa k centróides aleatórios a partir dos valores fornecidos
    private static List<Double> inicializarCentroides(List<Double> valores, int k) {
        List<Double> centroides = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < k; i++) {
            int indiceAleatorio = random.nextInt(valores.size());
            centroides.add(valores.get(indiceAleatorio));
        }

        return centroides;
    }

    // Executa o algoritmo K-means
    private static List<List<Double>> kMeans(List<Double> valores, List<Double> centroides) {
        List<List<Double>> clusters;
        boolean mudanca;

        do {
            // Atribui cada valor ao cluster mais próximo
            clusters = atribuirClusters(valores, centroides);

            // Calcula novos centroides como a média de cada cluster
            List<Double> novosCentroides = calcularNovosCentroides(clusters);

            // Verifica se houve mudança nos centroides
            mudanca = !centroides.equals(novosCentroides);

            // Atualiza os centroides
            centroides = novosCentroides;

        } while (mudanca);

        return clusters;
    }

    // Atribui cada valor ao cluster mais próximo
    private static List<List<Double>> atribuirClusters(List<Double> valores, List<Double> centroides) {
        List<List<Double>> clusters = new ArrayList<>();

        for (int i = 0; i < centroides.size(); i++) {
            clusters.add(new ArrayList<>());
        }

        for (Double valor : valores) {
            int indiceClusterMaisProximo = encontrarIndiceClusterMaisProximo(valor, centroides);
            clusters.get(indiceClusterMaisProximo).add(valor);
        }

        return clusters;
    }

    // Encontra o índice do cluster mais próximo para um valor
    private static int encontrarIndiceClusterMaisProximo(Double valor, List<Double> centroides) {
        int indiceClusterMaisProximo = 0;
        double distanciaMinima = Double.MAX_VALUE;

        for (int i = 0; i < centroides.size(); i++) {
            double distancia = Math.abs(valor - centroides.get(i));
            if (distancia < distanciaMinima) {
                distanciaMinima = distancia;
                indiceClusterMaisProximo = i;
            }
        }

        return indiceClusterMaisProximo;
    }

    // Calcula os novos centroides como a média de cada cluster
    private static List<Double> calcularNovosCentroides(List<List<Double>> clusters) {
        List<Double> novosCentroides = new ArrayList<>();

        for (List<Double> cluster : clusters) {
            double media = calcularMedia(cluster);
            novosCentroides.add(media);
        }

        return novosCentroides;
    }

    // Calcula a média de uma lista de valores
    private static double calcularMedia(List<Double> valores) {
        if (valores.isEmpty()) {
            return 0;
        }

        double soma = 0;

        for (Double valor : valores) {
            soma += valor;
        }

        return soma / valores.size();
    }

    // Exibe os clusters resultantes
    private static void exibirClusters(List<List<Double>> clusters) {
        for (int i = 0; i < clusters.size(); i++) {
            System.out.println("Cluster " + (i + 1) + ": " + clusters.get(i));
        }
    }
}
